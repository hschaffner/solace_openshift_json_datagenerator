
package com.bank.ecs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="evt__msg__version">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="20"/>
 *               &lt;pattern value="1.3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "evtMsgVersion"
})
@XmlRootElement(name = "getUUIDRequest")
public class GetUUIDRequest {

    @XmlElement(name = "evt__msg__version", required = true)
    protected String evtMsgVersion;

    /**
     * Gets the value of the evtMsgVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtMsgVersion() {
        return evtMsgVersion;
    }

    /**
     * Sets the value of the evtMsgVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtMsgVersion(String value) {
        this.evtMsgVersion = value;
    }

}
