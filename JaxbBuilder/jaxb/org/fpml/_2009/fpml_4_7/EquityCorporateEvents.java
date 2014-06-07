//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:46 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining the merger events and their treatment.
 * 
 * <p>Java class for EquityCorporateEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityCorporateEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shareForShare" type="{http://www.fpml.org/2009/FpML-4-7}ShareExtraordinaryEventEnum"/>
 *         &lt;element name="shareForOther" type="{http://www.fpml.org/2009/FpML-4-7}ShareExtraordinaryEventEnum"/>
 *         &lt;element name="shareForCombined" type="{http://www.fpml.org/2009/FpML-4-7}ShareExtraordinaryEventEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityCorporateEvents", propOrder = {
    "shareForShare",
    "shareForOther",
    "shareForCombined"
})
public class EquityCorporateEvents {

    @XmlElement(required = true)
    protected ShareExtraordinaryEventEnum shareForShare;
    @XmlElement(required = true)
    protected ShareExtraordinaryEventEnum shareForOther;
    @XmlElement(required = true)
    protected ShareExtraordinaryEventEnum shareForCombined;

    /**
     * Gets the value of the shareForShare property.
     * 
     * @return
     *     possible object is
     *     {@link ShareExtraordinaryEventEnum }
     *     
     */
    public ShareExtraordinaryEventEnum getShareForShare() {
        return shareForShare;
    }

    /**
     * Sets the value of the shareForShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareExtraordinaryEventEnum }
     *     
     */
    public void setShareForShare(ShareExtraordinaryEventEnum value) {
        this.shareForShare = value;
    }

    /**
     * Gets the value of the shareForOther property.
     * 
     * @return
     *     possible object is
     *     {@link ShareExtraordinaryEventEnum }
     *     
     */
    public ShareExtraordinaryEventEnum getShareForOther() {
        return shareForOther;
    }

    /**
     * Sets the value of the shareForOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareExtraordinaryEventEnum }
     *     
     */
    public void setShareForOther(ShareExtraordinaryEventEnum value) {
        this.shareForOther = value;
    }

    /**
     * Gets the value of the shareForCombined property.
     * 
     * @return
     *     possible object is
     *     {@link ShareExtraordinaryEventEnum }
     *     
     */
    public ShareExtraordinaryEventEnum getShareForCombined() {
        return shareForCombined;
    }

    /**
     * Sets the value of the shareForCombined property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareExtraordinaryEventEnum }
     *     
     */
    public void setShareForCombined(ShareExtraordinaryEventEnum value) {
        this.shareForCombined = value;
    }

}