//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:16 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type to describe a notional schedule where each notional that applies to a calculation period is calculated with reference to a notional amount or notional amount schedule in a different currency by means of a spot currency exchange rate which is normally observed at the beginning of each period.
 * 
 * <p>Java class for FxLinkedNotionalSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxLinkedNotionalSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constantNotionalScheduleReference" type="{http://www.fpml.org/2009/FpML-4-7}NotionalReference"/>
 *         &lt;element name="initialValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="varyingNotionalCurrency" type="{http://www.fpml.org/2009/FpML-4-7}Currency"/>
 *         &lt;element name="varyingNotionalFixingDates" type="{http://www.fpml.org/2009/FpML-4-7}RelativeDateOffset"/>
 *         &lt;element name="fxSpotRateSource" type="{http://www.fpml.org/2009/FpML-4-7}FxSpotRateSource"/>
 *         &lt;element name="varyingNotionalInterimExchangePaymentDates" type="{http://www.fpml.org/2009/FpML-4-7}RelativeDateOffset"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxLinkedNotionalSchedule", propOrder = {
    "constantNotionalScheduleReference",
    "initialValue",
    "varyingNotionalCurrency",
    "varyingNotionalFixingDates",
    "fxSpotRateSource",
    "varyingNotionalInterimExchangePaymentDates"
})
public class FxLinkedNotionalSchedule {

    @XmlElement(required = true)
    protected NotionalReference constantNotionalScheduleReference;
    protected BigDecimal initialValue;
    @XmlElement(required = true)
    protected Currency varyingNotionalCurrency;
    @XmlElement(required = true)
    protected RelativeDateOffset varyingNotionalFixingDates;
    @XmlElement(required = true)
    protected FxSpotRateSource fxSpotRateSource;
    @XmlElement(required = true)
    protected RelativeDateOffset varyingNotionalInterimExchangePaymentDates;

    /**
     * Gets the value of the constantNotionalScheduleReference property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalReference }
     *     
     */
    public NotionalReference getConstantNotionalScheduleReference() {
        return constantNotionalScheduleReference;
    }

    /**
     * Sets the value of the constantNotionalScheduleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalReference }
     *     
     */
    public void setConstantNotionalScheduleReference(NotionalReference value) {
        this.constantNotionalScheduleReference = value;
    }

    /**
     * Gets the value of the initialValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialValue() {
        return initialValue;
    }

    /**
     * Sets the value of the initialValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialValue(BigDecimal value) {
        this.initialValue = value;
    }

    /**
     * Gets the value of the varyingNotionalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getVaryingNotionalCurrency() {
        return varyingNotionalCurrency;
    }

    /**
     * Sets the value of the varyingNotionalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setVaryingNotionalCurrency(Currency value) {
        this.varyingNotionalCurrency = value;
    }

    /**
     * Gets the value of the varyingNotionalFixingDates property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDateOffset }
     *     
     */
    public RelativeDateOffset getVaryingNotionalFixingDates() {
        return varyingNotionalFixingDates;
    }

    /**
     * Sets the value of the varyingNotionalFixingDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDateOffset }
     *     
     */
    public void setVaryingNotionalFixingDates(RelativeDateOffset value) {
        this.varyingNotionalFixingDates = value;
    }

    /**
     * Gets the value of the fxSpotRateSource property.
     * 
     * @return
     *     possible object is
     *     {@link FxSpotRateSource }
     *     
     */
    public FxSpotRateSource getFxSpotRateSource() {
        return fxSpotRateSource;
    }

    /**
     * Sets the value of the fxSpotRateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxSpotRateSource }
     *     
     */
    public void setFxSpotRateSource(FxSpotRateSource value) {
        this.fxSpotRateSource = value;
    }

    /**
     * Gets the value of the varyingNotionalInterimExchangePaymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDateOffset }
     *     
     */
    public RelativeDateOffset getVaryingNotionalInterimExchangePaymentDates() {
        return varyingNotionalInterimExchangePaymentDates;
    }

    /**
     * Sets the value of the varyingNotionalInterimExchangePaymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDateOffset }
     *     
     */
    public void setVaryingNotionalInterimExchangePaymentDates(RelativeDateOffset value) {
        this.varyingNotionalInterimExchangePaymentDates = value;
    }

}
