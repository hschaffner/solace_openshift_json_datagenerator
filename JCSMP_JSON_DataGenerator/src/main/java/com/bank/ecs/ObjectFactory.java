
package com.bank.ecs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ecs.data.EVTINPUTBUNDLERESPONSE;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rbc.ecs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RunEventInputBundleResponseEventInputBundleResponse_QNAME = new QName("", "EventInputBundleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rbc.ecs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUUIDResponse }
     * 
     */
    public GetUUIDResponse createGetUUIDResponse() {
        return new GetUUIDResponse();
    }

    /**
     * Create an instance of {@link RunEventInputBundle }
     * 
     */
    public RunEventInputBundle createRunEventInputBundle() {
        return new RunEventInputBundle();
    }

    /**
     * Create an instance of {@link GetUUIDRequest }
     * 
     */
    public GetUUIDRequest createGetUUIDRequest() {
        return new GetUUIDRequest();
    }

    /**
     * Create an instance of {@link RunEventInputBundleResponse }
     * 
     */
    public RunEventInputBundleResponse createRunEventInputBundleResponse() {
        return new RunEventInputBundleResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEvtInputLayout }
     * 
     */
    public ArrayOfEvtInputLayout createArrayOfEvtInputLayout() {
        return new ArrayOfEvtInputLayout();
    }

    /**
     * Create an instance of {@link ArrayOfEvtExtension }
     * 
     */
    public ArrayOfEvtExtension createArrayOfEvtExtension() {
        return new ArrayOfEvtExtension();
    }

    /**
     * Create an instance of {@link ArrayOfEvtActvyTypFeatureReltn }
     * 
     */
    public ArrayOfEvtActvyTypFeatureReltn createArrayOfEvtActvyTypFeatureReltn() {
        return new ArrayOfEvtActvyTypFeatureReltn();
    }

    /**
     * Create an instance of {@link ArrayOfEvtProductFeatureReltn }
     * 
     */
    public ArrayOfEvtProductFeatureReltn createArrayOfEvtProductFeatureReltn() {
        return new ArrayOfEvtProductFeatureReltn();
    }

    /**
     * Create an instance of {@link ArrayOfEvtPrtyInfo }
     * 
     */
    public ArrayOfEvtPrtyInfo createArrayOfEvtPrtyInfo() {
        return new ArrayOfEvtPrtyInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EVTINPUTBUNDLERESPONSE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EventInputBundleResponse", scope = RunEventInputBundleResponse.class)
    public JAXBElement<EVTINPUTBUNDLERESPONSE> createRunEventInputBundleResponseEventInputBundleResponse(EVTINPUTBUNDLERESPONSE value) {
        return new JAXBElement<EVTINPUTBUNDLERESPONSE>(_RunEventInputBundleResponseEventInputBundleResponse_QNAME, EVTINPUTBUNDLERESPONSE.class, RunEventInputBundleResponse.class, value);
    }

}
