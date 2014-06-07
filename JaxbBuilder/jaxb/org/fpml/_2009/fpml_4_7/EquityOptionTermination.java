//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:24 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining Equity Option Termination.
 * 
 * <p>Java class for EquityOptionTermination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityOptionTermination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementAmountPaymentDate" type="{http://www.fpml.org/2009/FpML-4-7}AdjustableDate"/>
 *         &lt;element name="settlementAmount" type="{http://www.fpml.org/2009/FpML-4-7}Money"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityOptionTermination", propOrder = {
    "settlementAmountPaymentDate",
    "settlementAmount"
})
public class EquityOptionTermination {

    @XmlElement(required = true)
    protected AdjustableDate settlementAmountPaymentDate;
    @XmlElement(required = true)
    protected Money settlementAmount;

    /**
     * Gets the value of the settlementAmountPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate }
     *     
     */
    public AdjustableDate getSettlementAmountPaymentDate() {
        return settlementAmountPaymentDate;
    }

    /**
     * Sets the value of the settlementAmountPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate }
     *     
     */
    public void setSettlementAmountPaymentDate(AdjustableDate value) {
        this.settlementAmountPaymentDate = value;
    }

    /**
     * Gets the value of the settlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * Sets the value of the settlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setSettlementAmount(Money value) {
        this.settlementAmount = value;
    }

}
