
package com.bank.ecs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ecs.data.EvtPrtyInfo;


/**
 * <p>Java class for ArrayOf_evt__prty__info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_evt__prty__info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evt__prty__info" type="{http://data.ECS}evt__prty__info" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_evt__prty__info", propOrder = {
    "evtPrtyInfo"
})
public class ArrayOfEvtPrtyInfo {

    @XmlElement(name = "evt__prty__info", nillable = true)
    protected List<EvtPrtyInfo> evtPrtyInfo;

    /**
     * Gets the value of the evtPrtyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evtPrtyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtPrtyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvtPrtyInfo }
     * 
     * 
     */
    public List<EvtPrtyInfo> getEvtPrtyInfo() {
        if (evtPrtyInfo == null) {
            evtPrtyInfo = new ArrayList<EvtPrtyInfo>();
        }
        return this.evtPrtyInfo;
    }

}
