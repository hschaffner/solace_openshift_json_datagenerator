package com.solace.openshift.demo.datagenerator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.apache.commons.codec.binary.Base64;
//import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
//import org.apache.http.ParseException;
//import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
//import org.apache.http.protocol.BasicHttpContext;
//import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.bank.ecs.EventInputBundleImplService;
@SuppressWarnings("unused")
public class sendSOAPMessage {
	
	String authString;
	String authStringEnc;
	int counter = 0;
	HttpClient client = null;
	HttpHost targetHost = null;
	CloseableHttpClient httpclient = null;
	HttpPost httppost = null;
	EventInputBundleImplService service = null;
	
	public sendSOAPMessage(String user, String password, String url, String host, String port) {
		
		//String authString = "heinz1:heinz1";
		authString = user + ":" + password;
		//System.out.println("AuthString: " + authString);
		//this.authString = authString;
		byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
		authStringEnc = new String(authEncBytes);
		client = HttpClientBuilder.create().build();
		//System.out.println("Host: " + host + " posrt: " + port);
		targetHost = new HttpHost(host, Integer.valueOf(port), "http");
		httpclient = HttpClients.createDefault();
		//httppost = new HttpPost("/TOPIC/test/REST");
		//System.out.println("usr: " + url);
		httppost = new HttpPost(url);
		httppost.addHeader("Authorization", "Basic " + authStringEnc);
		httppost.setHeader("Content-Type", "text/plain");
		System.out.println("Starting Test .........");
		service = new EventInputBundleImplService();
		
	}

	public void sendSOAP(ByteArrayOutputStream soapArrayOut) {//throws ClientProtocolException, IOException {
		
	
		//BasicHttpContext localcontext = null;
		HttpEntity httpEntity = null;
		
		if(counter % 500 == 0 && counter != 0)
			System.out.println("Sent " + counter + " messages .......");

		//StringEntity stringEntity = new StringEntity("This is a REST message sent to the Solace Appliance with a count of " + counter++ + " !","UTF-8");
		StringEntity stringEntity = new StringEntity(soapArrayOut.toString(), "UTF-8");
		//stringEntity.setContentType("text/plain");
		//httppost.setHeader("Content-Type", "application/soap+xml");
		//httppost.setHeader("Content-Type", "text/plain");
		httpEntity = stringEntity;

		// Sending a binary message
		//          String bytesContent = Helpers.createGeneratedBytesDoc(30);
		//          ByteArrayEntity bytesEntity = new ByteArrayEntity(bytesContent.getBytes());
		//          bytesEntity.setContentType("application/octet-stream");
		//          httpEntity = bytesEntity;

		// Request / reqply header.
		//httppost.addHeader("Solace-Reply-Wait-Time-In-ms", "10000");
		//httppost.addHeader("Authorization", "Basic " + authStringEnc);
		//httppost.addHeader("Solace-Correlation-ID","1234");
		//httppost.addHeader("Solace-User-Property-SOAPAction", "1;type=strng");
		httppost.setEntity(httpEntity);
		//try { Thread.sleep(10000000); } catch (InterruptedException e) {}

		//CloseableHttpResponse response = httpclient.execute(targetHost, httppost, localcontext);
		CloseableHttpResponse response = null;;
		try {
			response = httpclient.execute(targetHost, httppost);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			response.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		counter++;

	}
	
	public void formSOAPandSend(ByteArrayOutputStream out) {
		SOAPMessage soapMsg = null;
		//HttpEntity httpEntity = null;
		//EventInputBundleImplService service = new EventInputBundleImplService();
		//System.out.println("WSDL Info:" + service.getServiceName().getLocalPart());

		StringBuffer sb = new StringBuffer(out.toString());
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		docBuilderFactory.setNamespaceAware(true);
		DocumentBuilder docBuilder = null;;
		Document xml = null;
		try {
			docBuilder = docBuilderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			xml = docBuilder.parse(new InputSource(new StringReader(sb.toString())));
		} catch (SAXException e1 ) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		

		MessageFactory factory;
		try {
			factory = MessageFactory.newInstance();
			soapMsg = factory.createMessage();
			SOAPPart part = soapMsg.getSOAPPart();
			SOAPEnvelope envelope = part.getEnvelope();
			SOAPHeader header = envelope.getHeader();
			SOAPBody body = envelope.getBody();

			body.addDocument(xml);

			header.addTextNode("RBC Test Data");

			//FileOutputStream fOut = new FileOutputStream("SoapMessage.xml");      
			//soapMsg.writeTo(fOut);
			
			///Uncomment this if you want to see messages dumped to screen
			//soapMsg.writeTo(System.out);

		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		/*
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		

		ByteArrayOutputStream soapArrayOut = new ByteArrayOutputStream();
		try {
			soapMsg.writeTo(soapArrayOut);
		} catch (SOAPException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Sending a test message
		sendSOAP(soapArrayOut);
	}



}
