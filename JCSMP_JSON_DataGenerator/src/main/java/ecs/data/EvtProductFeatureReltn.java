
package ecs.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for evt__product__feature__reltn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="evt__product__feature__reltn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evt__product__feature__name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__product__feature__cd">
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
@XmlType(name = "evt__product__feature__reltn", propOrder = {
    "evtProductFeatureName",
    "evtProductFeatureCd"
})
public class EvtProductFeatureReltn {

    @XmlElement(name = "evt__product__feature__name", required = true)
    protected String evtProductFeatureName;
    @XmlElement(name = "evt__product__feature__cd", required = true)
    protected String evtProductFeatureCd;

    /**
     * Gets the value of the evtProductFeatureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtProductFeatureName() {
        return evtProductFeatureName;
    }

    /**
     * Sets the value of the evtProductFeatureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtProductFeatureName(String value) {
        this.evtProductFeatureName = value;
    }

    /**
     * Gets the value of the evtProductFeatureCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtProductFeatureCd() {
        return evtProductFeatureCd;
    }

    /**
     * Sets the value of the evtProductFeatureCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtProductFeatureCd(String value) {
        this.evtProductFeatureCd = value;
    }

}
