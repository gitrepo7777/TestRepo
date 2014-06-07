//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:11 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * As per ISDA 2002 Definitions.
 * 
 * <p>Java class for Asian complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asian">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="averagingInOut" type="{http://www.fpml.org/2009/FpML-4-7}AveragingInOutEnum"/>
 *         &lt;element name="strikeFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="averagingPeriodIn" type="{http://www.fpml.org/2009/FpML-4-7}AveragingPeriod" minOccurs="0"/>
 *         &lt;element name="averagingPeriodOut" type="{http://www.fpml.org/2009/FpML-4-7}AveragingPeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asian", propOrder = {
    "averagingInOut",
    "strikeFactor",
    "averagingPeriodIn",
    "averagingPeriodOut"
})
public class Asian {

    @XmlElement(required = true)
    protected AveragingInOutEnum averagingInOut;
    protected BigDecimal strikeFactor;
    protected AveragingPeriod averagingPeriodIn;
    protected AveragingPeriod averagingPeriodOut;

    /**
     * Gets the value of the averagingInOut property.
     * 
     * @return
     *     possible object is
     *     {@link AveragingInOutEnum }
     *     
     */
    public AveragingInOutEnum getAveragingInOut() {
        return averagingInOut;
    }

    /**
     * Sets the value of the averagingInOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link AveragingInOutEnum }
     *     
     */
    public void setAveragingInOut(AveragingInOutEnum value) {
        this.averagingInOut = value;
    }

    /**
     * Gets the value of the strikeFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrikeFactor() {
        return strikeFactor;
    }

    /**
     * Sets the value of the strikeFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrikeFactor(BigDecimal value) {
        this.strikeFactor = value;
    }

    /**
     * Gets the value of the averagingPeriodIn property.
     * 
     * @return
     *     possible object is
     *     {@link AveragingPeriod }
     *     
     */
    public AveragingPeriod getAveragingPeriodIn() {
        return averagingPeriodIn;
    }

    /**
     * Sets the value of the averagingPeriodIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AveragingPeriod }
     *     
     */
    public void setAveragingPeriodIn(AveragingPeriod value) {
        this.averagingPeriodIn = value;
    }

    /**
     * Gets the value of the averagingPeriodOut property.
     * 
     * @return
     *     possible object is
     *     {@link AveragingPeriod }
     *     
     */
    public AveragingPeriod getAveragingPeriodOut() {
        return averagingPeriodOut;
    }

    /**
     * Sets the value of the averagingPeriodOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link AveragingPeriod }
     *     
     */
    public void setAveragingPeriodOut(AveragingPeriod value) {
        this.averagingPeriodOut = value;
    }

}