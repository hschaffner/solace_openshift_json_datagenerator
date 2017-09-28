
package com.bank.ecs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ecs.data.EvtExtension;


/**
 * <p>Java class for ArrayOf_evt__extension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_evt__extension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evt__extension" type="{http://data.ECS}evt__extension" maxOccurs="500" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_evt__extension", propOrder = {
    "evtExtension"
})
public class ArrayOfEvtExtension {

    @XmlElement(name = "evt__extension", nillable = true)
    protected List<EvtExtension> evtExtension;

    /**
     * Gets the value of the evtExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evtExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvtExtension }
     * 
     * 
     */
    public List<EvtExtension> getEvtExtension() {
        if (evtExtension == null) {
            evtExtension = new ArrayList<EvtExtension>();
        }
        return this.evtExtension;
    }

}
