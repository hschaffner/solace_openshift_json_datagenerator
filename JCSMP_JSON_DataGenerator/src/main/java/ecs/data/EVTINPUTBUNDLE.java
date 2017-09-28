
package ecs.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bank.ecs.ArrayOfEvtInputLayout;


/**
 * <p>Java class for EVTINPUTBUNDLE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EVTINPUTBUNDLE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evt__input__layouts" type="{http://ECS.RBC.COM}ArrayOf_evt__input__layout"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EVTINPUTBUNDLE", propOrder = {
    "evtInputLayouts"
})
public class EVTINPUTBUNDLE {

    @XmlElement(name = "evt__input__layouts", required = true)
    protected ArrayOfEvtInputLayout evtInputLayouts;

    /**
     * Gets the value of the evtInputLayouts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEvtInputLayout }
     *     
     */
    public ArrayOfEvtInputLayout getEvtInputLayouts() {
        return evtInputLayouts;
    }

    /**
     * Sets the value of the evtInputLayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEvtInputLayout }
     *     
     */
    public void setEvtInputLayouts(ArrayOfEvtInputLayout value) {
        this.evtInputLayouts = value;
    }

}
