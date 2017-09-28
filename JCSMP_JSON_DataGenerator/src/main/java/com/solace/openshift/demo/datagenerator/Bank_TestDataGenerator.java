package com.solace.openshift.demo.datagenerator;

import java.io.ByteArrayOutputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.io.OutputStream;
import java.io.StringReader;
//import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
//import java.util.TimeZone;

import java.util.UUID;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
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
import javax.xml.validation.SchemaFactory;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.bank.ecs.ArrayOfEvtInputLayout;
import com.bank.ecs.EventInputBundleImplService;
import com.bank.ecs.RunEventInputBundle;

import ecs.data.EVTINPUTBUNDLE;
import ecs.data.EvtInputLayout;


public class Bank_TestDataGenerator {

	SchemaFactory sf = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema"); 
	private static int counter = 0;
	//private static String url = "http://www.apache.org/";
	private static Map<Integer, String> appCode = new HashMap<Integer, String>();
	private static Map<Integer, String> computerCenterCode = new HashMap<Integer, String>();

	public static void main(String[] args) {

		SOAPMessage soapMsg = null;

		//appCode choices
		appCode.put(1, "CK00");
		appCode.put(2, "1000");
		appCode.put(3, "5E00");
		appCode.put(4, "HN00");
		appCode.put(5, "5Q00");
		appCode.put(6, "JC00");
		appCode.put(7, "UAK0");
		appCode.put(8, "VLV0");
		appCode.put(9, "UAW0");
		appCode.put(10, "UHY0");
		appCode.put(11, "YEY0");

		computerCenterCode.put(1,  "2");
		computerCenterCode.put(2,  "3");
		computerCenterCode.put(3,  "6");



		/*
		Date date = new Date();
		XMLGregorianCalendar xmlDate = null;
		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		String strDate=dateFormat.format(date);
		try {
			xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(strDate);

		}
		catch (  DatatypeConfigurationException e) {
			throw new RuntimeException(e);
		}
		*/


		String authString = "RBC_REST:RBC_REST";
		byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());

		String authStringEnc = new String(authEncBytes);

		// Create a method instanc
		//HttpHost targetHost = new HttpHost("69.20.234.126", 20010, "http");
		HttpHost targetHost = new HttpHost("160.101.136.83", 20010, "http");
		CloseableHttpClient httpclient = HttpClients.createDefault();


		//ClassLoader cl_ecs = com.rbc.ecs.ObjectFactory.class.getClassLoader();
		ClassLoader cl_ecsData = ecs.data.ObjectFactory.class.getClassLoader();


		//JAXBContext jc_ecs = null;
		JAXBContext jc_ecsData = null;;
		try {

			jc_ecsData = JAXBContext.newInstance("ecs.data", cl_ecsData);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		Marshaller jaxbMarshallerEcsData = null;


		try {

			HttpPost httppost = new HttpPost("/TOPIC/test/REST");
			HttpEntity httpEntity = null;
			httppost.addHeader("Authorization", "Basic " + authStringEnc);
			try {
				jaxbMarshallerEcsData = jc_ecsData.createMarshaller();
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//AN array of actual event records. There can be up to 100 in a message record, but for testing we limit to 5
			ArrayOfEvtInputLayout arrayEvents = null;
			EVTINPUTBUNDLE evtBundle = null;

			while(true) {
				//Create a input record
				int numRecords = randInt(1,5);
				System.out.println("Number of records: " + numRecords);
				arrayEvents = new ArrayOfEvtInputLayout();
				String acctCode = "AccountCode_" + randInt(1,100);
				while(numRecords != 0){

					//Create the XML Payload for the SOAP message
					ecs.data.ObjectFactory reqLayout = new  ecs.data.ObjectFactory();
					EvtInputLayout dataRecord = reqLayout.createEvtInputLayout();
					//JAXBElement<String> EvtId = reqLayout.createEvtInputLayoutEvtId(String.valueOf(counter++));
					JAXBElement<String> EvtId = reqLayout.createEvtInputLayoutEvtId(String.valueOf(GUUID()));
					dataRecord.setEvtId(EvtId);
					dataRecord.setEvtAcctAppSysAppCd(reqLayout.createEvtInputLayoutEvtAcctAppSysAppCd(acctCode));
					dataRecord.setEvtProcessingCentre(reqLayout.createEvtInputLayoutEvtProcessingCentre(appCode.get(randInt(1,5))));
					dataRecord.setEvtDate(dateToXml(new Date()));
					dataRecord.setEvtTime(timeToXml(new Date()));
					dataRecord.setEvtMsgVersion("1.0");
					dataRecord.setEvtAmountCad(reqLayout.createEvtInputLayoutEvtAmountCad( Integer.toString(randInt(0,1000)) + "." + Integer.toString(randInt(0,99))));



					//Add the record to an array of input events, up to 100
					arrayEvents.getEvtInputLayout().add(dataRecord);

					numRecords--;
				}

				//Create the bundle of inputevents object
				evtBundle = new EVTINPUTBUNDLE();
				evtBundle.setEvtInputLayouts(arrayEvents);




				//Create SOAP XML payload
				RunEventInputBundle dataMsg = new RunEventInputBundle();
				dataMsg.setEventInputBundle(evtBundle);




				//String SOAP_Payload = null;
				ByteArrayOutputStream out= new ByteArrayOutputStream();

				try {
					jaxbMarshallerEcsData.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);


				} catch (PropertyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


				try {
					//jaxbMarshallerEcsData.marshal(dataMsg, System.out);
					jaxbMarshallerEcsData.marshal(dataMsg, out);
					//System.out.println("SOAP Body:\n" + out.toString("ISO-8859-1") + "\n");


				} 

				catch (JAXBException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 


				EventInputBundleImplService service = new EventInputBundleImplService();
				System.out.println("WSDL Info:" + service.getServiceName().getLocalPart());

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
				} catch ( IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SAXException  e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				//String xml = "<![CDATA[" + out.toString() + "]]>";

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

					soapMsg.writeTo(System.out);

				} catch (SOAPException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				ByteArrayOutputStream soapArrayOut = new ByteArrayOutputStream();
				soapMsg.writeTo(soapArrayOut);

				// Sending a test message
				StringEntity stringEntity = new StringEntity(soapArrayOut.toString(), "UTF-8");
				//stringEntity.setContentType("text/plain");
				httpEntity = stringEntity;
				httppost.setEntity(httpEntity);
				httppost.setHeader("Content-Type", "application/soap+xml");
				//httppost.setHeader("Content-Type", "text");

				CloseableHttpResponse response = httpclient.execute(targetHost, httppost);
				HttpEntity entity = response.getEntity();

				StringBuilder sbOut = new StringBuilder();
				sbOut.append("\n********************************\n");
				sbOut.append("Received:\n");
				sbOut.append(response.getStatusLine() + "\n");

				Header[] headers = response.getAllHeaders();
				for (Header currHeader : headers) {
					sbOut.append(currHeader.getName() + ": " + currHeader.getValue() + "\n");
				}
				sbOut.append(EntityUtils.toString(entity) + "\n");
				System.out.println(sbOut.toString());
				response.close();
				try { Thread.sleep(1000); } catch (InterruptedException e) {}




			}


		} catch (ClientProtocolException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SOAPException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				httpclient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}








	}

	public static UUID GUUID(){
		//generate random UUIDs
		return UUID.randomUUID();
	}

	public static int randInt(int min, int max) {

		// Usually this can be a field rather than a method variable
		Random rand = new Random();

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

	public static XMLGregorianCalendar dateToXml(Date date){
		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		String strDate=dateFormat.format(date);
		try {
			XMLGregorianCalendar xmlDate=DatatypeFactory.newInstance().newXMLGregorianCalendar(strDate);
			return xmlDate;
		}
		catch (  DatatypeConfigurationException e) {
			throw new RuntimeException(e);
		}
	}

	public static XMLGregorianCalendar timeToXml(Date date){
		/*
		TimeZone utc = TimeZone.getTimeZone("EST");
		DateFormat dateFormat=new SimpleDateFormat("HH:mm:ss.sss");
		dateFormat.setTimeZone(utc);
		String strDate=dateFormat.format(date);
		System.out.println(strDate);
		try {
			XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(strDate);
			return xmlDate;
		}
		catch (  DatatypeConfigurationException e) {
			throw new RuntimeException(e);
		}
		 */
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		DatatypeFactory datatypeFactory = null;
		try {
			datatypeFactory = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XMLGregorianCalendar now = 
				datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
		return now;
	}
	
	public static void signInOLB() {
		
	}
	
	public static void signInMobile() {
		
	}
	
	public static void transactionPayBillOLB() {
		
	}
	
	public static void transactionPayBillMobile() {
		
	}







}
