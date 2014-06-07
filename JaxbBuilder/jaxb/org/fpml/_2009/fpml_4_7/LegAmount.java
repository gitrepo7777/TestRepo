//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:46 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the amount that will paid or received on each of the payment dates. This type is used to define both the Equity Amount and the Interest Amount.
 * 
 * <p>Java class for LegAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegAmount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}CurrencyAndDeterminationMethod.model" minOccurs="0"/>
 *         &lt;element name="paymentCurrency" type="{http://www.fpml.org/2009/FpML-4-7}PaymentCurrency" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="referenceAmount" type="{http://www.fpml.org/2009/FpML-4-7}ReferenceAmount"/>
 *           &lt;element name="formula" type="{http://www.fpml.org/2009/FpML-4-7}Formula"/>
 *           &lt;element name="encodedDescription" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="variance" type="{http://www.fpml.org/2009/FpML-4-7}DeprecatedVariance"/>
 *         &lt;/choice>
 *         &lt;element name="calculationDates" type="{http://www.fpml.org/2009/FpML-4-7}AdjustableRelativeOrPeriodicDates" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegAmount", propOrder = {
    "currency",
    "determinationMethod",
    "currencyReference",
    "paymentCurrency",
    "referenceAmount",
    "formula",
    "encodedDescription",
    "variance",
    "calculationDates"
})
@XmlSeeAlso({
    ReturnSwapAmount.class
})
public class LegAmount {

    protected Currency currency;
    protected DeterminationMethod determinationMethod;
    protected IdentifiedCurrencyReference currencyReference;
    protected PaymentCurrency paymentCurrency;
    protected ReferenceAmount referenceAmount;
    protected Formula formula;
    protected byte[] encodedDescription;
    protected DeprecatedVariance variance;
    protected AdjustableRelativeOrPeriodicDates calculationDates;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the determinationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DeterminationMethod }
     *     
     */
    public DeterminationMethod getDeterminationMethod() {
        return determinationMethod;
    }

    /**
     * Sets the value of the determinationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeterminationMethod }
     *     
     */
    public void setDeterminationMethod(DeterminationMethod value) {
        this.determinationMethod = value;
    }

    /**
     * Gets the value of the currencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedCurrencyReference }
     *     
     */
    public IdentifiedCurrencyReference getCurrencyReference() {
        return currencyReference;
    }

    /**
     * Sets the value of the currencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedCurrencyReference }
     *     
     */
    public void setCurrencyReference(IdentifiedCurrencyReference value) {
        this.currencyReference = value;
    }

    /**
     * Gets the value of the paymentCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCurrency }
     *     
     */
    public PaymentCurrency getPaymentCurrency() {
        return paymentCurrency;
    }

    /**
     * Sets the value of the paymentCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCurrency }
     *     
     */
    public void setPaymentCurrency(PaymentCurrency value) {
        this.paymentCurrency = value;
    }

    /**
     * Gets the value of the referenceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceAmount }
     *     
     */
    public ReferenceAmount getReferenceAmount() {
        return referenceAmount;
    }

    /**
     * Sets the value of the referenceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceAmount }
     *     
     */
    public void setReferenceAmount(ReferenceAmount value) {
        this.referenceAmount = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link Formula }
     *     
     */
    public Formula getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link Formula }
     *     
     */
    public void setFormula(Formula value) {
        this.formula = value;
    }

    /**
     * Gets the value of the encodedDescription property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncodedDescription() {
        return encodedDescription;
    }

    /**
     * Sets the value of the encodedDescription property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncodedDescription(byte[] value) {
        this.encodedDescription = ((byte[]) value);
    }

    /**
     * Gets the value of the variance property.
     * 
     * @return
     *     possible object is
     *     {@link DeprecatedVariance }
     *     
     */
    public DeprecatedVariance getVariance() {
        return variance;
    }

    /**
     * Sets the value of the variance property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeprecatedVariance }
     *     
     */
    public void setVariance(DeprecatedVariance value) {
        this.variance = value;
    }

    /**
     * Gets the value of the calculationDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableRelativeOrPeriodicDates }
     *     
     */
    public AdjustableRelativeOrPeriodicDates getCalculationDates() {
        return calculationDates;
    }

    /**
     * Sets the value of the calculationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableRelativeOrPeriodicDates }
     *     
     */
    public void setCalculationDates(AdjustableRelativeOrPeriodicDates value) {
        this.calculationDates = value;
    }

}
