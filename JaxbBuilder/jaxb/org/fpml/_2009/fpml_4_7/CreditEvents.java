//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:11 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CreditEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankruptcy" type="{http://www.fpml.org/2009/FpML-4-7}Empty" minOccurs="0"/>
 *         &lt;element name="failureToPay" type="{http://www.fpml.org/2009/FpML-4-7}FailureToPay" minOccurs="0"/>
 *         &lt;element name="failureToPayPrincipal" type="{http://www.fpml.org/2009/FpML-4-7}Empty" minOccurs="0"/>
 *         &lt;element name="failureToPayInterest" type="{http://www.fpml.org/2009/FpML-4-7}Empty" minOccurs="0"/>
 *         &lt;element name="obligationDefault" type="{http://www.fpml.org/2009/FpML-4-7}Empty" minOccurs="0"/>
 *         &lt;element name="obligationAcceleration" type="{http://www.fpml.org/2009/FpML-4-7}Empty" minOccurs="0"/>
 *         &lt;element name="repudiationMoratorium" type="{http://www.fpml.org/2009/FpML-4-7}Empty" minOccurs="0"/>
 *         &lt;element name="restructuring" type="{http://www.fpml.org/2009/FpML-4-7}Restructuring" minOccurs="0"/>
 *         &lt;element name="distressedRatingsDowngrade" type="{http://www.fpml.org/2009/FpML-4-7}Empty" minOccurs="0"/>
 *         &lt;element name="maturityExtension" type="{http://www.fpml.org/2009/FpML-4-7}Empty" minOccurs="0"/>
 *         &lt;element name="writedown" type="{http://www.fpml.org/2009/FpML-4-7}Empty" minOccurs="0"/>
 *         &lt;element name="impliedWritedown" type="{http://www.fpml.org/2009/FpML-4-7}Empty" minOccurs="0"/>
 *         &lt;element name="defaultRequirement" type="{http://www.fpml.org/2009/FpML-4-7}Money" minOccurs="0"/>
 *         &lt;element name="creditEventNotice" type="{http://www.fpml.org/2009/FpML-4-7}CreditEventNotice" minOccurs="0"/>
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
@XmlType(name = "CreditEvents", propOrder = {
    "bankruptcy",
    "failureToPay",
    "failureToPayPrincipal",
    "failureToPayInterest",
    "obligationDefault",
    "obligationAcceleration",
    "repudiationMoratorium",
    "restructuring",
    "distressedRatingsDowngrade",
    "maturityExtension",
    "writedown",
    "impliedWritedown",
    "defaultRequirement",
    "creditEventNotice"
})
public class CreditEvents {

    protected Empty bankruptcy;
    protected FailureToPay failureToPay;
    protected Empty failureToPayPrincipal;
    protected Empty failureToPayInterest;
    protected Empty obligationDefault;
    protected Empty obligationAcceleration;
    protected Empty repudiationMoratorium;
    protected Restructuring restructuring;
    protected Empty distressedRatingsDowngrade;
    protected Empty maturityExtension;
    protected Empty writedown;
    protected Empty impliedWritedown;
    protected Money defaultRequirement;
    protected CreditEventNotice creditEventNotice;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the bankruptcy property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getBankruptcy() {
        return bankruptcy;
    }

    /**
     * Sets the value of the bankruptcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setBankruptcy(Empty value) {
        this.bankruptcy = value;
    }

    /**
     * Gets the value of the failureToPay property.
     * 
     * @return
     *     possible object is
     *     {@link FailureToPay }
     *     
     */
    public FailureToPay getFailureToPay() {
        return failureToPay;
    }

    /**
     * Sets the value of the failureToPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureToPay }
     *     
     */
    public void setFailureToPay(FailureToPay value) {
        this.failureToPay = value;
    }

    /**
     * Gets the value of the failureToPayPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getFailureToPayPrincipal() {
        return failureToPayPrincipal;
    }

    /**
     * Sets the value of the failureToPayPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setFailureToPayPrincipal(Empty value) {
        this.failureToPayPrincipal = value;
    }

    /**
     * Gets the value of the failureToPayInterest property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getFailureToPayInterest() {
        return failureToPayInterest;
    }

    /**
     * Sets the value of the failureToPayInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setFailureToPayInterest(Empty value) {
        this.failureToPayInterest = value;
    }

    /**
     * Gets the value of the obligationDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getObligationDefault() {
        return obligationDefault;
    }

    /**
     * Sets the value of the obligationDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setObligationDefault(Empty value) {
        this.obligationDefault = value;
    }

    /**
     * Gets the value of the obligationAcceleration property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getObligationAcceleration() {
        return obligationAcceleration;
    }

    /**
     * Sets the value of the obligationAcceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setObligationAcceleration(Empty value) {
        this.obligationAcceleration = value;
    }

    /**
     * Gets the value of the repudiationMoratorium property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getRepudiationMoratorium() {
        return repudiationMoratorium;
    }

    /**
     * Sets the value of the repudiationMoratorium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setRepudiationMoratorium(Empty value) {
        this.repudiationMoratorium = value;
    }

    /**
     * Gets the value of the restructuring property.
     * 
     * @return
     *     possible object is
     *     {@link Restructuring }
     *     
     */
    public Restructuring getRestructuring() {
        return restructuring;
    }

    /**
     * Sets the value of the restructuring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restructuring }
     *     
     */
    public void setRestructuring(Restructuring value) {
        this.restructuring = value;
    }

    /**
     * Gets the value of the distressedRatingsDowngrade property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getDistressedRatingsDowngrade() {
        return distressedRatingsDowngrade;
    }

    /**
     * Sets the value of the distressedRatingsDowngrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setDistressedRatingsDowngrade(Empty value) {
        this.distressedRatingsDowngrade = value;
    }

    /**
     * Gets the value of the maturityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getMaturityExtension() {
        return maturityExtension;
    }

    /**
     * Sets the value of the maturityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setMaturityExtension(Empty value) {
        this.maturityExtension = value;
    }

    /**
     * Gets the value of the writedown property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getWritedown() {
        return writedown;
    }

    /**
     * Sets the value of the writedown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setWritedown(Empty value) {
        this.writedown = value;
    }

    /**
     * Gets the value of the impliedWritedown property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getImpliedWritedown() {
        return impliedWritedown;
    }

    /**
     * Sets the value of the impliedWritedown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setImpliedWritedown(Empty value) {
        this.impliedWritedown = value;
    }

    /**
     * Gets the value of the defaultRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getDefaultRequirement() {
        return defaultRequirement;
    }

    /**
     * Sets the value of the defaultRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setDefaultRequirement(Money value) {
        this.defaultRequirement = value;
    }

    /**
     * Gets the value of the creditEventNotice property.
     * 
     * @return
     *     possible object is
     *     {@link CreditEventNotice }
     *     
     */
    public CreditEventNotice getCreditEventNotice() {
        return creditEventNotice;
    }

    /**
     * Sets the value of the creditEventNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditEventNotice }
     *     
     */
    public void setCreditEventNotice(CreditEventNotice value) {
        this.creditEventNotice = value;
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
