//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:11 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestShortFall complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestShortFall">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interestShortfallCap" type="{http://www.fpml.org/2009/FpML-4-7}InterestShortfallCapEnum"/>
 *         &lt;element name="compounding" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rateSource" type="{http://www.fpml.org/2009/FpML-4-7}FloatingRateIndex" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestShortFall", propOrder = {
    "interestShortfallCap",
    "compounding",
    "rateSource"
})
public class InterestShortFall {

    @XmlElement(required = true)
    protected InterestShortfallCapEnum interestShortfallCap;
    protected boolean compounding;
    protected FloatingRateIndex rateSource;

    /**
     * Gets the value of the interestShortfallCap property.
     * 
     * @return
     *     possible object is
     *     {@link InterestShortfallCapEnum }
     *     
     */
    public InterestShortfallCapEnum getInterestShortfallCap() {
        return interestShortfallCap;
    }

    /**
     * Sets the value of the interestShortfallCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestShortfallCapEnum }
     *     
     */
    public void setInterestShortfallCap(InterestShortfallCapEnum value) {
        this.interestShortfallCap = value;
    }

    /**
     * Gets the value of the compounding property.
     * 
     */
    public boolean isCompounding() {
        return compounding;
    }

    /**
     * Sets the value of the compounding property.
     * 
     */
    public void setCompounding(boolean value) {
        this.compounding = value;
    }

    /**
     * Gets the value of the rateSource property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateIndex }
     *     
     */
    public FloatingRateIndex getRateSource() {
        return rateSource;
    }

    /**
     * Sets the value of the rateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateIndex }
     *     
     */
    public void setRateSource(FloatingRateIndex value) {
        this.rateSource = value;
    }

}
