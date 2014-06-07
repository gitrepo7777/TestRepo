//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:16 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type to provide the ability to point to multiple payment nodes in the document through the unbounded paymentDatesReference.
 * 
 * <p>Java class for DateRelativeToCalculationPeriodDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateRelativeToCalculationPeriodDates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculationPeriodDatesReference" type="{http://www.fpml.org/2009/FpML-4-7}CalculationPeriodDatesReference" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateRelativeToCalculationPeriodDates", propOrder = {
    "calculationPeriodDatesReference"
})
public class DateRelativeToCalculationPeriodDates {

    @XmlElement(required = true)
    protected List<CalculationPeriodDatesReference> calculationPeriodDatesReference;

    /**
     * Gets the value of the calculationPeriodDatesReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculationPeriodDatesReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculationPeriodDatesReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalculationPeriodDatesReference }
     * 
     * 
     */
    public List<CalculationPeriodDatesReference> getCalculationPeriodDatesReference() {
        if (calculationPeriodDatesReference == null) {
            calculationPeriodDatesReference = new ArrayList<CalculationPeriodDatesReference>();
        }
        return this.calculationPeriodDatesReference;
    }

}