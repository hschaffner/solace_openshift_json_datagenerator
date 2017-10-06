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



import java.io.ByteArrayOutputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.io.OutputStream;
import java.io.StringReader;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

//import org.apache.commons.codec.binary.Base64;





import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.bank.ecs.ArrayOfEvtActvyTypFeatureReltn;
import com.bank.ecs.ArrayOfEvtInputLayout;
import com.bank.ecs.ArrayOfEvtPrtyInfo;
import com.bank.ecs.EventInputBundleImplService;
import com.bank.ecs.RunEventInputBundle;

import ecs.data.EVTINPUTBUNDLE;
import ecs.data.EvtActvyTypFeatureReltn;
import ecs.data.EvtInputLayout;
import ecs.data.EvtPrtyInfo;


public class Bank_TestDataGeneratorFraud  {

	SchemaFactory sf = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema"); 
	private static int counter = 0;
	//private static String url = "http://www.apache.org/";
	private static Map<Integer, String> appCode = new HashMap<Integer, String>();
	private static Map<Integer, String> computerCenterCode = new HashMap<Integer, String>();
	private static Map<Integer, String> device = new HashMap<Integer, String>();
	private static Map<Integer, String> deviceOS = new HashMap<Integer, String>();
	private static Map<Integer, String> mobileOp = new HashMap<Integer, String>();

	// not the best way to represent a global variable but works for POC
	private volatile static UUID guuid  = null;
	private volatile static EvtInputLayout dataRecord = null;
	
	private static String user;
	private static String password;
	private static String url;
	private static String host;
	private static String port;
	private static String rate;
	
	private final static String salt="DGE$5SGr@3VsHYUMas2323E4d57vfBfFSTRU@!DSH(*%FDSdfg13sgfsg";
	
	static String fraudAccount = accountFormat();

	/********************
	 * 
	 * Main
	 * @param args
	 * 
	 ******************/

	public static void main(String[] args) {
		
		user = args[0];
		password = args[1];
		url = args[2];
		host = args[3];
		port = args[4];
		rate = args[5];


		sendSOAPMessage sendSOAPFactory = new sendSOAPMessage(user, password, url, host, port);

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

		//Computer Center Codes
		computerCenterCode.put(1,  "2");
		computerCenterCode.put(2,  "3");
		computerCenterCode.put(3,  "6");

		//Mobile Device
		device.put(1, "002"); //Phone
		device.put(2, "003"); //Tablet

		//Mobile Operating Systems
		deviceOS.put(1, "001");  //IOS
		deviceOS.put(2, "002");  //Android
		deviceOS.put(3, "003");  //Backberry
		deviceOS.put(4, "004");  //Windows

		//Mobile Operator Code
		mobileOp.put(1, "001");
		mobileOp.put(2, "002");
		mobileOp.put(3, "003");
		mobileOp.put(4, "004");
		mobileOp.put(5, "999");
		
		//int counter = 0;


		JAXBContext jc_ecsData = null;
		ClassLoader cl_ecsData = ecs.data.ObjectFactory.class.getClassLoader();
		try {
			jc_ecsData = JAXBContext.newInstance("ecs.data", cl_ecsData);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Marshaller jaxbMarshallerEcsData = null;
		try {
			//jaxbMarshallerEcs = jc_ecs.createMarshaller();
			jaxbMarshallerEcsData = jc_ecsData.createMarshaller();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println("Sleep in millis between messages; " + 1000/Integer.valueOf(rate));
		
		/*
		while(true) {
		
			//1=OLB 2=Mobile
			if(randInt(1,2) == 1) {
				ByteArrayOutputStream soapData  = signInOLB(jaxbMarshallerEcsData);
				sendSOAPFactory.sendSOAP(soapData);
				ByteArrayOutputStream soapTransOLBData = transactionMultiPayBillOLB(jaxbMarshallerEcsData);
				sendSOAPFactory.sendSOAP(soapTransOLBData);
				try { Thread.sleep(1000/Integer.valueOf(rate)); } catch (InterruptedException e) {}
				//counter++;
				
			} else {
				
				ByteArrayOutputStream soapData  = signInMobile(jaxbMarshallerEcsData);
				sendSOAPFactory.sendSOAP(soapData);
				ByteArrayOutputStream soapTransMobileData = transactionMultiPayBillMobile(jaxbMarshallerEcsData);
				sendSOAPFactory.sendSOAP(soapTransMobileData);
				try { Thread.sleep(1000/Integer.valueOf(rate)); } catch (InterruptedException e) {}
				//counter++;
			}
			

		
		
		}
		*/
		
		
		
		/* send single OLB login and transaction. 
		ByteArrayOutputStream soapData  = signInOLB(jaxbMarshallerEcsData);
		sendSOAPFactory.sendSOAP(soapData);
		ByteArrayOutputStream soapTransOLBData = transactionMultiPayBillOLB(jaxbMarshallerEcsData);
		sendSOAPFactory.sendSOAP(soapTransOLBData);
		*/
		

		/* send single OLB login and transaction.
		ByteArrayOutputStream soapData  = signInMobile(jaxbMarshallerEcsData);
		sendSOAPFactory.sendSOAP(soapData);
		ByteArrayOutputStream soapTransMobileData = transactionMultiPayBillMobile(jaxbMarshallerEcsData);
		sendSOAPFactory.sendSOAP(soapTransMobileData);
		*/
		
		// send  Fraud message pattern.
		
		
		
		
		String amount = Integer.toString(randInt(1000,10000)) + ".";
		String s_cents = null;
		int cents = randInt(0,99);
		if( cents < 10 ) {
			s_cents = "0" + Integer.toString(cents);
		} else {
			s_cents = Integer.toString(cents);
		}
		amount = amount + s_cents;
		ByteArrayOutputStream soapData  = signInOLB(jaxbMarshallerEcsData);
		sendSOAPFactory.sendSOAP(soapData);
		
		//Initialized globally instead
		//String fraudAccount = accountFormat();
		
		for(int i=0; i < 11; i++)
		{
			//ByteArrayOutputStream soapData  = signInOLB(jaxbMarshallerEcsData);
			//sendSOAPFactory.sendSOAP(soapData);
			ByteArrayOutputStream soapTransOLBData = transactionFraudFundTransfersOLB("DR", amount,jaxbMarshallerEcsData);
			sendSOAPFactory.sendSOAP(soapTransOLBData);
			soapTransOLBData.reset();
			soapTransOLBData = transactionFraudFundTransfersOLB("CR",amount, jaxbMarshallerEcsData);
			sendSOAPFactory.sendSOAP(soapTransOLBData);
		}


	}

	/******************************************************
	 * 
	 * GUUID()
	 * @return
	 * 
	 ******************************************************/
	public static UUID GUUID(){
		//generate random UUIDs
		return UUID.randomUUID();
	}

	/******************************************************
	 * 
	 * randInt(int min, int max) 
	 * @param min
	 * @param max
	 * @return
	 ******************************************************/
	public static int randInt(int min, int max) {

		// Usually this can be a field rather than a method variable
		Random rand = new Random();

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}
	
	/*****************************************************
	 * 
	 * md5Hash()
	 * @param message
	 * @return
	 */
	//Takes a string, and converts it to md5 hashed string.
    public static String md5Hash(String message) {
        String md5 = "";
        if(null == message) 
            return null;
         
        message = message+salt;//adding a salt to the string before it gets hashed.
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");//Create MessageDigest object for MD5
            digest.update(message.getBytes(), 0, message.length());//Update input string in message digest
            md5 = new BigInteger(1, digest.digest()).toString(16);//Converts message digest value in base 16 (hex)
  
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return md5;
    }

	/******************************************************
	 *  
	 *  dateToXml(Date date
	 * @param date
	 * @return
	 ******************************************************/
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

	/******************************************************
	 * 
	 * timeToXml(Date date)
	 * @param date
	 * @return
	 ******************************************************/
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

	/******************************************************
	 * 
	 * buildSOAPMsg(ByteArrayOutputStream out)
	 * @param out
	 * @return
	 ******************************************************/
	public static ByteArrayOutputStream buildSOAPMsg(ByteArrayOutputStream out) {

		SOAPMessage soapMsg = null;

		EventInputBundleImplService service = new EventInputBundleImplService();
		//System.out.println("WSDL Info:" + service.getServiceName().getLocalPart());


		StringBuffer sb = new StringBuffer(out.toString());
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		docBuilderFactory.setNamespaceAware(true);
		DocumentBuilder docBuilder = null;
		Document xml = null;
		try {
			docBuilder = docBuilderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			xml = docBuilder.parse(new InputSource(new StringReader(sb.toString())));
		} catch (SAXException | IOException e1) {
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

			/******** Uncomment to show messages on console
			try {
				soapMsg.writeTo(System.out);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			
			

		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		ByteArrayOutputStream soapArrayOut = new ByteArrayOutputStream();
		try {
			soapMsg.writeTo(soapArrayOut);
		} catch (SOAPException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return soapArrayOut;
	}

	/******************************************************
	 * 
	 * signInOLB(Marshaller jaxbMarshallerEcsData)
	 * @param jaxbMarshallerEcsData
	 * @return
	 ******************************************************/
	public static ByteArrayOutputStream signInOLB(Marshaller jaxbMarshallerEcsData) {

		//AN array of actual event records. There can be up to 100 in a message record, but for testing we limit to 5
		ArrayOfEvtInputLayout arrayEvents = null;
		ArrayOfEvtPrtyInfo arrayEventsParty = null;
		ArrayOfEvtActvyTypFeatureReltn arrayEventsFeatures = null;

		EVTINPUTBUNDLE evtBundle = null;


		//Create a input record
		//int numRecords = randInt(1,5);
		int numRecords = 1;
		//System.out.println("Number of records: " + numRecords);
		arrayEvents = new ArrayOfEvtInputLayout();
		arrayEventsParty = new ArrayOfEvtPrtyInfo();
		arrayEventsFeatures = new ArrayOfEvtActvyTypFeatureReltn();

		//String acctCode = "AccountCode_" + randInt(1,100);
		while(numRecords != 0){
			guuid = GUUID();

			//Create the XML Payload for the SOAP message
			ecs.data.ObjectFactory reqLayout = new  ecs.data.ObjectFactory();

			//EvtInputLayout dataRecord = reqLayout.createEvtInputLayout();
			dataRecord = reqLayout.createEvtInputLayout();
			EvtPrtyInfo dataRecordParty = reqLayout.createEvtPrtyInfo();
			EvtActvyTypFeatureReltn dataRecordFeature = reqLayout.createEvtActvyTypFeatureReltn();

			//JAXBElement<String> EvtId = reqLayout.createEvtInputLayoutEvtId(String.valueOf(counter++));
			JAXBElement<String> EvtId = reqLayout.createEvtInputLayoutEvtId(String.valueOf(guuid));
			dataRecord.setEvtId(EvtId);
			dataRecord.setEvtSysAppCd("3M00");
			dataRecord.setEvtProcessingCentre(reqLayout.createEvtInputLayoutEvtProcessingCentre("3"));
			dataRecord.setEvtTypCd(reqLayout.createEvtInputLayoutEvtTypCd("002"));
			dataRecord.setEvtStatusCd(reqLayout.createEvtInputLayoutEvtStatusCd("001"));
			dataRecord.setEvtResultCd(reqLayout.createEvtInputLayoutEvtResultCd("011"));
			dataRecord.setEvtChannelTypCd(reqLayout.createEvtInputLayoutEvtChannelTypCd("034"));
			int cardSuffix = randInt(0,99);
			String s_cardSuffix;
			if ( cardSuffix < 10) {
				s_cardSuffix = "0" + String.valueOf(cardSuffix);
			} else {
				s_cardSuffix = String.valueOf(cardSuffix);
			}
			dataRecord.setEvtCardNo(reqLayout.createEvtInputLayoutEvtCardNo("12345600000011" + s_cardSuffix));

			dataRecord.setEvtDate(dateToXml(new Date()));
			dataRecord.setEvtTime(timeToXml(new Date()));
			dataRecord.setEvtMsgVersion("1.1");
			dataRecord.setEvtCardTypCd(reqLayout.createEvtInputLayoutEvtCardTypCd("002"));
			dataRecord.setEvtCardIssuingFi(reqLayout.createEvtInputLayoutEvtCardIssuingFi("003"));
			dataRecord.setEvtInitdByCd(reqLayout.createEvtInputLayoutEvtInitdByCd("002"));
			dataRecord.setEvtOrgntAppCd(reqLayout.createEvtInputLayoutEvtOrgntAppCd("3M00"));
			dataRecord.setEvtSessionId(reqLayout.createEvtInputLayoutEvtSessionId(md5Hash(String.valueOf(guuid))));

			dataRecordParty.setEvtPartySearchKey("SRF");
			dataRecordParty.setEvtPrtySysAppCd("9X00");
			dataRecordParty.setEvtPrtyReltnTypCd("006");
			dataRecordParty.setEvtPrtyRoleCd("001");
			arrayEventsParty.getEvtPrtyInfo().add(dataRecordParty);
			dataRecord.setEvtPrtyInfos(reqLayout.createEvtInputLayoutEvtPrtyInfos(arrayEventsParty));;

			dataRecordFeature.setEvtActvyTypFeatureName("TXN_CD");
			dataRecordFeature.setEvtActvyTypFeatureCd("065");
			arrayEventsFeatures.getEvtActvyTypFeatureReltn().add(dataRecordFeature);
			dataRecord.setEvtActvyTypFeatureReltns(arrayEventsFeatures);

			//Add the record to an array of input events, up to 100
			arrayEvents.getEvtInputLayout().add(dataRecord);		

			numRecords--;

			//JAXBElement<String> jstr = dataRecord.getEvtProcessingCentre();
			//System.out.println("ProcessingCentre:" + jstr.getValue());
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
			//jaxbMarshallerEcsData.setProperty(Marshaller.JAXB_ENCODING, SOAP_Payload);


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


		ByteArrayOutputStream  soapArrayOut = buildSOAPMsg(out);

		return soapArrayOut;

	}





	/******************************************************
	 * 
	 * signInMobile
	 * @param jaxbMarshallerEcsData
	 * @return
	 */
	public static ByteArrayOutputStream signInMobile(Marshaller jaxbMarshallerEcsData) {

		//AN array of actual event records. There can be up to 100 in a message record, but for testing we limit to 5
		ArrayOfEvtInputLayout arrayEvents = null;
		ArrayOfEvtPrtyInfo arrayEventsParty = null;
		ArrayOfEvtActvyTypFeatureReltn arrayEventsFeatures = null;

		EVTINPUTBUNDLE evtBundle = null;
		//EvtPrtyInfo evtBundleParty = null;


		//Create a input record
		//int numRecords = randInt(1,5);
		int numRecords = 1;
		//System.out.println("Number of records: " + numRecords);
		arrayEvents = new ArrayOfEvtInputLayout();
		arrayEventsParty = new ArrayOfEvtPrtyInfo();
		arrayEventsFeatures = new ArrayOfEvtActvyTypFeatureReltn();

		//String acctCode = "AccountCode_" + randInt(1,100);
		while(numRecords != 0){
			guuid = GUUID();

			//Create the XML Payload for the SOAP message
			ecs.data.ObjectFactory reqLayout = new  ecs.data.ObjectFactory();
			//com.rbc.ecs.ObjectFactory reqPartyLayout = new com.rbc.ecs.ObjectFactory();
			//EvtInputLayout dataRecord = reqLayout.createEvtInputLayout();
			dataRecord = reqLayout.createEvtInputLayout();
			EvtPrtyInfo dataRecordParty = reqLayout.createEvtPrtyInfo();
			EvtActvyTypFeatureReltn dataRecordFeature = reqLayout.createEvtActvyTypFeatureReltn();

			//JAXBElement<String> EvtId = reqLayout.createEvtInputLayoutEvtId(String.valueOf(counter++));
			JAXBElement<String> EvtId = reqLayout.createEvtInputLayoutEvtId(String.valueOf(guuid));
			dataRecord.setEvtId(EvtId);
			dataRecord.setEvtSysAppCd("3M00");
			dataRecord.setEvtProcessingCentre(reqLayout.createEvtInputLayoutEvtProcessingCentre("3"));
			dataRecord.setEvtTypCd(reqLayout.createEvtInputLayoutEvtTypCd("002"));
			dataRecord.setEvtStatusCd(reqLayout.createEvtInputLayoutEvtStatusCd("001"));
			dataRecord.setEvtResultCd(reqLayout.createEvtInputLayoutEvtResultCd("011"));
			dataRecord.setEvtChannelTypCd(reqLayout.createEvtInputLayoutEvtChannelTypCd("021"));
			dataRecord.setEvtAccessDeviceTypCd(reqLayout.createEvtInputLayoutEvtAccessDeviceTypCd(device.get(randInt(1,2))));
			dataRecord.setEvtAccessDeviceSubTypCd(reqLayout.createEvtInputLayoutEvtAccessDeviceSubTypCd(deviceOS.get(randInt(1,4))));
			dataRecord.setEvtMbDevcCrrCoCd(reqLayout.createEvtInputLayoutEvtMbDevcCrrCoCd(mobileOp.get(randInt(1,5))));
			int cardSuffix = randInt(0,99);
			String s_cardSuffix;
			if ( cardSuffix < 10) {
				s_cardSuffix = "0" + String.valueOf(cardSuffix);
			} else {
				s_cardSuffix = String.valueOf(cardSuffix);
			}
			dataRecord.setEvtCardNo(reqLayout.createEvtInputLayoutEvtCardNo("12345600000011" + s_cardSuffix));

			dataRecord.setEvtDate(dateToXml(new Date()));
			dataRecord.setEvtTime(timeToXml(new Date()));
			dataRecord.setEvtMsgVersion("1.1");
			dataRecord.setEvtCardTypCd(reqLayout.createEvtInputLayoutEvtCardTypCd("002"));
			dataRecord.setEvtCardIssuingFi(reqLayout.createEvtInputLayoutEvtCardIssuingFi("003"));
			dataRecord.setEvtInitdByCd(reqLayout.createEvtInputLayoutEvtInitdByCd("002"));
			dataRecord.setEvtOrgntAppCd(reqLayout.createEvtInputLayoutEvtOrgntAppCd("XQC0"));
			//dataRecord.setEvtSessionId(reqLayout.createEvtInputLayoutEvtSessionId(String.valueOf(guuid)));
			dataRecord.setEvtSessionId(reqLayout.createEvtInputLayoutEvtSessionId(md5Hash(String.valueOf(guuid))));

			dataRecordParty.setEvtPartySearchKey("SRF");
			dataRecordParty.setEvtPrtySysAppCd("9X00");
			dataRecordParty.setEvtPrtyReltnTypCd("006");
			dataRecordParty.setEvtPrtyRoleCd("001");
			arrayEventsParty.getEvtPrtyInfo().add(dataRecordParty);
			dataRecord.setEvtPrtyInfos(reqLayout.createEvtInputLayoutEvtPrtyInfos(arrayEventsParty));;

			dataRecordFeature.setEvtActvyTypFeatureName("TXN_CD");
			dataRecordFeature.setEvtActvyTypFeatureCd("065");
			arrayEventsFeatures.getEvtActvyTypFeatureReltn().add(dataRecordFeature);
			dataRecord.setEvtActvyTypFeatureReltns(arrayEventsFeatures);

			//Add the record to an array of input events, up to 100
			arrayEvents.getEvtInputLayout().add(dataRecord);		

			numRecords--;

			//JAXBElement<String> jstr = dataRecord.getEvtProcessingCentre();
			//System.out.println("ProcessingCentre:" + jstr.getValue());
		}

		//Create the bundle of inputevents object
		evtBundle = new EVTINPUTBUNDLE();
		evtBundle.setEvtInputLayouts(arrayEvents);

		//Create SOAP XML payload
		//com.rbc.ecs.ObjectFactory reqMsg = new com.rbc.ecs.ObjectFactory ();
		RunEventInputBundle dataMsg = new RunEventInputBundle();
		dataMsg.setEventInputBundle(evtBundle);




		//String SOAP_Payload = null;
		ByteArrayOutputStream out= new ByteArrayOutputStream();

		try {

			jaxbMarshallerEcsData.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			//jaxbMarshallerEcsData.setProperty(Marshaller.JAXB_ENCODING, SOAP_Payload);


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


		ByteArrayOutputStream  soapArrayOut = buildSOAPMsg(out);

		return soapArrayOut;
	}
	

	/*****************************************
	 * 
	 * transactionMultiPayBillOLB
	 * @param jaxbMarshallerEcsData
	 * @return
	 */
	public static ByteArrayOutputStream transactionFraudFundTransfersOLB(String accountDRCR, String amountUS, Marshaller jaxbMarshallerEcsData) {

		//AN array of actual event records. There can be up to 100 in a message record, but for testing we limit to 5
		ArrayOfEvtInputLayout arrayEvents = null;
		ArrayOfEvtPrtyInfo arrayEventsParty = null;
		ArrayOfEvtActvyTypFeatureReltn arrayEventsFeatures = null;

		EVTINPUTBUNDLE evtBundle = null;


		//Create a input record
		//int numRecords = randInt(1,5);
		int numRecords = 1;
		//System.out.println("Number of records: " + numRecords);
		arrayEvents = new ArrayOfEvtInputLayout();
		arrayEventsParty = new ArrayOfEvtPrtyInfo();
		arrayEventsFeatures = new ArrayOfEvtActvyTypFeatureReltn();
		
		// THis is used to make sure the party and activity array is only updated once per record creation in the while loop
		boolean iteration = true;

		//String acctCode = "AccountCode_" + randInt(1,100);
		while(numRecords != 0){
			
			guuid = GUUID();

			//Create the XML Payload for the SOAP message
			ecs.data.ObjectFactory reqLayout = new  ecs.data.ObjectFactory();

			// Create new dataRecord to be different from 
			EvtInputLayout dataRecordTransOLB = reqLayout.createEvtInputLayout();
			//dataRecord = reqLayout.createEvtInputLayout();
			EvtPrtyInfo dataRecordParty = reqLayout.createEvtPrtyInfo();
			EvtActvyTypFeatureReltn dataRecordFeature = reqLayout.createEvtActvyTypFeatureReltn();

			//JAXBElement<String> EvtId = reqLayout.createEvtInputLayoutEvtId(String.valueOf(counter++));
			JAXBElement<String> EvtId = reqLayout.createEvtInputLayoutEvtId(String.valueOf(guuid));
			dataRecordTransOLB.setEvtId(EvtId);
			dataRecordTransOLB.setEvtSysAppCd("3M00");
			dataRecordTransOLB.setEvtProcessingCentre(reqLayout.createEvtInputLayoutEvtProcessingCentre("3"));
			dataRecordTransOLB.setEvtTypCd(reqLayout.createEvtInputLayoutEvtTypCd("001"));
			dataRecordTransOLB.setEvtStatusCd(reqLayout.createEvtInputLayoutEvtStatusCd("001"));
			dataRecordTransOLB.setEvtResultCd(reqLayout.createEvtInputLayoutEvtResultCd("011"));
			dataRecordTransOLB.setEvtChannelTypCd(reqLayout.createEvtInputLayoutEvtChannelTypCd("034"));
			/*
			int cardSuffix = randInt(0,99);
			String s_cardSuffix;
			if ( cardSuffix < 10) {
				s_cardSuffix = "0" + String.valueOf(cardSuffix);
			} else {
				s_cardSuffix = String.valueOf(cardSuffix);
			}
			*/
			String cardNo = dataRecord.getEvtCardNo().getValue();
			dataRecordTransOLB.setEvtCardNo(reqLayout.createEvtInputLayoutEvtCardNo(cardNo));

			dataRecordTransOLB.setEvtDate(dateToXml(new Date()));
			dataRecordTransOLB.setEvtTime(timeToXml(new Date()));
			dataRecordTransOLB.setEvtMsgVersion("1.1");
			
			
		
			//int currency = randInt(1,2); // 1 = CND, 2= US
			int currency = 2;
			double exchangeRate = 1.3;
		
			if(currency == 1) {
				String amountCND = Integer.toString(randInt(0,1000)) + ".";
				String s_cents = null;
				int cents = randInt(0,99);
				if( cents < 10 ) {
					s_cents = "0" + Integer.toString(cents);
				} else {
					s_cents = Integer.toString(cents);
				}
				amountCND = amountCND + s_cents;
				dataRecordTransOLB.setEvtAmountCad(reqLayout.createEvtInputLayoutEvtAmountCad(amountCND));
				dataRecordTransOLB.setEvtAmount(reqLayout.createEvtInputLayoutEvtAmount(amountCND));
				dataRecordTransOLB.setEvtCurrencyCd(reqLayout.createEvtInputLayoutEvtCurrencyCd("CAD"));
				dataRecordTransOLB.setEvtForexCadRate(reqLayout.createEvtInputLayoutEvtForexCadRate("1"));
				dataRecordTransOLB.setEvtSettlementAmount(reqLayout.createEvtInputLayoutEvtSettlementAmount(amountCND));
				dataRecordTransOLB.setEvtSettlementCurrencyCd(reqLayout.createEvtInputLayoutEvtSettlementCurrencyCd("CAD"));
			}
			
			if(currency == 2){
				/*
				int amountUS = randInt(0,1000);
				String s_amountUS = Integer.toString(amountUS) + ".";
				String s_centsUS = null;
				int centsUS = randInt(0,99);
				if( centsUS < 10 ) {
					s_centsUS = "0" + Integer.toString(centsUS);
				} else {
					s_centsUS = Integer.toString(centsUS);
				}
				s_amountUS = s_amountUS + s_centsUS;
				*/
				String s_amountUS = amountUS;
				
				double d_amountUS = Double.parseDouble(s_amountUS);
				double d_amountCND = d_amountUS * exchangeRate;
				String s_amountCND = String.valueOf(d_amountCND);
				
			
				dataRecordTransOLB.setEvtAmountCad(reqLayout.createEvtInputLayoutEvtAmountCad(s_amountCND));
				dataRecordTransOLB.setEvtAmount(reqLayout.createEvtInputLayoutEvtAmount(s_amountUS));
				dataRecordTransOLB.setEvtCurrencyCd(reqLayout.createEvtInputLayoutEvtCurrencyCd("USD"));
				dataRecordTransOLB.setEvtForexCadRate(reqLayout.createEvtInputLayoutEvtForexCadRate(Double.toString(exchangeRate)));
				dataRecordTransOLB.setEvtSettlementAmount(reqLayout.createEvtInputLayoutEvtSettlementAmount(s_amountCND));
				dataRecordTransOLB.setEvtSettlementCurrencyCd(reqLayout.createEvtInputLayoutEvtSettlementCurrencyCd("CAD"));
			
			}
			
			
			dataRecordTransOLB.setEvtCardTypCd(reqLayout.createEvtInputLayoutEvtCardTypCd("002"));
			dataRecordTransOLB.setEvtCardIssuingFi(reqLayout.createEvtInputLayoutEvtCardIssuingFi("003"));
			dataRecordTransOLB.setEvtInitdByCd(reqLayout.createEvtInputLayoutEvtInitdByCd("002"));
			dataRecordTransOLB.setEvtAcctDrCrCd(reqLayout.createEvtInputLayoutEvtAcctDrCrCd(accountDRCR));
			dataRecordTransOLB.setEvtOrgntAppCd(reqLayout.createEvtInputLayoutEvtOrgntAppCd("3M00"));
			
			//used to tie login to transactions
			String SessionID = dataRecord.getEvtSessionId().getValue();
			dataRecordTransOLB.setEvtSessionId(reqLayout.createEvtInputLayoutEvtSessionId(SessionID));
			
			//Add the account information
			if(accountDRCR.equals("DR")) {
				dataRecordTransOLB.setEvtAcctAppId(reqLayout.createEvtInputLayoutEvtAcctAppId(accountFormat()));
			} else {
				dataRecordTransOLB.setEvtAcctAppId(reqLayout.createEvtInputLayoutEvtAcctAppId(fraudAccount));
			}

			dataRecordParty.setEvtPartySearchKey("SRF");
			dataRecordParty.setEvtPrtySysAppCd("9X00");
			dataRecordParty.setEvtPrtyReltnTypCd("006");
			dataRecordParty.setEvtPrtyRoleCd("001");
			if(iteration)
				arrayEventsParty.getEvtPrtyInfo().add(dataRecordParty);
			dataRecordTransOLB.setEvtPrtyInfos(reqLayout.createEvtInputLayoutEvtPrtyInfos(arrayEventsParty));;

			dataRecordFeature.setEvtActvyTypFeatureName("TXN_CD");
			dataRecordFeature.setEvtActvyTypFeatureCd("42");
			if(iteration)
				arrayEventsFeatures.getEvtActvyTypFeatureReltn().add(dataRecordFeature);
			dataRecordTransOLB.setEvtActvyTypFeatureReltns(arrayEventsFeatures);

			//Add the record to an array of input events, up to 100
			arrayEvents.getEvtInputLayout().add(dataRecordTransOLB);		

			numRecords--;

			//JAXBElement<String> jstr = dataRecord.getEvtProcessingCentre();
			//System.out.println("ProcessingCentre:" + jstr.getValue());
			
			iteration = false;
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
			//jaxbMarshallerEcsData.setProperty(Marshaller.JAXB_ENCODING, SOAP_Payload);


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


		ByteArrayOutputStream  soapArrayOut = buildSOAPMsg(out);

		return soapArrayOut;

	}


	
	

	/*****************************************
	 * 
	 * transactionMultiPayBillOLB
	 * @param jaxbMarshallerEcsData
	 * @return
	 */
	public static ByteArrayOutputStream transactionMultiPayBillOLB(Marshaller jaxbMarshallerEcsData) {

		//AN array of actual event records. There can be up to 100 in a message record, but for testing we limit to 5
		ArrayOfEvtInputLayout arrayEvents = null;
		ArrayOfEvtPrtyInfo arrayEventsParty = null;
		ArrayOfEvtActvyTypFeatureReltn arrayEventsFeatures = null;

		EVTINPUTBUNDLE evtBundle = null;


		//Create a input record
		int numRecords = randInt(1,5);
		//int numRecords = 1;
		//System.out.println("Number of records: " + numRecords);
		arrayEvents = new ArrayOfEvtInputLayout();
		arrayEventsParty = new ArrayOfEvtPrtyInfo();
		arrayEventsFeatures = new ArrayOfEvtActvyTypFeatureReltn();
		
		// THis is used to make sure the party and activity array is only updated once per record creation in the while loop
		boolean iteration = true;

		//String acctCode = "AccountCode_" + randInt(1,100);
		while(numRecords != 0){
			
			guuid = GUUID();

			//Create the XML Payload for the SOAP message
			ecs.data.ObjectFactory reqLayout = new  ecs.data.ObjectFactory();

			// Create new dataRecord to be different from 
			EvtInputLayout dataRecordTransOLB = reqLayout.createEvtInputLayout();
			//dataRecord = reqLayout.createEvtInputLayout();
			EvtPrtyInfo dataRecordParty = reqLayout.createEvtPrtyInfo();
			EvtActvyTypFeatureReltn dataRecordFeature = reqLayout.createEvtActvyTypFeatureReltn();

			//JAXBElement<String> EvtId = reqLayout.createEvtInputLayoutEvtId(String.valueOf(counter++));
			JAXBElement<String> EvtId = reqLayout.createEvtInputLayoutEvtId(String.valueOf(guuid));
			dataRecordTransOLB.setEvtId(EvtId);
			dataRecordTransOLB.setEvtSysAppCd("3M00");
			dataRecordTransOLB.setEvtProcessingCentre(reqLayout.createEvtInputLayoutEvtProcessingCentre("3"));
			dataRecordTransOLB.setEvtTypCd(reqLayout.createEvtInputLayoutEvtTypCd("001"));
			dataRecordTransOLB.setEvtStatusCd(reqLayout.createEvtInputLayoutEvtStatusCd("001"));
			dataRecordTransOLB.setEvtResultCd(reqLayout.createEvtInputLayoutEvtResultCd("011"));
			dataRecordTransOLB.setEvtChannelTypCd(reqLayout.createEvtInputLayoutEvtChannelTypCd("034"));
			/*
			int cardSuffix = randInt(0,99);
			String s_cardSuffix;
			if ( cardSuffix < 10) {
				s_cardSuffix = "0" + String.valueOf(cardSuffix);
			} else {
				s_cardSuffix = String.valueOf(cardSuffix);
			}
			*/
			String cardNo = dataRecord.getEvtCardNo().getValue();
			dataRecordTransOLB.setEvtCardNo(reqLayout.createEvtInputLayoutEvtCardNo(cardNo));

			dataRecordTransOLB.setEvtDate(dateToXml(new Date()));
			dataRecordTransOLB.setEvtTime(timeToXml(new Date()));
			dataRecordTransOLB.setEvtMsgVersion("1.1");
			
			
		
			int currency = randInt(1,2); // 1 = CND, 2= US
			double exchangeRate = 1.3;
		
			if(currency == 1) {
				String amountCND = Integer.toString(randInt(0,1000)) + ".";
				String s_cents = null;
				int cents = randInt(0,99);
				if( cents < 10 ) {
					s_cents = "0" + Integer.toString(cents);
				} else {
					s_cents = Integer.toString(cents);
				}
				amountCND = amountCND + s_cents;
				dataRecordTransOLB.setEvtAmountCad(reqLayout.createEvtInputLayoutEvtAmountCad(amountCND));
				dataRecordTransOLB.setEvtAmount(reqLayout.createEvtInputLayoutEvtAmount(amountCND));
				dataRecordTransOLB.setEvtCurrencyCd(reqLayout.createEvtInputLayoutEvtCurrencyCd("CAD"));
				dataRecordTransOLB.setEvtForexCadRate(reqLayout.createEvtInputLayoutEvtForexCadRate("1"));
				dataRecordTransOLB.setEvtSettlementAmount(reqLayout.createEvtInputLayoutEvtSettlementAmount(amountCND));
				dataRecordTransOLB.setEvtSettlementCurrencyCd(reqLayout.createEvtInputLayoutEvtSettlementCurrencyCd("CAD"));
			}
			
			if(currency == 2){
				int amountUS = randInt(0,1000);
				String s_amountUS = Integer.toString(amountUS) + ".";
				String s_centsUS = null;
				int centsUS = randInt(0,99);
				if( centsUS < 10 ) {
					s_centsUS = "0" + Integer.toString(centsUS);
				} else {
					s_centsUS = Integer.toString(centsUS);
				}
				s_amountUS = s_amountUS + s_centsUS;
				
				double d_amountUS = Double.parseDouble(s_amountUS);
				double d_amountCND = d_amountUS * exchangeRate;
				String s_amountCND = String.valueOf(d_amountCND);
				
			
				dataRecordTransOLB.setEvtAmountCad(reqLayout.createEvtInputLayoutEvtAmountCad(s_amountCND));
				dataRecordTransOLB.setEvtAmount(reqLayout.createEvtInputLayoutEvtAmount(s_amountUS));
				dataRecordTransOLB.setEvtCurrencyCd(reqLayout.createEvtInputLayoutEvtCurrencyCd("USD"));
				dataRecordTransOLB.setEvtForexCadRate(reqLayout.createEvtInputLayoutEvtForexCadRate(Double.toString(exchangeRate)));
				dataRecordTransOLB.setEvtSettlementAmount(reqLayout.createEvtInputLayoutEvtSettlementAmount(s_amountCND));
				dataRecordTransOLB.setEvtSettlementCurrencyCd(reqLayout.createEvtInputLayoutEvtSettlementCurrencyCd("CAD"));
			
			}
			
			
			dataRecordTransOLB.setEvtCardTypCd(reqLayout.createEvtInputLayoutEvtCardTypCd("002"));
			dataRecordTransOLB.setEvtCardIssuingFi(reqLayout.createEvtInputLayoutEvtCardIssuingFi("003"));
			dataRecordTransOLB.setEvtInitdByCd(reqLayout.createEvtInputLayoutEvtInitdByCd("002"));
			dataRecordTransOLB.setEvtAcctDrCrCd(reqLayout.createEvtInputLayoutEvtAcctDrCrCd("DR"));
			dataRecordTransOLB.setEvtOrgntAppCd(reqLayout.createEvtInputLayoutEvtOrgntAppCd("3M00"));
			
			//used to type login to transactions
			String SessionID = dataRecord.getEvtSessionId().getValue();
			dataRecordTransOLB.setEvtSessionId(reqLayout.createEvtInputLayoutEvtSessionId(SessionID));

			dataRecordParty.setEvtPartySearchKey("SRF");
			dataRecordParty.setEvtPrtySysAppCd("9X00");
			dataRecordParty.setEvtPrtyReltnTypCd("006");
			dataRecordParty.setEvtPrtyRoleCd("001");
			if(iteration)
				arrayEventsParty.getEvtPrtyInfo().add(dataRecordParty);
			dataRecordTransOLB.setEvtPrtyInfos(reqLayout.createEvtInputLayoutEvtPrtyInfos(arrayEventsParty));;

			dataRecordFeature.setEvtActvyTypFeatureName("TXN_CD");
			dataRecordFeature.setEvtActvyTypFeatureCd("175");
			if(iteration)
				arrayEventsFeatures.getEvtActvyTypFeatureReltn().add(dataRecordFeature);
			dataRecordTransOLB.setEvtActvyTypFeatureReltns(arrayEventsFeatures);

			//Add the record to an array of input events, up to 100
			arrayEvents.getEvtInputLayout().add(dataRecordTransOLB);		

			numRecords--;

			//JAXBElement<String> jstr = dataRecord.getEvtProcessingCentre();
			//System.out.println("ProcessingCentre:" + jstr.getValue());
			
			iteration = false;
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
			//jaxbMarshallerEcsData.setProperty(Marshaller.JAXB_ENCODING, SOAP_Payload);


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


		ByteArrayOutputStream  soapArrayOut = buildSOAPMsg(out);

		return soapArrayOut;

	}



	/******************************************************
	 * 
	 */
	public static ByteArrayOutputStream transactionMultiPayBillMobile(Marshaller jaxbMarshallerEcsData) {

		//AN array of actual event records. There can be up to 100 in a message record, but for testing we limit to 5
				ArrayOfEvtInputLayout arrayEvents = null;
				ArrayOfEvtPrtyInfo arrayEventsParty = null;
				ArrayOfEvtActvyTypFeatureReltn arrayEventsFeatures = null;

				EVTINPUTBUNDLE evtBundle = null;


				//Create a input record
				int numRecords = randInt(1,5);
				//int numRecords = 1;
				//System.out.println("Number of records: " + numRecords);
				arrayEvents = new ArrayOfEvtInputLayout();
				arrayEventsParty = new ArrayOfEvtPrtyInfo();
				arrayEventsFeatures = new ArrayOfEvtActvyTypFeatureReltn();
				
				// THis is used to make sure the party and activity array is only updated once per record creation in the while loop
				boolean iteration = true;

				//String acctCode = "AccountCode_" + randInt(1,100);
				while(numRecords != 0){
					
					guuid = GUUID();

					//Create the XML Payload for the SOAP message
					ecs.data.ObjectFactory reqLayout = new  ecs.data.ObjectFactory();

					// Create new dataRecord to be different from 
					EvtInputLayout dataRecordTransMobile = reqLayout.createEvtInputLayout();
					//dataRecord = reqLayout.createEvtInputLayout();
					EvtPrtyInfo dataRecordParty = reqLayout.createEvtPrtyInfo();
					EvtActvyTypFeatureReltn dataRecordFeature = reqLayout.createEvtActvyTypFeatureReltn();

					//JAXBElement<String> EvtId = reqLayout.createEvtInputLayoutEvtId(String.valueOf(counter++));
					JAXBElement<String> EvtId = reqLayout.createEvtInputLayoutEvtId(String.valueOf(guuid));
					dataRecordTransMobile.setEvtId(EvtId);
					dataRecordTransMobile.setEvtSysAppCd("3M00");
					dataRecordTransMobile.setEvtProcessingCentre(reqLayout.createEvtInputLayoutEvtProcessingCentre("3"));
					dataRecordTransMobile.setEvtTypCd(reqLayout.createEvtInputLayoutEvtTypCd("001"));
					dataRecordTransMobile.setEvtStatusCd(reqLayout.createEvtInputLayoutEvtStatusCd("001"));
					dataRecordTransMobile.setEvtResultCd(reqLayout.createEvtInputLayoutEvtResultCd("011"));
					dataRecordTransMobile.setEvtChannelTypCd(reqLayout.createEvtInputLayoutEvtChannelTypCd("021"));
					/*
					int cardSuffix = randInt(0,99);
					String s_cardSuffix;
					if ( cardSuffix < 10) {
						s_cardSuffix = "0" + String.valueOf(cardSuffix);
					} else {
						s_cardSuffix = String.valueOf(cardSuffix);
					}
					*/
					String cardNo = dataRecord.getEvtCardNo().getValue();
					dataRecordTransMobile.setEvtCardNo(reqLayout.createEvtInputLayoutEvtCardNo(cardNo));

					dataRecordTransMobile.setEvtDate(dateToXml(new Date()));
					dataRecordTransMobile.setEvtTime(timeToXml(new Date()));
					dataRecordTransMobile.setEvtMsgVersion("1.1");
					
					
				
					int currency = randInt(1,2); // 1 = CND, 2= US
					double exchangeRate = 1.3;
				
					if(currency == 1) {
						String amountCND = Integer.toString(randInt(0,1000)) + ".";
						String s_cents = null;
						int cents = randInt(0,99);
						if( cents < 10 ) {
							s_cents = "0" + Integer.toString(cents);
						} else {
							s_cents = Integer.toString(cents);
						}
						amountCND = amountCND + s_cents;
						dataRecordTransMobile.setEvtAmountCad(reqLayout.createEvtInputLayoutEvtAmountCad(amountCND));
						dataRecordTransMobile.setEvtAmount(reqLayout.createEvtInputLayoutEvtAmount(amountCND));
						dataRecordTransMobile.setEvtCurrencyCd(reqLayout.createEvtInputLayoutEvtCurrencyCd("CAD"));
						dataRecordTransMobile.setEvtForexCadRate(reqLayout.createEvtInputLayoutEvtForexCadRate("1"));
						dataRecordTransMobile.setEvtSettlementAmount(reqLayout.createEvtInputLayoutEvtSettlementAmount(amountCND));
						dataRecordTransMobile.setEvtSettlementCurrencyCd(reqLayout.createEvtInputLayoutEvtSettlementCurrencyCd("CAD"));
					}
					
					if(currency == 2){
						int amountUS = randInt(0,1000);
						String s_amountUS = Integer.toString(amountUS) + ".";
						String s_centsUS = null;
						int centsUS = randInt(0,99);
						if( centsUS < 10 ) {
							s_centsUS = "0" + Integer.toString(centsUS);
						} else {
							s_centsUS = Integer.toString(centsUS);
						}
						s_amountUS = s_amountUS + s_centsUS;
						
						double d_amountUS = Double.parseDouble(s_amountUS);
						double d_amountCND = d_amountUS * exchangeRate;
						String s_amountCND = String.valueOf(d_amountCND);
						
					
						dataRecordTransMobile.setEvtAmountCad(reqLayout.createEvtInputLayoutEvtAmountCad(s_amountCND));
						dataRecordTransMobile.setEvtAmount(reqLayout.createEvtInputLayoutEvtAmount(s_amountUS));
						dataRecordTransMobile.setEvtCurrencyCd(reqLayout.createEvtInputLayoutEvtCurrencyCd("USD"));
						dataRecordTransMobile.setEvtForexCadRate(reqLayout.createEvtInputLayoutEvtForexCadRate(Double.toString(exchangeRate)));
						dataRecordTransMobile.setEvtSettlementAmount(reqLayout.createEvtInputLayoutEvtSettlementAmount(s_amountCND));
						dataRecordTransMobile.setEvtSettlementCurrencyCd(reqLayout.createEvtInputLayoutEvtSettlementCurrencyCd("CAD"));
					
					}
					
					
					dataRecordTransMobile.setEvtCardTypCd(reqLayout.createEvtInputLayoutEvtCardTypCd("002"));
					dataRecordTransMobile.setEvtCardIssuingFi(reqLayout.createEvtInputLayoutEvtCardIssuingFi("003"));
					dataRecordTransMobile.setEvtInitdByCd(reqLayout.createEvtInputLayoutEvtInitdByCd("002"));
					dataRecordTransMobile.setEvtAcctDrCrCd(reqLayout.createEvtInputLayoutEvtAcctDrCrCd("DR"));
					dataRecordTransMobile.setEvtOrgntAppCd(reqLayout.createEvtInputLayoutEvtOrgntAppCd("XQC0"));
					
					//used to type login to transactions
					String SessionID = dataRecord.getEvtSessionId().getValue();
					dataRecordTransMobile.setEvtSessionId(reqLayout.createEvtInputLayoutEvtSessionId(SessionID));

					dataRecordParty.setEvtPartySearchKey("SRF");
					dataRecordParty.setEvtPrtySysAppCd("9X00");
					dataRecordParty.setEvtPrtyReltnTypCd("006");
					dataRecordParty.setEvtPrtyRoleCd("001");
					if(iteration)
						arrayEventsParty.getEvtPrtyInfo().add(dataRecordParty);
					dataRecordTransMobile.setEvtPrtyInfos(reqLayout.createEvtInputLayoutEvtPrtyInfos(arrayEventsParty));;

					dataRecordFeature.setEvtActvyTypFeatureName("TXN_CD");
					dataRecordFeature.setEvtActvyTypFeatureCd("175");
					if(iteration)
						arrayEventsFeatures.getEvtActvyTypFeatureReltn().add(dataRecordFeature);
					dataRecordTransMobile.setEvtActvyTypFeatureReltns(arrayEventsFeatures);

					//Add the record to an array of input events, up to 100
					arrayEvents.getEvtInputLayout().add(dataRecordTransMobile);		

					numRecords--;
					iteration = false;

					//JAXBElement<String> jstr = dataRecord.getEvtProcessingCentre();
					//System.out.println("ProcessingCentre:" + jstr.getValue());
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
					//jaxbMarshallerEcsData.setProperty(Marshaller.JAXB_ENCODING, SOAP_Payload);


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


				ByteArrayOutputStream  soapArrayOut = buildSOAPMsg(out);

				return soapArrayOut;
	}
	
	private static String accountFormat() {
		String transitNo = Integer.toString(randInt(11111,99999));
		String accountNo = Integer.toString(randInt(1111111,9999999));
		return (transitNo + accountNo);
	}




}
