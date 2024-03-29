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
 * A type describing the variance amount of a variance swap.
 * 
 * <p>Java class for Variance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Variance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}CalculationFromObservation">
 *       &lt;sequence>
 *         &lt;element name="varianceAmount" type="{http://www.fpml.org/2009/FpML-4-7}Money"/>
 *         &lt;choice>
 *           &lt;element name="volatilityStrikePrice" type="{http://www.fpml.org/2009/FpML-4-7}NonNegativeDecimal"/>
 *           &lt;element name="varianceStrikePrice" type="{http://www.fpml.org/2009/FpML-4-7}NonNegativeDecimal"/>
 *         &lt;/choice>
 *         &lt;element name="varianceCap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="unadjustedVarianceCap" type="{http://www.fpml.org/2009/FpML-4-7}PositiveDecimal" minOccurs="0"/>
 *         &lt;element name="boundedVariance" type="{http://www.fpml.org/2009/FpML-4-7}BoundedVariance" minOccurs="0"/>
 *         &lt;element name="exchangeTradedContractNearest" type="{http://www.fpml.org/2009/FpML-4-7}ExchangeTradedContract" minOccurs="0"/>
 *         &lt;element name="vegaNotionalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Variance", propOrder = {
    "varianceAmount",
    "volatilityStrikePrice",
    "varianceStrikePrice",
    "varianceCap",
    "unadjustedVarianceCap",
    "boundedVariance",
    "exchangeTradedContractNearest",
    "vegaNotionalAmount"
})
public class Variance
    extends CalculationFromObservation
{

    @XmlElement(required = true)
    protected Money varianceAmount;
    protected BigDecimal volatilityStrikePrice;
    protected BigDecimal varianceStrikePrice;
    protected Boolean varianceCap;
    protected BigDecimal unadjustedVarianceCap;
    protected BoundedVariance boundedVariance;
    protected ExchangeTradedContract exchangeTradedContractNearest;
    protected BigDecimal vegaNotionalAmount;

    /**
     * Gets the value of the varianceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getVarianceAmount() {
        return varianceAmount;
    }

    /**
     * Sets the value of the varianceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setVarianceAmount(Money value) {
        this.varianceAmount = value;
    }

    /**
     * Gets the value of the volatilityStrikePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolatilityStrikePrice() {
        return volatilityStrikePrice;
    }

    /**
     * Sets the value of the volatilityStrikePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolatilityStrikePrice(BigDecimal value) {
        this.volatilityStrikePrice = value;
    }

    /**
     * Gets the value of the varianceStrikePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVarianceStrikePrice() {
        return varianceStrikePrice;
    }

    /**
     * Sets the value of the varianceStrikePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVarianceStrikePrice(BigDecimal value) {
        this.varianceStrikePrice = value;
    }

    /**
     * Gets the value of the varianceCap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVarianceCap() {
        return varianceCap;
    }

    /**
     * Sets the value of the varianceCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVarianceCap(Boolean value) {
        this.varianceCap = value;
    }

    /**
     * Gets the value of the unadjustedVarianceCap property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnadjustedVarianceCap() {
        return unadjustedVarianceCap;
    }

    /**
     * Sets the value of the unadjustedVarianceCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnadjustedVarianceCap(BigDecimal value) {
        this.unadjustedVarianceCap = value;
    }

    /**
     * Gets the value of the boundedVariance property.
     * 
     * @return
     *     possible object is
     *     {@link BoundedVariance }
     *     
     */
    public BoundedVariance getBoundedVariance() {
        return boundedVariance;
    }

    /**
     * Sets the value of the boundedVariance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundedVariance }
     *     
     */
    public void setBoundedVariance(BoundedVariance value) {
        this.boundedVariance = value;
    }

    /**
     * Gets the value of the exchangeTradedContractNearest property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeTradedContract }
     *     
     */
    public ExchangeTradedContract getExchangeTradedContractNearest() {
        return exchangeTradedContractNearest;
    }

    /**
     * Sets the value of the exchangeTradedContractNearest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeTradedContract }
     *     
     */
    public void setExchangeTradedContractNearest(ExchangeTradedContract value) {
        this.exchangeTradedContractNearest = value;
    }

    /**
     * Gets the value of the vegaNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVegaNotionalAmount() {
        return vegaNotionalAmount;
    }

    /**
     * Sets the value of the vegaNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVegaNotionalAmount(BigDecimal value) {
        this.vegaNotionalAmount = value;
    }

}
