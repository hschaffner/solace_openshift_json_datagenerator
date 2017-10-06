/** 
 *  Copyright 2009-2017 Solace Systems, Inc. All rights reserved
 *  
 *  http://www.solace.com
 *  
 *  This source is distributed WITHOUT ANY WARRANTY or support;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 *  A PARTICULAR PURPOSE.  All parts of this program are subject to
 *  change without notice including the program's CLI options.
 *
 *  Unlimited use and re-distribution of this unmodified source code is   
 *  authorized only with written permission.  Use of part or modified  
 *  source code must carry prominent notices stating that you modified it, 
 *  and give a relevant date.
 */


package com.solace.openshift.demo.datagenerator;


//import javax.imageio.IIOException;

import com.solacesystems.jcsmp.BytesXMLMessage;
import com.solacesystems.jcsmp.InvalidPropertiesException;
import com.solacesystems.jcsmp.JCSMPChannelProperties;
import com.solacesystems.jcsmp.JCSMPException;
import com.solacesystems.jcsmp.JCSMPFactory;
import com.solacesystems.jcsmp.JCSMPProperties;
import com.solacesystems.jcsmp.JCSMPSession;
import com.solacesystems.jcsmp.TextMessage;
import com.solacesystems.jcsmp.Topic;
import com.solacesystems.jcsmp.XMLMessageConsumer;
import com.solacesystems.jcsmp.XMLMessageListener;

public class SolaceTestListener implements XMLMessageListener {

	String[] arg = null;
	JCSMPSession session = null;
	XMLMessageConsumer cons = null;
	int counter = 0;

	public SolaceTestListener(String[] args)  {
		this.arg = args;
	}

	public static void main(String[] args) {
		SolaceTestListener stl = new SolaceTestListener(args);
		stl.run();
		

	}

	@Override
	public void onException(JCSMPException arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onReceive(BytesXMLMessage msg) {
		if(msg instanceof TextMessage) {
			System.out.println("\nTextMessage:  " + counter++ + "\n");
			//System.out.println("AckMessageID: " + msg.getAckMessageId());
			//System.out.println(((TextMessage) msg).getText());
			System.out.println(msg.dump().toString());
		}
		else {
			System.out.println("\n============================= Was not a Text Message!!!\n");
		}
		
	}
	
	public void run() {
		JCSMPProperties properties = new JCSMPProperties();
		 properties.setProperty(JCSMPProperties.HOST, this.arg[0]);
		 properties.setProperty(JCSMPProperties.USERNAME, arg[1]);
		 properties.setProperty(JCSMPProperties.PASSWORD, arg[2]);
		 properties.setProperty(JCSMPProperties.VPN_NAME, arg[3]);
		 properties.setProperty(JCSMPProperties.REAPPLY_SUBSCRIPTIONS, true);
		 
		 JCSMPChannelProperties c_properties = (JCSMPChannelProperties) properties.getProperty(JCSMPProperties.CLIENT_CHANNEL_PROPERTIES);
			c_properties.setConnectRetries(100);
			c_properties.setConnectRetriesPerHost(1);
			c_properties.setConnectRetries(-1);
		 
		 try {
			session =  JCSMPFactory.onlyInstance().createSession(properties);
		} catch (InvalidPropertiesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		Topic topic = JCSMPFactory.onlyInstance().createTopic(arg[4]);
		try {
			cons = session.getMessageConsumer(this);
			session.addSubscription(topic);
			cons.start();
		} catch (JCSMPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (true) {
			try{ Thread.sleep(1000000000); } catch(InterruptedException io) {}
		}
		 
		
	}

}
