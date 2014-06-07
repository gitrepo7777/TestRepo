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
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining equity option transaction supplements.
 * 
 * <p>Java class for EquityOptionTransactionSupplement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityOptionTransactionSupplement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}EquityDerivativeShortFormBase">
 *       &lt;sequence>
 *         &lt;element name="exchangeLookAlike" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="exchangeTradedContractNearest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="multipleExchangeIndexAnnexFallback" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="multipleExchangeAnnex" type="{http://www.fpml.org/2009/FpML-4-7}MultipleExchangeAnnex" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="methodOfAdjustment" type="{http://www.fpml.org/2009/FpML-4-7}MethodOfAdjustmentEnum" minOccurs="0"/>
 *         &lt;element name="localJurisdiction" type="{http://www.fpml.org/2009/FpML-4-7}Country" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="optionEntitlement" type="{http://www.fpml.org/2009/FpML-4-7}PositiveDecimal"/>
 *           &lt;element name="multiplier" type="{http://www.fpml.org/2009/FpML-4-7}PositiveDecimal"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityOptionTransactionSupplement", propOrder = {
    "exchangeLookAlike",
    "exchangeTradedContractNearest",
    "multipleExchangeIndexAnnexFallback",
    "multipleExchangeAnnex",
    "methodOfAdjustment",
    "localJurisdiction",
    "optionEntitlement",
    "multiplier"
})
public class EquityOptionTransactionSupplement
    extends EquityDerivativeShortFormBase
{

    protected Boolean exchangeLookAlike;
    protected Boolean exchangeTradedContractNearest;
    protected Boolean multipleExchangeIndexAnnexFallback;
    protected MultipleExchangeAnnex multipleExchangeAnnex;
    protected MethodOfAdjustmentEnum methodOfAdjustment;
    protected Country localJurisdiction;
    protected BigDecimal optionEntitlement;
    protected BigDecimal multiplier;

    /**
     * Gets the value of the exchangeLookAlike property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExchangeLookAlike() {
        return exchangeLookAlike;
    }

    /**
     * Sets the value of the exchangeLookAlike property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExchangeLookAlike(Boolean value) {
        this.exchangeLookAlike = value;
    }

    /**
     * Gets the value of the exchangeTradedContractNearest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExchangeTradedContractNearest() {
        return exchangeTradedContractNearest;
    }

    /**
     * Sets the value of the exchangeTradedContractNearest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExchangeTradedContractNearest(Boolean value) {
        this.exchangeTradedContractNearest = value;
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
     * Gets the value of the methodOfAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link MethodOfAdjustmentEnum }
     *     
     */
    public MethodOfAdjustmentEnum getMethodOfAdjustment() {
        return methodOfAdjustment;
    }

    /**
     * Sets the value of the methodOfAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodOfAdjustmentEnum }
     *     
     */
    public void setMethodOfAdjustment(MethodOfAdjustmentEnum value) {
        this.methodOfAdjustment = value;
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
     * Gets the value of the optionEntitlement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOptionEntitlement() {
        return optionEntitlement;
    }

    /**
     * Sets the value of the optionEntitlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOptionEntitlement(BigDecimal value) {
        this.optionEntitlement = value;
    }

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplier(BigDecimal value) {
        this.multiplier = value;
    }

}
