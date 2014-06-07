//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodicDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodicDates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculationStartDate" type="{http://www.fpml.org/2009/FpML-4-7}AdjustableOrRelativeDate"/>
 *         &lt;element name="calculationEndDate" type="{http://www.fpml.org/2009/FpML-4-7}AdjustableOrRelativeDate" minOccurs="0"/>
 *         &lt;element name="calculationPeriodFrequency" type="{http://www.fpml.org/2009/FpML-4-7}CalculationPeriodFrequency"/>
 *         &lt;element name="calculationPeriodDatesAdjustments" type="{http://www.fpml.org/2009/FpML-4-7}BusinessDayAdjustments"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodicDates", propOrder = {
    "calculationStartDate",
    "calculationEndDate",
    "calculationPeriodFrequency",
    "calculationPeriodDatesAdjustments"
})
public class PeriodicDates {

    @XmlElement(required = true)
    protected AdjustableOrRelativeDate calculationStartDate;
    protected AdjustableOrRelativeDate calculationEndDate;
    @XmlElement(required = true)
    protected CalculationPeriodFrequency calculationPeriodFrequency;
    @XmlElement(required = true)
    protected BusinessDayAdjustments calculationPeriodDatesAdjustments;

    /**
     * Gets the value of the calculationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getCalculationStartDate() {
        return calculationStartDate;
    }

    /**
     * Sets the value of the calculationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setCalculationStartDate(AdjustableOrRelativeDate value) {
        this.calculationStartDate = value;
    }

    /**
     * Gets the value of the calculationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getCalculationEndDate() {
        return calculationEndDate;
    }

    /**
     * Sets the value of the calculationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setCalculationEndDate(AdjustableOrRelativeDate value) {
        this.calculationEndDate = value;
    }

    /**
     * Gets the value of the calculationPeriodFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationPeriodFrequency }
     *     
     */
    public CalculationPeriodFrequency getCalculationPeriodFrequency() {
        return calculationPeriodFrequency;
    }

    /**
     * Sets the value of the calculationPeriodFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationPeriodFrequency }
     *     
     */
    public void setCalculationPeriodFrequency(CalculationPeriodFrequency value) {
        this.calculationPeriodFrequency = value;
    }

    /**
     * Gets the value of the calculationPeriodDatesAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayAdjustments }
     *     
     */
    public BusinessDayAdjustments getCalculationPeriodDatesAdjustments() {
        return calculationPeriodDatesAdjustments;
    }

    /**
     * Sets the value of the calculationPeriodDatesAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayAdjustments }
     *     
     */
    public void setCalculationPeriodDatesAdjustments(BusinessDayAdjustments value) {
        this.calculationPeriodDatesAdjustments = value;
    }

}