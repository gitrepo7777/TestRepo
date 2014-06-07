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
 * Specifies the compounding method and the compounding rate.
 * 
 * <p>Java class for Compounding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compounding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compoundingMethod" type="{http://www.fpml.org/2009/FpML-4-7}CompoundingMethodEnum" minOccurs="0"/>
 *         &lt;element name="compoundingRate" type="{http://www.fpml.org/2009/FpML-4-7}CompoundingRate"/>
 *         &lt;element name="compoundingSpread" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compounding", propOrder = {
    "compoundingMethod",
    "compoundingRate",
    "compoundingSpread"
})
public class Compounding {

    protected CompoundingMethodEnum compoundingMethod;
    @XmlElement(required = true)
    protected CompoundingRate compoundingRate;
    protected BigDecimal compoundingSpread;

    /**
     * Gets the value of the compoundingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundingMethodEnum }
     *     
     */
    public CompoundingMethodEnum getCompoundingMethod() {
        return compoundingMethod;
    }

    /**
     * Sets the value of the compoundingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundingMethodEnum }
     *     
     */
    public void setCompoundingMethod(CompoundingMethodEnum value) {
        this.compoundingMethod = value;
    }

    /**
     * Gets the value of the compoundingRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundingRate }
     *     
     */
    public CompoundingRate getCompoundingRate() {
        return compoundingRate;
    }

    /**
     * Sets the value of the compoundingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundingRate }
     *     
     */
    public void setCompoundingRate(CompoundingRate value) {
        this.compoundingRate = value;
    }

    /**
     * Gets the value of the compoundingSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompoundingSpread() {
        return compoundingSpread;
    }

    /**
     * Sets the value of the compoundingSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompoundingSpread(BigDecimal value) {
        this.compoundingSpread = value;
    }

}