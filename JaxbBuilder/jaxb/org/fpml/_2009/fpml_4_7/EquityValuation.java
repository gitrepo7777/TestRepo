//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:46 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type for defining how and when an equity option is to be valued.
 * 
 * <p>Java class for EquityValuation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityValuation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="valuationDate" type="{http://www.fpml.org/2009/FpML-4-7}AdjustableDateOrRelativeDateSequence"/>
 *           &lt;element name="valuationDates" type="{http://www.fpml.org/2009/FpML-4-7}AdjustableRelativeOrPeriodicDates"/>
 *         &lt;/choice>
 *         &lt;element name="valuationTimeType" type="{http://www.fpml.org/2009/FpML-4-7}TimeTypeEnum" minOccurs="0"/>
 *         &lt;element name="valuationTime" type="{http://www.fpml.org/2009/FpML-4-7}BusinessCenterTime" minOccurs="0"/>
 *         &lt;element name="futuresPriceValuation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="optionsPriceValuation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="numberOfValuationDates" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityValuation", propOrder = {
    "valuationDate",
    "valuationDates",
    "valuationTimeType",
    "valuationTime",
    "futuresPriceValuation",
    "optionsPriceValuation",
    "numberOfValuationDates"
})
public class EquityValuation {

    protected AdjustableDateOrRelativeDateSequence valuationDate;
    protected AdjustableRelativeOrPeriodicDates valuationDates;
    protected TimeTypeEnum valuationTimeType;
    protected BusinessCenterTime valuationTime;
    protected Boolean futuresPriceValuation;
    protected Boolean optionsPriceValuation;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfValuationDates;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the valuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDateOrRelativeDateSequence }
     *     
     */
    public AdjustableDateOrRelativeDateSequence getValuationDate() {
        return valuationDate;
    }

    /**
     * Sets the value of the valuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDateOrRelativeDateSequence }
     *     
     */
    public void setValuationDate(AdjustableDateOrRelativeDateSequence value) {
        this.valuationDate = value;
    }

    /**
     * Gets the value of the valuationDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableRelativeOrPeriodicDates }
     *     
     */
    public AdjustableRelativeOrPeriodicDates getValuationDates() {
        return valuationDates;
    }

    /**
     * Sets the value of the valuationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableRelativeOrPeriodicDates }
     *     
     */
    public void setValuationDates(AdjustableRelativeOrPeriodicDates value) {
        this.valuationDates = value;
    }

    /**
     * Gets the value of the valuationTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link TimeTypeEnum }
     *     
     */
    public TimeTypeEnum getValuationTimeType() {
        return valuationTimeType;
    }

    /**
     * Sets the value of the valuationTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeTypeEnum }
     *     
     */
    public void setValuationTimeType(TimeTypeEnum value) {
        this.valuationTimeType = value;
    }

    /**
     * Gets the value of the valuationTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getValuationTime() {
        return valuationTime;
    }

    /**
     * Sets the value of the valuationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setValuationTime(BusinessCenterTime value) {
        this.valuationTime = value;
    }

    /**
     * Gets the value of the futuresPriceValuation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFuturesPriceValuation() {
        return futuresPriceValuation;
    }

    /**
     * Sets the value of the futuresPriceValuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFuturesPriceValuation(Boolean value) {
        this.futuresPriceValuation = value;
    }

    /**
     * Gets the value of the optionsPriceValuation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionsPriceValuation() {
        return optionsPriceValuation;
    }

    /**
     * Sets the value of the optionsPriceValuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionsPriceValuation(Boolean value) {
        this.optionsPriceValuation = value;
    }

    /**
     * Gets the value of the numberOfValuationDates property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfValuationDates() {
        return numberOfValuationDates;
    }

    /**
     * Sets the value of the numberOfValuationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfValuationDates(BigInteger value) {
        this.numberOfValuationDates = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}