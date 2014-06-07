//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:11 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalSettlementPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalSettlementPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="businessDaysNotSpecified" type="{http://www.fpml.org/2009/FpML-4-7}Empty"/>
 *         &lt;element name="businessDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="maximumBusinessDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalSettlementPeriod", propOrder = {
    "businessDaysNotSpecified",
    "businessDays",
    "maximumBusinessDays"
})
public class PhysicalSettlementPeriod {

    protected Empty businessDaysNotSpecified;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger businessDays;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumBusinessDays;

    /**
     * Gets the value of the businessDaysNotSpecified property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getBusinessDaysNotSpecified() {
        return businessDaysNotSpecified;
    }

    /**
     * Sets the value of the businessDaysNotSpecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setBusinessDaysNotSpecified(Empty value) {
        this.businessDaysNotSpecified = value;
    }

    /**
     * Gets the value of the businessDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusinessDays() {
        return businessDays;
    }

    /**
     * Sets the value of the businessDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusinessDays(BigInteger value) {
        this.businessDays = value;
    }

    /**
     * Gets the value of the maximumBusinessDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumBusinessDays() {
        return maximumBusinessDays;
    }

    /**
     * Sets the value of the maximumBusinessDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumBusinessDays(BigInteger value) {
        this.maximumBusinessDays = value;
    }

}
