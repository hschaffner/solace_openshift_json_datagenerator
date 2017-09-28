
package com.bank.ecs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ecs.data.EVTINPUTBUNDLE;


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
 *         &lt;element name="EventInputBundle" type="{http://data.ECS}EVTINPUTBUNDLE"/>
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
    "eventInputBundle"
})
@XmlRootElement(name = "runEventInputBundle")
public class RunEventInputBundle {

    @XmlElement(name = "EventInputBundle", required = true)
    protected EVTINPUTBUNDLE eventInputBundle;

    /**
     * Gets the value of the eventInputBundle property.
     * 
     * @return
     *     possible object is
     *     {@link EVTINPUTBUNDLE }
     *     
     */
    public EVTINPUTBUNDLE getEventInputBundle() {
        return eventInputBundle;
    }

    /**
     * Sets the value of the eventInputBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EVTINPUTBUNDLE }
     *     
     */
    public void setEventInputBundle(EVTINPUTBUNDLE value) {
        this.eventInputBundle = value;
    }

}
