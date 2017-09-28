/*

package com.solace.RBCTestData;

public class RBC_TestDataGeneratorOLBMobileJCSMP_JSON_DR {

	public RBC_TestDataGeneratorOLBMobileJCSMP_JSON_DR() {
		// TODO Auto-generated constructor stub
	}

}
*/

package com.solace.openshift.demo.datagenerator;

import java.io.ByteArrayOutputStream;
import java.util.LinkedList;
import java.util.UUID;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import com.bank.ecs.EventInputBundleImplService;
import com.solacesystems.jcsmp.BytesXMLMessage;
import com.solacesystems.jcsmp.ClosedFacilityException;
import com.solacesystems.jcsmp.DeliveryMode;
import com.solacesystems.jcsmp.InvalidPropertiesException;
import com.solacesystems.jcsmp.JCSMPChannelProperties;
import com.solacesystems.jcsmp.JCSMPErrorResponseException;
import com.solacesystems.jcsmp.JCSMPErrorResponseSubcodeEx;
import com.solacesystems.jcsmp.JCSMPException;
import com.solacesystems.jcsmp.JCSMPFactory;
import com.solacesystems.jcsmp.JCSMPProducerEventHandler;
import com.solacesystems.jcsmp.JCSMPProperties;
import com.solacesystems.jcsmp.JCSMPSession;
import com.solacesystems.jcsmp.JCSMPStreamingPublishCorrelatingEventHandler;
import com.solacesystems.jcsmp.JCSMPStreamingPublishEventHandler;
import com.solacesystems.jcsmp.JCSMPTransportException;
import com.solacesystems.jcsmp.ProducerEventArgs;
import com.solacesystems.jcsmp.SessionEvent;
import com.solacesystems.jcsmp.SessionEventArgs;
import com.solacesystems.jcsmp.SessionEventHandler;
import com.solacesystems.jcsmp.StaleSessionException;
import com.solacesystems.jcsmp.TextMessage;
import com.solacesystems.jcsmp.Topic;
import com.solacesystems.jcsmp.XMLMessageConsumer;
import com.solacesystems.jcsmp.XMLMessageProducer;

@SuppressWarnings("unused")
public class sendJSONMessageJCSMP_DR implements JCSMPProducerEventHandler {
	
	
	volatile int counter = 0;
	
	EventInputBundleImplService service = null;
	
	  public static int PRETTY_PRINT_INDENT_FACTOR = 4;
	
	Topic topic;
	JCSMPSession session = null;
	XMLMessageProducer prod = null;
	
	final LinkedList<MsgInfo> msgList = new LinkedList<MsgInfo>();
	final LinkedList<MsgInfo> msgListReplay = new LinkedList<MsgInfo>();
	TextMessage textMsg = JCSMPFactory.onlyInstance().createMessage(TextMessage.class);
	TextMessage textMsgReplay = JCSMPFactory.onlyInstance().createMessage(TextMessage.class);
	
	
	JCSMPProperties properties = new JCSMPProperties();
	
	boolean everConnected = false;
	boolean needRecovery = false;

	
	public sendJSONMessageJCSMP_DR(String user, String password, String vpn, String topicString, String host, String port) {
		
		
		
		//JCSMPProperties properties = new JCSMPProperties();
		properties.setProperty(JCSMPProperties.HOST, host + ":" + port);
		properties.setProperty(JCSMPProperties.VPN_NAME, vpn);
		properties.setProperty(JCSMPProperties.USERNAME, user);
		properties.setProperty(JCSMPProperties.PASSWORD, password);
		this.topic = JCSMPFactory.onlyInstance().createTopic(topicString);
		properties.setProperty(JCSMPProperties.MESSAGE_ACK_MODE, JCSMPProperties.SUPPORTED_MESSAGE_ACK_AUTO);
		properties.setProperty(JCSMPProperties.GENERATE_SEQUENCE_NUMBERS, true);
		//needed for DR
		properties.setProperty(JCSMPProperties.GD_RECONNECT_FAIL_ACTION, JCSMPProperties.GD_RECONNECT_FAIL_ACTION_AUTO_RETRY);
		
		JCSMPChannelProperties c_properties = (JCSMPChannelProperties) properties.getProperty(JCSMPProperties.CLIENT_CHANNEL_PROPERTIES);
		c_properties.setConnectRetries(-1);
		c_properties.setConnectRetriesPerHost(0);
		c_properties.setConnectTimeoutInMillis(2000);

		c_properties.setReconnectRetries(-1);	
		c_properties.setReconnectRetryWaitInMillis(2000);

	
		try {
			session = JCSMPFactory.onlyInstance().createSession(properties, null, new PrintingSessionEventHandler());
			
		} catch (InvalidPropertiesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prod = session.getMessageProducer(new PubCallback());
		} catch (JCSMPException e) {
			//possible there was a DR fail-over
			
			e.printStackTrace();
		}

		
	}
	

	public void sendJSON_JCSMP(ByteArrayOutputStream soapArrayOut) {//throws ClientProtocolException, IOException {
		

		if(needRecovery  || msgListReplay.size() > 0) {
			needRecovery = handleRecovery();
		}
		
		if(counter % 500 == 0 && counter != 0)
			System.out.println("Sent " + counter + " messages .......");

		JSONObject jsonObject = null;
		String jsonText = null;
		try {
			 jsonObject = XML.toJSONObject(soapArrayOut.toString());
			 jsonText = jsonObject.toString(PRETTY_PRINT_INDENT_FACTOR);
			 
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//System.out.println(jsonText);
		
		
		//TextMessage textMsg = JCSMPFactory.onlyInstance().createMessage(TextMessage.class);
		//textMsg.setText(soapArrayOut.toString());
		//textMsg.clearAttachment();
		//textMsg.clearContent();
		textMsg.reset();
		textMsg.setText(jsonText);
		textMsg.setDeliveryMode(DeliveryMode.PERSISTENT);
		textMsg.setDeliverToOne(true);
		//textMsg.setApplicationMessageId(UUID.randomUUID().toString());
		textMsg.setApplicationMessageId(Integer.toString(counter));
		
		
		// The application can keep track of published messages using a
		// list. In this case, wrap the message in a MsgInfo instance, and
		// use it as a correlation key.
		
		final MsgInfo msgCorrelationInfo = new MsgInfo(counter + 1);
		msgCorrelationInfo.sessionIndependentMessage = textMsg;
		msgList.add(msgCorrelationInfo);

		// Set the message's correlation key. This reference
		// is used when calling back to responseReceivedEx().
		textMsg.setCorrelationKey(msgCorrelationInfo);
		
		try {
			prod.send(textMsg, topic);
			//System.out.println("Sent: " + msgCorrelationInfo.id);
		} catch (StaleSessionException ex) {
            //Session lost connection and stopped attempting reconnecting.
            //NOTE: The session will never stop attempting reconnecting until
            //      cp.setReconnectRetries(-1) is set to zero or a finite value
            //      in the createSession method.
            System.out.println("+++++++++Stale Conenction: " + ex.getMessage());

            //The session and producer will get rebuilt once handleErrorEx
            //receive the JCSMPTransportException that made this producer go
            //stale.
        } catch (ClosedFacilityException ex) {
            //The session was closed
            //Call session.closeSession() in the above for loop to get this
            //exception.  Calling close() for the producer will also
            //cause this exception to happen.
            System.out.println(ex.getMessage());
            
            //The application closed the session, so do not attempt to
            //reconnect the session.
            System.exit(1);
        } catch (JCSMPException ex) {
            System.out.println(ex.getMessage());
            if (!everConnected) {
                System.exit(1);
            }
        } catch (Exception ex) {
            System.err.println("Encountered an Exception... " + ex.getMessage());
            System.exit(1);
        }

		counter++;

	}
	

	/*
	 * A streaming producer can provide this callback handler to handle ack
	 * events.
	 */
	class PubCallback implements JCSMPStreamingPublishCorrelatingEventHandler {
		

		public void handleErrorEx(Object key, JCSMPException cause, long timestamp) {
			// During DR fail-over you may still be connected the broker that is now in standby and tried to send a message, keep message for replay
			// after fail-over for DR complete
			System.out.println("+++++++++++++++++++++++++in JCSMPStreamingPublishCorrelatingEventHandler in error handler");
			if (key instanceof MsgInfo) {
				MsgInfo i = (MsgInfo) key;
				i.acked = false;
				System.out.printf("Message response (rejected) received for %s, error was %s \n", i, cause);
				msgList.remove(i); // should be part of replay
				msgListReplay.add(i);
				needRecovery = true; //need recovery for sure
			}

		}

		public void responseReceivedEx(Object key) {
			
			if (key instanceof MsgInfo) {
				MsgInfo i = (MsgInfo) key;
				i.acked = true;
				//System.out.printf("Message response (accepted) received for %s \n", i.id);
				//System.out.println("Sequence number: " + i.sessionIndependentMessage.getSequenceNumber());
				msgList.remove(i);
				//System.out.println("Size of msgList: " + msgList.size());
			}
			
		}

		public void handleError(String messageID, JCSMPException cause, long timestamp) {
			// Never called
		}

		public void responseReceived(String messageID) {
			// Never called
		}
	}
	
	/*
	 * A correlation structure. This structure is passed back to the
	 * publisher event callback when the message is acknowledged or rejected.
	 */
	class MsgInfo {
		public volatile boolean acked = false;
		public BytesXMLMessage sessionIndependentMessage = null;
		public final long id;

		public MsgInfo(long id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return String.valueOf(this.id);
		}
	}

	public class PrintingSessionEventHandler implements SessionEventHandler {


		public void handleEvent(SessionEventArgs event) {
			System.out.printf("Received Session Event %s with info %s\n", event.getEvent(), event.getInfo());
			//System.out.println("Number of unprocessed acks from appliance: " + msgList.size());
			// Received event possibly due to DR fail-ver complete
			if(event.getEvent() == SessionEvent.VIRTUAL_ROUTER_NAME_CHANGED && msgList.size() != 0) {
				needRecovery = true; // may or may not need recovery
			}
			everConnected = true;
			//sem.release();

		}
	}

	
	@Override
	public void handleEvent(ProducerEventArgs event) {
		System.out.println("Event= " + event.getEvent() +"; Info= " + event.getInfo());
		
	}
	
	
	public boolean  handleRecovery() {
		

		System.out.println("Replaying this many messages that could not be processed before DR: " + msgListReplay.size() + " with this many unacked: " + msgList.size());
		
		if( msgList.peekFirst() != null)
			System.out.println("First unacked from list: " + msgList.peekFirst().id + " last message from list: " + msgList.peekLast().id);
		
		while(msgListReplay.peek() != null) {
			
			// Send messages that were not acked before DR fail-over
			MsgInfo msgReplay = msgListReplay.poll();
			long oldID = msgReplay.id;

			
			textMsgReplay.reset();
			textMsgReplay = (TextMessage) msgReplay.sessionIndependentMessage;
			
			
			//msgReplay.sessionIndependentMessage = textMsgReplay;
	
			msgList.add(msgReplay);
			
			//msgCorrelationInfo.sessionIndependentMessage = textMsgReplay;
			//msgCorrelationInfo.id = 
		//	msgList.add(msgCorrelationInfo);

			// Set the message's correlation key. This reference
			// is used when calling back to responseReceivedEx().
			textMsgReplay.setCorrelationKey(msgReplay);
			//System.out.println("Removing old message with ID: " + oldID + " and replaying with new ID: " + msgCorrelationInfo.id);
			try {
				prod.send(textMsgReplay, topic);
				System.out.println("Replay message sent with ID: " + msgReplay.id);
				//msgReplay.acked = true; // use this to remove message from active list after it is replayed 
			} catch (StaleSessionException ex) {
				//Session lost connection and stopped attempting reconnecting.
				//NOTE: The session will never stop attempting reconnecting until
				//      cp.setReconnectRetries(-1) is set to zero or a finite value
				//      in the createSession method.
				System.out.println(ex.getMessage());

				//The session and producer will get rebuilt once handleErrorEx
				//receive the JCSMPTransportException that made this producer go
				//stale.
			} catch (ClosedFacilityException ex) {
				//The session was closed
				//Call session.closeSession() in the above for loop to get this
				//exception.  Calling close() for the producer will also
				//cause this exception to happen.
				System.out.println(ex.getMessage());

				//The application closed the session, so do not attempt to
				//reconnect the session.
				System.exit(1);
			} catch (JCSMPException ex) {
				System.out.println(ex.getMessage());
					System.exit(1);
		
			} catch (Exception ex) {
				System.err.println("Encountered an Exception... " + ex.getMessage());
				System.exit(1);
			}
			
		}
		return false;

	}

	


}
