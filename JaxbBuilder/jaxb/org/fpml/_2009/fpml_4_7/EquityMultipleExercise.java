//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:24 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining the multiple exercise provisions of an American or Bermuda style equity option.
 * 
 * <p>Java class for EquityMultipleExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityMultipleExercise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="integralMultipleExercise" type="{http://www.fpml.org/2009/FpML-4-7}PositiveDecimal" minOccurs="0"/>
 *         &lt;element name="minimumNumberOfOptions" type="{http://www.fpml.org/2009/FpML-4-7}NonNegativeDecimal"/>
 *         &lt;element name="maximumNumberOfOptions" type="{http://www.fpml.org/2009/FpML-4-7}NonNegativeDecimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityMultipleExercise", propOrder = {
    "integralMultipleExercise",
    "minimumNumberOfOptions",
    "maximumNumberOfOptions"
})
public class EquityMultipleExercise {

    protected BigDecimal integralMultipleExercise;
    @XmlElement(required = true)
    protected BigDecimal minimumNumberOfOptions;
    @XmlElement(required = true)
    protected BigDecimal maximumNumberOfOptions;

    /**
     * Gets the value of the integralMultipleExercise property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntegralMultipleExercise() {
        return integralMultipleExercise;
    }

    /**
     * Sets the value of the integralMultipleExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntegralMultipleExercise(BigDecimal value) {
        this.integralMultipleExercise = value;
    }

    /**
     * Gets the value of the minimumNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumNumberOfOptions() {
        return minimumNumberOfOptions;
    }

    /**
     * Sets the value of the minimumNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumNumberOfOptions(BigDecimal value) {
        this.minimumNumberOfOptions = value;
    }

    /**
     * Gets the value of the maximumNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumNumberOfOptions() {
        return maximumNumberOfOptions;
    }

    /**
     * Sets the value of the maximumNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumNumberOfOptions(BigDecimal value) {
        this.maximumNumberOfOptions = value;
    }

}
