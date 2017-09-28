
package ecs.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for evt__actvy__typ__feature__reltn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="evt__actvy__typ__feature__reltn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evt__actvy__typ__feature__name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__actvy__typ__feature__cd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
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
@XmlType(name = "evt__actvy__typ__feature__reltn", propOrder = {
    "evtActvyTypFeatureName",
    "evtActvyTypFeatureCd"
})
public class EvtActvyTypFeatureReltn {

    @XmlElement(name = "evt__actvy__typ__feature__name", required = true)
    protected String evtActvyTypFeatureName;
    @XmlElement(name = "evt__actvy__typ__feature__cd", required = true)
    protected String evtActvyTypFeatureCd;

    /**
     * Gets the value of the evtActvyTypFeatureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtActvyTypFeatureName() {
        return evtActvyTypFeatureName;
    }

    /**
     * Sets the value of the evtActvyTypFeatureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtActvyTypFeatureName(String value) {
        this.evtActvyTypFeatureName = value;
    }

    /**
     * Gets the value of the evtActvyTypFeatureCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtActvyTypFeatureCd() {
        return evtActvyTypFeatureCd;
    }

    /**
     * Sets the value of the evtActvyTypFeatureCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtActvyTypFeatureCd(String value) {
        this.evtActvyTypFeatureCd = value;
    }

}
