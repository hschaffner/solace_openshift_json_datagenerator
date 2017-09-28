
package ecs.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for evt__prty__info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="evt__prty__info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="evt__clnt__no">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;minLength value="1"/>
 *                 &lt;maxLength value="13"/>
 *                 &lt;pattern value="[0-9]+"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="evt__prspct__id">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;minLength value="1"/>
 *                 &lt;maxLength value="100"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="evt__employee__id">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;minLength value="1"/>
 *                 &lt;maxLength value="9"/>
 *                 &lt;pattern value="[0-9]+"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="evt__payee__id">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;minLength value="1"/>
 *                 &lt;maxLength value="9"/>
 *                 &lt;pattern value="[0-9]+"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="evt__secaf__card__id">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;minLength value="1"/>
 *                 &lt;maxLength value="10"/>
 *                 &lt;pattern value="[0-9]+"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="evt__party__search__key">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;minLength value="1"/>
 *                 &lt;maxLength value="100"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="evt__prty__sys__app__cd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="4"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__prty__reltn__typ__cd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__prty__role__cd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
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
@XmlType(name = "evt__prty__info", propOrder = {
    "evtClntNo",
    "evtPrspctId",
    "evtEmployeeId",
    "evtPayeeId",
    "evtSecafCardId",
    "evtPartySearchKey",
    "evtPrtySysAppCd",
    "evtPrtyReltnTypCd",
    "evtPrtyRoleCd"
})
public class EvtPrtyInfo {

    @XmlElement(name = "evt__clnt__no")
    protected String evtClntNo;
    @XmlElement(name = "evt__prspct__id")
    protected String evtPrspctId;
    @XmlElement(name = "evt__employee__id")
    protected String evtEmployeeId;
    @XmlElement(name = "evt__payee__id")
    protected String evtPayeeId;
    @XmlElement(name = "evt__secaf__card__id")
    protected String evtSecafCardId;
    @XmlElement(name = "evt__party__search__key")
    protected String evtPartySearchKey;
    @XmlElement(name = "evt__prty__sys__app__cd", required = true)
    protected String evtPrtySysAppCd;
    @XmlElement(name = "evt__prty__reltn__typ__cd", required = true)
    protected String evtPrtyReltnTypCd;
    @XmlElement(name = "evt__prty__role__cd", required = true)
    protected String evtPrtyRoleCd;

    /**
     * Gets the value of the evtClntNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtClntNo() {
        return evtClntNo;
    }

    /**
     * Sets the value of the evtClntNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtClntNo(String value) {
        this.evtClntNo = value;
    }

    /**
     * Gets the value of the evtPrspctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtPrspctId() {
        return evtPrspctId;
    }

    /**
     * Sets the value of the evtPrspctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtPrspctId(String value) {
        this.evtPrspctId = value;
    }

    /**
     * Gets the value of the evtEmployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtEmployeeId() {
        return evtEmployeeId;
    }

    /**
     * Sets the value of the evtEmployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtEmployeeId(String value) {
        this.evtEmployeeId = value;
    }

    /**
     * Gets the value of the evtPayeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtPayeeId() {
        return evtPayeeId;
    }

    /**
     * Sets the value of the evtPayeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtPayeeId(String value) {
        this.evtPayeeId = value;
    }

    /**
     * Gets the value of the evtSecafCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtSecafCardId() {
        return evtSecafCardId;
    }

    /**
     * Sets the value of the evtSecafCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtSecafCardId(String value) {
        this.evtSecafCardId = value;
    }

    /**
     * Gets the value of the evtPartySearchKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtPartySearchKey() {
        return evtPartySearchKey;
    }

    /**
     * Sets the value of the evtPartySearchKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtPartySearchKey(String value) {
        this.evtPartySearchKey = value;
    }

    /**
     * Gets the value of the evtPrtySysAppCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtPrtySysAppCd() {
        return evtPrtySysAppCd;
    }

    /**
     * Sets the value of the evtPrtySysAppCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtPrtySysAppCd(String value) {
        this.evtPrtySysAppCd = value;
    }

    /**
     * Gets the value of the evtPrtyReltnTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtPrtyReltnTypCd() {
        return evtPrtyReltnTypCd;
    }

    /**
     * Sets the value of the evtPrtyReltnTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtPrtyReltnTypCd(String value) {
        this.evtPrtyReltnTypCd = value;
    }

    /**
     * Gets the value of the evtPrtyRoleCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtPrtyRoleCd() {
        return evtPrtyRoleCd;
    }

    /**
     * Sets the value of the evtPrtyRoleCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtPrtyRoleCd(String value) {
        this.evtPrtyRoleCd = value;
    }

}
