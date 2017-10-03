package com.solace.openshift.demo.datagenerator;

import java.io.ByteArrayOutputStream;
import java.util.LinkedList;
import java.util.UUID;
//import java.util.logging.Logger;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import com.bank.ecs.EventInputBundleImplService;
import com.solacesystems.jcsmp.BytesXMLMessage;
import com.solacesystems.jcsmp.DeliveryMode;
import com.solacesystems.jcsmp.InvalidPropertiesException;
import com.solacesystems.jcsmp.JCSMPChannelProperties;
import com.solacesystems.jcsmp.JCSMPException;
import com.solacesystems.jcsmp.JCSMPFactory;
import com.solacesystems.jcsmp.JCSMPProducerEventHandler;
import com.solacesystems.jcsmp.JCSMPProperties;
import com.solacesystems.jcsmp.JCSMPSession;
import com.solacesystems.jcsmp.JCSMPStreamingPublishCorrelatingEventHandler;
import com.solacesystems.jcsmp.JCSMPStreamingPublishEventHandler;
import com.solacesystems.jcsmp.ProducerEventArgs;
import com.solacesystems.jcsmp.SessionEventArgs;
import com.solacesystems.jcsmp.SessionEventHandler;
import com.solacesystems.jcsmp.SpringJCSMPFactory;
import com.solacesystems.jcsmp.TextMessage;
import com.solacesystems.jcsmp.Topic;
import com.solacesystems.jcsmp.XMLMessageProducer;

//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SuppressWarnings("unused")
public class sendJSONMessageJCSMP implements JCSMPProducerEventHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(sendJSONMessageJCSMP.class);
	
	int counter = 0;
	
	EventInputBundleImplService service = null;
	
	  public static int PRETTY_PRINT_INDENT_FACTOR = 4;
	
	Topic topic;
	
	SpringJCSMPFactory solaceFactory = null;
	JCSMPSession session = null;
	XMLMessageProducer prod = null;
	
	final LinkedList<MsgInfo> msgList = new LinkedList<MsgInfo>();
	TextMessage textMsg = JCSMPFactory.onlyInstance().createMessage(TextMessage.class);

	
	public sendJSONMessageJCSMP(SpringJCSMPFactory _solaceFactory) {
		
		this.solaceFactory = _solaceFactory;
		
		if( System.getenv("MSG_TOPIC") !=null) {
			this.topic = JCSMPFactory.onlyInstance().createTopic(System.getenv("MSG_TOPIC"));
			logger.info("Publishing Topic is set to: " + this.topic);
		} else {
			this.topic = JCSMPFactory.onlyInstance().createTopic("bank/data/json");
			logger.info("Publishing Topic is set to: " + this.topic);
		}
		
		
		try {
			session = solaceFactory.createSession(null, new PrintingSessionEventHandler());
			
		} catch (InvalidPropertiesException e) {
			logger.info("================================" +e.getLocalizedMessage());
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

		textMsg.clearAttachment();
		textMsg.clearContent();
		textMsg.setText(jsonText);
		textMsg.setDeliveryMode(DeliveryMode.PERSISTENT);
		textMsg.setDeliverToOne(true);
		textMsg.setApplicationMessageId(UUID.randomUUID().toString());
		
		
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
		} catch (JCSMPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		counter++;

	}
	

	/*
	 * A streaming producer can provide this callback handler to handle ack
	 * events.
	 */
	class PubCallback implements JCSMPStreamingPublishCorrelatingEventHandler {

		public void handleErrorEx(Object key, JCSMPException cause, long timestamp) {
			if (key instanceof MsgInfo) {
				MsgInfo i = (MsgInfo) key;
				i.acked = true;
				System.out.printf("Message response (rejected) received for %s, error was %s \n", i, cause);
				msgList.remove(i);
				
			}
		}

		public void responseReceivedEx(Object key) {
			
			if (key instanceof MsgInfo) {
				MsgInfo i = (MsgInfo) key;
				i.acked = true;
				//System.out.printf("Message response (accepted) received for %s \n", i);
				msgList.remove(i);
				//System.out.println("Size of msgList: " + msgList.size());
				//System.out.println("Msg Remove");
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
            logger.info("Received Session Event %s with info %s\n", event.getEvent(), event.getInfo());
            
        }
	}

	@Override
	public void handleEvent(ProducerEventArgs event) {
		System.out.println("Event= " + event.getEvent() +"; Info= " + event.getInfo());
		logger.info("Event= " + event.getEvent() +"; Info= " + event.getInfo());
		
	}

	


}
