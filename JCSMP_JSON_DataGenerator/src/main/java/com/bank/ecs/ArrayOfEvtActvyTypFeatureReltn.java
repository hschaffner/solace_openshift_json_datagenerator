
package com.bank.ecs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ecs.data.EvtActvyTypFeatureReltn;


/**
 * <p>Java class for ArrayOf_evt__actvy__typ__feature__reltn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_evt__actvy__typ__feature__reltn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evt__actvy__typ__feature__reltn" type="{http://data.ECS}evt__actvy__typ__feature__reltn" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_evt__actvy__typ__feature__reltn", propOrder = {
    "evtActvyTypFeatureReltn"
})
public class ArrayOfEvtActvyTypFeatureReltn {

    @XmlElement(name = "evt__actvy__typ__feature__reltn", required = true)
    protected List<EvtActvyTypFeatureReltn> evtActvyTypFeatureReltn;

    /**
     * Gets the value of the evtActvyTypFeatureReltn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evtActvyTypFeatureReltn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtActvyTypFeatureReltn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvtActvyTypFeatureReltn }
     * 
     * 
     */
    public List<EvtActvyTypFeatureReltn> getEvtActvyTypFeatureReltn() {
        if (evtActvyTypFeatureReltn == null) {
            evtActvyTypFeatureReltn = new ArrayList<EvtActvyTypFeatureReltn>();
        }
        return this.evtActvyTypFeatureReltn;
    }

}
