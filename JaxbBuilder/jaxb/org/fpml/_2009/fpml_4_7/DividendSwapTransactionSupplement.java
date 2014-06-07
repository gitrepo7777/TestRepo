//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:37 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A Dividend Swap Transaction Supplement.
 * 
 * <p>Java class for DividendSwapTransactionSupplement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DividendSwapTransactionSupplement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}Product">
 *       &lt;sequence>
 *         &lt;element name="dividendLeg" type="{http://www.fpml.org/2009/FpML-4-7}DividendLeg"/>
 *         &lt;element name="fixedLeg" type="{http://www.fpml.org/2009/FpML-4-7}FixedPaymentLeg"/>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}EquityUnderlyerProvisions.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DividendSwapTransactionSupplement", propOrder = {
    "dividendLeg",
    "fixedLeg",
    "multipleExchangeIndexAnnexFallback",
    "multipleExchangeAnnex",
    "localJurisdiction",
    "relevantJurisdiction"
})
public class DividendSwapTransactionSupplement
    extends Product
{

    @XmlElement(required = true)
    protected DividendLeg dividendLeg;
    @XmlElement(required = true)
    protected FixedPaymentLeg fixedLeg;
    protected Boolean multipleExchangeIndexAnnexFallback;
    protected MultipleExchangeAnnex multipleExchangeAnnex;
    protected Country localJurisdiction;
    protected Country relevantJurisdiction;

    /**
     * Gets the value of the dividendLeg property.
     * 
     * @return
     *     possible object is
     *     {@link DividendLeg }
     *     
     */
    public DividendLeg getDividendLeg() {
        return dividendLeg;
    }

    /**
     * Sets the value of the dividendLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendLeg }
     *     
     */
    public void setDividendLeg(DividendLeg value) {
        this.dividendLeg = value;
    }

    /**
     * Gets the value of the fixedLeg property.
     * 
     * @return
     *     possible object is
     *     {@link FixedPaymentLeg }
     *     
     */
    public FixedPaymentLeg getFixedLeg() {
        return fixedLeg;
    }

    /**
     * Sets the value of the fixedLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedPaymentLeg }
     *     
     */
    public void setFixedLeg(FixedPaymentLeg value) {
        this.fixedLeg = value;
    }

    /**
     * Gets the value of the multipleExchangeIndexAnnexFallback property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleExchangeIndexAnnexFallback() {
        return multipleExchangeIndexAnnexFallback;
    }

    /**
     * Sets the value of the multipleExchangeIndexAnnexFallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleExchangeIndexAnnexFallback(Boolean value) {
        this.multipleExchangeIndexAnnexFallback = value;
    }

    /**
     * Gets the value of the multipleExchangeAnnex property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleExchangeAnnex }
     *     
     */
    public MultipleExchangeAnnex getMultipleExchangeAnnex() {
        return multipleExchangeAnnex;
    }

    /**
     * Sets the value of the multipleExchangeAnnex property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleExchangeAnnex }
     *     
     */
    public void setMultipleExchangeAnnex(MultipleExchangeAnnex value) {
        this.multipleExchangeAnnex = value;
    }

    /**
     * Gets the value of the localJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getLocalJurisdiction() {
        return localJurisdiction;
    }

    /**
     * Sets the value of the localJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setLocalJurisdiction(Country value) {
        this.localJurisdiction = value;
    }

    /**
     * Gets the value of the relevantJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getRelevantJurisdiction() {
        return relevantJurisdiction;
    }

    /**
     * Sets the value of the relevantJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setRelevantJurisdiction(Country value) {
        this.relevantJurisdiction = value;
    }

}
