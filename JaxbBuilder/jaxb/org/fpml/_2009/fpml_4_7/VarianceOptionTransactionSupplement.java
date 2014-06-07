//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:52:39 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VarianceOptionTransactionSupplement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VarianceOptionTransactionSupplement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}OptionBase">
 *       &lt;sequence>
 *         &lt;element name="equityPremium" type="{http://www.fpml.org/2009/FpML-4-7}EquityPremium"/>
 *         &lt;element name="equityExercise" type="{http://www.fpml.org/2009/FpML-4-7}EquityExerciseValuationSettlement"/>
 *         &lt;element name="exchangeLookAlike" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="methodOfAdjustment" type="{http://www.fpml.org/2009/FpML-4-7}MethodOfAdjustmentEnum" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="optionEntitlement" type="{http://www.fpml.org/2009/FpML-4-7}PositiveDecimal"/>
 *           &lt;element name="multiplier" type="{http://www.fpml.org/2009/FpML-4-7}PositiveDecimal"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.fpml.org/2009/FpML-4-7}varianceSwapTransactionSupplement"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VarianceOptionTransactionSupplement", propOrder = {
    "equityPremium",
    "equityExercise",
    "exchangeLookAlike",
    "methodOfAdjustment",
    "optionEntitlement",
    "multiplier",
    "varianceSwapTransactionSupplement"
})
public class VarianceOptionTransactionSupplement
    extends OptionBase
{

    @XmlElement(required = true)
    protected EquityPremium equityPremium;
    @XmlElement(required = true)
    protected EquityExerciseValuationSettlement equityExercise;
    protected Boolean exchangeLookAlike;
    protected MethodOfAdjustmentEnum methodOfAdjustment;
    protected BigDecimal optionEntitlement;
    protected BigDecimal multiplier;
    @XmlElement(required = true)
    protected VarianceSwapTransactionSupplement varianceSwapTransactionSupplement;

    /**
     * Gets the value of the equityPremium property.
     * 
     * @return
     *     possible object is
     *     {@link EquityPremium }
     *     
     */
    public EquityPremium getEquityPremium() {
        return equityPremium;
    }

    /**
     * Sets the value of the equityPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityPremium }
     *     
     */
    public void setEquityPremium(EquityPremium value) {
        this.equityPremium = value;
    }

    /**
     * Gets the value of the equityExercise property.
     * 
     * @return
     *     possible object is
     *     {@link EquityExerciseValuationSettlement }
     *     
     */
    public EquityExerciseValuationSettlement getEquityExercise() {
        return equityExercise;
    }

    /**
     * Sets the value of the equityExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityExerciseValuationSettlement }
     *     
     */
    public void setEquityExercise(EquityExerciseValuationSettlement value) {
        this.equityExercise = value;
    }

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

    /**
     * The variance swap details.
     * 
     * @return
     *     possible object is
     *     {@link VarianceSwapTransactionSupplement }
     *     
     */
    public VarianceSwapTransactionSupplement getVarianceSwapTransactionSupplement() {
        return varianceSwapTransactionSupplement;
    }

    /**
     * Sets the value of the varianceSwapTransactionSupplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link VarianceSwapTransactionSupplement }
     *     
     */
    public void setVarianceSwapTransactionSupplement(VarianceSwapTransactionSupplement value) {
        this.varianceSwapTransactionSupplement = value;
    }

}