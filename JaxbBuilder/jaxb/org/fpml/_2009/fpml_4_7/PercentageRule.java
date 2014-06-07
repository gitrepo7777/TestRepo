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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a content model for a calculation rule defined as percentage of the notional amount.
 * 
 * <p>Java class for PercentageRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PercentageRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}PaymentRule">
 *       &lt;sequence>
 *         &lt;element name="paymentPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="notionalAmountReference" type="{http://www.fpml.org/2009/FpML-4-7}NotionalAmountReference"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageRule", propOrder = {
    "paymentPercent",
    "notionalAmountReference"
})
public class PercentageRule
    extends PaymentRule
{

    @XmlElement(required = true)
    protected BigDecimal paymentPercent;
    @XmlElement(required = true)
    protected NotionalAmountReference notionalAmountReference;

    /**
     * Gets the value of the paymentPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentPercent() {
        return paymentPercent;
    }

    /**
     * Sets the value of the paymentPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentPercent(BigDecimal value) {
        this.paymentPercent = value;
    }

    /**
     * Gets the value of the notionalAmountReference property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmountReference }
     *     
     */
    public NotionalAmountReference getNotionalAmountReference() {
        return notionalAmountReference;
    }

    /**
     * Sets the value of the notionalAmountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmountReference }
     *     
     */
    public void setNotionalAmountReference(NotionalAmountReference value) {
        this.notionalAmountReference = value;
    }

}