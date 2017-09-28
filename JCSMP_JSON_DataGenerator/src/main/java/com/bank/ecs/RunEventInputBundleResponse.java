
package com.bank.ecs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ecs.data.EVTINPUTBUNDLERESPONSE;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventInputBundleResponse" type="{http://data.ECS}EVTINPUTBUNDLERESPONSE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eventInputBundleResponse"
})
@XmlRootElement(name = "runEventInputBundleResponse")
public class RunEventInputBundleResponse {

    @XmlElementRef(name = "EventInputBundleResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<EVTINPUTBUNDLERESPONSE> eventInputBundleResponse;

    /**
     * Gets the value of the eventInputBundleResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EVTINPUTBUNDLERESPONSE }{@code >}
     *     
     */
    public JAXBElement<EVTINPUTBUNDLERESPONSE> getEventInputBundleResponse() {
        return eventInputBundleResponse;
    }

    /**
     * Sets the value of the eventInputBundleResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EVTINPUTBUNDLERESPONSE }{@code >}
     *     
     */
    public void setEventInputBundleResponse(JAXBElement<EVTINPUTBUNDLERESPONSE> value) {
        this.eventInputBundleResponse = value;
    }

}
