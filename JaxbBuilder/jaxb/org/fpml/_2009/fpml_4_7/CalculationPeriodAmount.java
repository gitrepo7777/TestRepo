//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:16 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the parameters used in the calculation of fixed or floating rate calculation period amounts or for specifying a known calculation period amount or known amount schedule.
 * 
 * <p>Java class for CalculationPeriodAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculationPeriodAmount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="calculation" type="{http://www.fpml.org/2009/FpML-4-7}Calculation"/>
 *         &lt;element name="knownAmountSchedule" type="{http://www.fpml.org/2009/FpML-4-7}AmountSchedule"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationPeriodAmount", propOrder = {
    "calculation",
    "knownAmountSchedule"
})
public class CalculationPeriodAmount {

    protected Calculation calculation;
    protected AmountSchedule knownAmountSchedule;

    /**
     * Gets the value of the calculation property.
     * 
     * @return
     *     possible object is
     *     {@link Calculation }
     *     
     */
    public Calculation getCalculation() {
        return calculation;
    }

    /**
     * Sets the value of the calculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calculation }
     *     
     */
    public void setCalculation(Calculation value) {
        this.calculation = value;
    }

    /**
     * Gets the value of the knownAmountSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link AmountSchedule }
     *     
     */
    public AmountSchedule getKnownAmountSchedule() {
        return knownAmountSchedule;
    }

    /**
     * Sets the value of the knownAmountSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountSchedule }
     *     
     */
    public void setKnownAmountSchedule(AmountSchedule value) {
        this.knownAmountSchedule = value;
    }

}
