
package ecs.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EVTINPUTBUNDLERESPONSE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EVTINPUTBUNDLERESPONSE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evt__input__res__code" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="4"/>
 *               &lt;pattern value="[0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__input__res__desc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
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
@XmlType(name = "EVTINPUTBUNDLERESPONSE", propOrder = {
    "evtInputResCode",
    "evtInputResDesc"
})
public class EVTINPUTBUNDLERESPONSE {

    @XmlElementRef(name = "evt__input__res__code", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtInputResCode;
    @XmlElementRef(name = "evt__input__res__desc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtInputResDesc;

    /**
     * Gets the value of the evtInputResCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtInputResCode() {
        return evtInputResCode;
    }

    /**
     * Sets the value of the evtInputResCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtInputResCode(JAXBElement<String> value) {
        this.evtInputResCode = value;
    }

    /**
     * Gets the value of the evtInputResDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtInputResDesc() {
        return evtInputResDesc;
    }

    /**
     * Sets the value of the evtInputResDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtInputResDesc(JAXBElement<String> value) {
        this.evtInputResDesc = value;
    }

}
