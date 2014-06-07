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
 * <p>Java class for ReferencePair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencePair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceEntity" type="{http://www.fpml.org/2009/FpML-4-7}LegalEntity"/>
 *         &lt;choice>
 *           &lt;element name="referenceObligation" type="{http://www.fpml.org/2009/FpML-4-7}ReferenceObligation"/>
 *           &lt;element name="noReferenceObligation" type="{http://www.fpml.org/2009/FpML-4-7}Empty"/>
 *         &lt;/choice>
 *         &lt;element name="entityType" type="{http://www.fpml.org/2009/FpML-4-7}EntityType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencePair", propOrder = {
    "referenceEntity",
    "referenceObligation",
    "noReferenceObligation",
    "entityType"
})
public class ReferencePair {

    @XmlElement(required = true)
    protected LegalEntity referenceEntity;
    protected ReferenceObligation referenceObligation;
    protected Empty noReferenceObligation;
    @XmlElement(required = true)
    protected EntityType entityType;

    /**
     * Gets the value of the referenceEntity property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntity }
     *     
     */
    public LegalEntity getReferenceEntity() {
        return referenceEntity;
    }

    /**
     * Sets the value of the referenceEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntity }
     *     
     */
    public void setReferenceEntity(LegalEntity value) {
        this.referenceEntity = value;
    }

    /**
     * Gets the value of the referenceObligation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceObligation }
     *     
     */
    public ReferenceObligation getReferenceObligation() {
        return referenceObligation;
    }

    /**
     * Sets the value of the referenceObligation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceObligation }
     *     
     */
    public void setReferenceObligation(ReferenceObligation value) {
        this.referenceObligation = value;
    }

    /**
     * Gets the value of the noReferenceObligation property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getNoReferenceObligation() {
        return noReferenceObligation;
    }

    /**
     * Sets the value of the noReferenceObligation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setNoReferenceObligation(Empty value) {
        this.noReferenceObligation = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setEntityType(EntityType value) {
        this.entityType = value;
    }

}