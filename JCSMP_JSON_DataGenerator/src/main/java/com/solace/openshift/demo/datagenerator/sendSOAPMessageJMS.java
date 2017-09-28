package com.solace.openshift.demo.datagenerator;

import java.io.ByteArrayOutputStream;
import java.util.LinkedList;




import com.bank.ecs.EventInputBundleImplService;

import java.util.Hashtable;
import java.util.LinkedList;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.ConnectionMetaData;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.solacesystems.jms.SolConnectionFactory;
import com.solacesystems.jms.SolJmsUtility;
import com.solacesystems.jms.SupportedProperty;
import com.solacesystems.jms.impl.SolJMSErrorCodes;

public class sendSOAPMessageJMS  {


	private static final String SOLJMS_INITIAL_CONTEXT_FACTORY = "com.solacesystems.jndi.SolJNDIInitialContextFactory";

	int counter = 0;

	EventInputBundleImplService service = null;

	public static int PRETTY_PRINT_INDENT_FACTOR = 4;


	MessageProducer producer = null;

	Session session = null;
	
	private UnackedList unackedlist = new UnackedList();




	public sendSOAPMessageJMS(String user, String password, String vpn, String topicString, String host, String cfJNDIName, String port) {


		// The client needs to specify both of the following properties:
		Hashtable<String, Object> env = new Hashtable<String, Object>();
		env.put(InitialContext.INITIAL_CONTEXT_FACTORY, SOLJMS_INITIAL_CONTEXT_FACTORY);
		env.put(InitialContext.PROVIDER_URL, "smf://" + host + ":" + port);
		env.put(Context.SECURITY_PRINCIPAL, user);
		env.put(Context.SECURITY_CREDENTIALS, password);
		env.put(SupportedProperty.SOLACE_JMS_SSL_VALIDATE_CERTIFICATE, false);  // enables the use of smfs://  without specifying a trust store

		if (vpn != null) 
			env.put(SupportedProperty.SOLACE_JMS_VPN, vpn);

		// InitialContext is used to lookup the JMS administered objects.
		InitialContext initialContext = null;

		// JMS Connection
		Connection connection = null;


		// Create InitialContext.
		try {
			initialContext = new InitialContext(env);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Lookup ConnectionFactory.
		ConnectionFactory cf = null;
		try {
			cf = (ConnectionFactory)initialContext.lookup(cfJNDIName);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Create connection.
		try {
			connection = cf.createConnection();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		// Print version information.
		ConnectionMetaData metadata = null;
		try {
			metadata = connection.getMetaData();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(metadata.getJMSProviderName() + " " + metadata.getProviderVersion());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/

		// Create a non-transacted, Auto Ack session.

		try {
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Destination destination = null;
		// Lookup Topic.
		if (topicString != null) {
			try {
				destination = (Destination)initialContext.lookup(topicString);
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		// From the session, create a producer for the destination.
		// Use the default delivery mode as set in the connection factory
		try {
			producer = session.createProducer(destination);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}

	public void sendSOAP_JMS(ByteArrayOutputStream soapArrayOut) {//throws ClientProtocolException, IOException {



		if(counter % 500 == 0 && counter != 0)
			System.out.println("Sent " + counter + " messages .......");

		

		TextMessage textMsg = null;
		try {
			textMsg = session.createTextMessage(soapArrayOut.toString());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			textMsg.setBooleanProperty(SupportedProperty.SOLACE_JMS_PROP_DELIVER_TO_ONE, true);
			textMsg.setJMSDeliveryMode(DeliveryMode.PERSISTENT);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			textMsg.setJMSCorrelationID("Message " + counter);
			unackedlist.add(textMsg);
			producer.send(textMsg);
			unackedlist.remove(textMsg.getJMSCorrelationID());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		try {
			System.out.println(textMsg.getText());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/

		counter++;

	}



	public class UnackedList {

		private LinkedList<Message> mylist = new LinkedList<Message>();

		synchronized public void add(Message msg) {
			mylist.add(msg);
		}

		synchronized public void remove(String key) throws JMSException {
			for(int i = 0; i < mylist.size(); i++) {
				Message msg = mylist.get(i);
				if ((msg.getJMSCorrelationID() != null) &&
						(msg.getJMSCorrelationID().equals(key))) {
					mylist.remove(i);
					return;
				}
			}
			throw new IllegalArgumentException("Message for key \"" + key + "\" not found");
		}

		synchronized public Message[] get() {
			Message[] msgs = new Message[mylist.size()];
			for(int i = 0; i < mylist.size(); i++) {
				msgs[i] = mylist.get(i);
			}
			return msgs;
		}

		synchronized public String toString() {
			if (mylist.size() == 0) {
				return "Unacked List Empty";
			} else {
				StringBuffer buf = new StringBuffer("UnackedList= ");
				for(int i = 0; i < mylist.size(); i++) {
					if (i > 0) {
						buf.append(",");
					}
					try {
						buf.append(mylist.get(i).getJMSCorrelationID());
					} catch (JMSException e) {
					}
				}
				return buf.toString();
			}
		}
	}






}

