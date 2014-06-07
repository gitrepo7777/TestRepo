//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartialTerminationAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartialTerminationAmount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="decreaseInNotionalAmount" type="{http://www.fpml.org/2009/FpML-4-7}Money"/>
 *             &lt;element name="outstandingNotionalAmount" type="{http://www.fpml.org/2009/FpML-4-7}Money"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="decreaseInNumberOfOptions" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *             &lt;element name="outstandingNumberOfOptions" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartialTerminationAmount", propOrder = {
    "decreaseInNotionalAmount",
    "outstandingNotionalAmount",
    "decreaseInNumberOfOptions",
    "outstandingNumberOfOptions"
})
public class PartialTerminationAmount {

    protected Money decreaseInNotionalAmount;
    protected Money outstandingNotionalAmount;
    protected BigDecimal decreaseInNumberOfOptions;
    protected BigDecimal outstandingNumberOfOptions;

    /**
     * Gets the value of the decreaseInNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getDecreaseInNotionalAmount() {
        return decreaseInNotionalAmount;
    }

    /**
     * Sets the value of the decreaseInNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setDecreaseInNotionalAmount(Money value) {
        this.decreaseInNotionalAmount = value;
    }

    /**
     * Gets the value of the outstandingNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getOutstandingNotionalAmount() {
        return outstandingNotionalAmount;
    }

    /**
     * Sets the value of the outstandingNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setOutstandingNotionalAmount(Money value) {
        this.outstandingNotionalAmount = value;
    }

    /**
     * Gets the value of the decreaseInNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecreaseInNumberOfOptions() {
        return decreaseInNumberOfOptions;
    }

    /**
     * Sets the value of the decreaseInNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecreaseInNumberOfOptions(BigDecimal value) {
        this.decreaseInNumberOfOptions = value;
    }

    /**
     * Gets the value of the outstandingNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutstandingNumberOfOptions() {
        return outstandingNumberOfOptions;
    }

    /**
     * Sets the value of the outstandingNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutstandingNumberOfOptions(BigDecimal value) {
        this.outstandingNumberOfOptions = value;
    }

}