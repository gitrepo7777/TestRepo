//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:11 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Restructuring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Restructuring">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="restructuringType" type="{http://www.fpml.org/2009/FpML-4-7}RestructuringType" minOccurs="0"/>
 *         &lt;element name="multipleHolderObligation" type="{http://www.fpml.org/2009/FpML-4-7}Empty" minOccurs="0"/>
 *         &lt;element name="multipleCreditEventNotices" type="{http://www.fpml.org/2009/FpML-4-7}Empty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Restructuring", propOrder = {
    "restructuringType",
    "multipleHolderObligation",
    "multipleCreditEventNotices"
})
public class Restructuring {

    protected RestructuringType restructuringType;
    protected Empty multipleHolderObligation;
    protected Empty multipleCreditEventNotices;

    /**
     * Gets the value of the restructuringType property.
     * 
     * @return
     *     possible object is
     *     {@link RestructuringType }
     *     
     */
    public RestructuringType getRestructuringType() {
        return restructuringType;
    }

    /**
     * Sets the value of the restructuringType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestructuringType }
     *     
     */
    public void setRestructuringType(RestructuringType value) {
        this.restructuringType = value;
    }

    /**
     * Gets the value of the multipleHolderObligation property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getMultipleHolderObligation() {
        return multipleHolderObligation;
    }

    /**
     * Sets the value of the multipleHolderObligation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setMultipleHolderObligation(Empty value) {
        this.multipleHolderObligation = value;
    }

    /**
     * Gets the value of the multipleCreditEventNotices property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getMultipleCreditEventNotices() {
        return multipleCreditEventNotices;
    }

    /**
     * Sets the value of the multipleCreditEventNotices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setMultipleCreditEventNotices(Empty value) {
        this.multipleCreditEventNotices = value;
    }

}