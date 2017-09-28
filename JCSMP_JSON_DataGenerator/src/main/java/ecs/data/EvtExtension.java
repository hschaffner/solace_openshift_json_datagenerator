
package ecs.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for evt__extension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="evt__extension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evt__extension__name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__extension__value" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__extension__seq__no" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="18"/>
 *               &lt;pattern value="[0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__extension__debug__strg" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="500"/>
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
@XmlType(name = "evt__extension", propOrder = {
    "evtExtensionName",
    "evtExtensionValue",
    "evtExtensionSeqNo",
    "evtExtensionDebugStrg"
})
public class EvtExtension {

    @XmlElementRef(name = "evt__extension__name", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtExtensionName;
    @XmlElementRef(name = "evt__extension__value", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtExtensionValue;
    @XmlElementRef(name = "evt__extension__seq__no", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtExtensionSeqNo;
    @XmlElementRef(name = "evt__extension__debug__strg", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtExtensionDebugStrg;

    /**
     * Gets the value of the evtExtensionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtExtensionName() {
        return evtExtensionName;
    }

    /**
     * Sets the value of the evtExtensionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtExtensionName(JAXBElement<String> value) {
        this.evtExtensionName = value;
    }

    /**
     * Gets the value of the evtExtensionValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtExtensionValue() {
        return evtExtensionValue;
    }

    /**
     * Sets the value of the evtExtensionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtExtensionValue(JAXBElement<String> value) {
        this.evtExtensionValue = value;
    }

    /**
     * Gets the value of the evtExtensionSeqNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtExtensionSeqNo() {
        return evtExtensionSeqNo;
    }

    /**
     * Sets the value of the evtExtensionSeqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtExtensionSeqNo(JAXBElement<String> value) {
        this.evtExtensionSeqNo = value;
    }

    /**
     * Gets the value of the evtExtensionDebugStrg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtExtensionDebugStrg() {
        return evtExtensionDebugStrg;
    }

    /**
     * Sets the value of the evtExtensionDebugStrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtExtensionDebugStrg(JAXBElement<String> value) {
        this.evtExtensionDebugStrg = value;
    }

}
