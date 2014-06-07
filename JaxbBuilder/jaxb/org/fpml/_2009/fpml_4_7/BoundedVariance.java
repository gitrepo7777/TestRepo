//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:46 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing variance bounds, which are used to exclude money price values outside of the specified range In a Up Conditional Swap Underlyer price must be equal to or higher than Lower Barrier In a Down Conditional Swap Underlyer price must be equal to or lower than Upper Barrier In a Corridor Conditional Swap Underlyer price must be equal to or higher than Lower Barrier and must be equal to or lower than Upper Barrier.
 * 
 * <p>Java class for BoundedVariance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoundedVariance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="realisedVarianceMethod" type="{http://www.fpml.org/2009/FpML-4-7}RealisedVarianceMethodEnum"/>
 *         &lt;element name="daysInRangeAdjustment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="upperBarrier" type="{http://www.fpml.org/2009/FpML-4-7}NonNegativeDecimal" minOccurs="0"/>
 *         &lt;element name="lowerBarrier" type="{http://www.fpml.org/2009/FpML-4-7}NonNegativeDecimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundedVariance", propOrder = {
    "realisedVarianceMethod",
    "daysInRangeAdjustment",
    "upperBarrier",
    "lowerBarrier"
})
public class BoundedVariance {

    @XmlElement(required = true)
    protected RealisedVarianceMethodEnum realisedVarianceMethod;
    protected boolean daysInRangeAdjustment;
    protected BigDecimal upperBarrier;
    protected BigDecimal lowerBarrier;

    /**
     * Gets the value of the realisedVarianceMethod property.
     * 
     * @return
     *     possible object is
     *     {@link RealisedVarianceMethodEnum }
     *     
     */
    public RealisedVarianceMethodEnum getRealisedVarianceMethod() {
        return realisedVarianceMethod;
    }

    /**
     * Sets the value of the realisedVarianceMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealisedVarianceMethodEnum }
     *     
     */
    public void setRealisedVarianceMethod(RealisedVarianceMethodEnum value) {
        this.realisedVarianceMethod = value;
    }

    /**
     * Gets the value of the daysInRangeAdjustment property.
     * 
     */
    public boolean isDaysInRangeAdjustment() {
        return daysInRangeAdjustment;
    }

    /**
     * Sets the value of the daysInRangeAdjustment property.
     * 
     */
    public void setDaysInRangeAdjustment(boolean value) {
        this.daysInRangeAdjustment = value;
    }

    /**
     * Gets the value of the upperBarrier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpperBarrier() {
        return upperBarrier;
    }

    /**
     * Sets the value of the upperBarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpperBarrier(BigDecimal value) {
        this.upperBarrier = value;
    }

    /**
     * Gets the value of the lowerBarrier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowerBarrier() {
        return lowerBarrier;
    }

    /**
     * Sets the value of the lowerBarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowerBarrier(BigDecimal value) {
        this.lowerBarrier = value;
    }

}
