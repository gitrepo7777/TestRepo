//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:46 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Abstract base class of all time bounded dividend period types.
 * 
 * <p>Java class for DividendPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DividendPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unadjustedStartDate" type="{http://www.fpml.org/2009/FpML-4-7}IdentifiedDate"/>
 *         &lt;element name="unadjustedEndDate" type="{http://www.fpml.org/2009/FpML-4-7}IdentifiedDate"/>
 *         &lt;element name="dateAdjustments" type="{http://www.fpml.org/2009/FpML-4-7}BusinessDayAdjustments"/>
 *         &lt;element name="underlyerReference" type="{http://www.fpml.org/2009/FpML-4-7}AssetReference" minOccurs="0"/>
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
@XmlType(name = "DividendPeriod", propOrder = {
    "unadjustedStartDate",
    "unadjustedEndDate",
    "dateAdjustments",
    "underlyerReference"
})
@XmlSeeAlso({
    DividendPeriodDividend.class
})
public abstract class DividendPeriod {

    @XmlElement(required = true)
    protected IdentifiedDate unadjustedStartDate;
    @XmlElement(required = true)
    protected IdentifiedDate unadjustedEndDate;
    @XmlElement(required = true)
    protected BusinessDayAdjustments dateAdjustments;
    protected AssetReference underlyerReference;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the unadjustedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getUnadjustedStartDate() {
        return unadjustedStartDate;
    }

    /**
     * Sets the value of the unadjustedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setUnadjustedStartDate(IdentifiedDate value) {
        this.unadjustedStartDate = value;
    }

    /**
     * Gets the value of the unadjustedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getUnadjustedEndDate() {
        return unadjustedEndDate;
    }

    /**
     * Sets the value of the unadjustedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setUnadjustedEndDate(IdentifiedDate value) {
        this.unadjustedEndDate = value;
    }

    /**
     * Gets the value of the dateAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayAdjustments }
     *     
     */
    public BusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    /**
     * Sets the value of the dateAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayAdjustments }
     *     
     */
    public void setDateAdjustments(BusinessDayAdjustments value) {
        this.dateAdjustments = value;
    }

    /**
     * Gets the value of the underlyerReference property.
     * 
     * @return
     *     possible object is
     *     {@link AssetReference }
     *     
     */
    public AssetReference getUnderlyerReference() {
        return underlyerReference;
    }

    /**
     * Sets the value of the underlyerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetReference }
     *     
     */
    public void setUnderlyerReference(AssetReference value) {
        this.underlyerReference = value;
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
