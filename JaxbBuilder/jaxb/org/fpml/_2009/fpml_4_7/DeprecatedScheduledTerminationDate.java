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
 * DEPRECATED
 * 
 * <p>Java class for DeprecatedScheduledTerminationDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeprecatedScheduledTerminationDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adjustableDate" type="{http://www.fpml.org/2009/FpML-4-7}AdjustableDate2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeprecatedScheduledTerminationDate", propOrder = {
    "adjustableDate"
})
public class DeprecatedScheduledTerminationDate {

    @XmlElement(required = true)
    protected AdjustableDate2 adjustableDate;

    /**
     * Gets the value of the adjustableDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate2 }
     *     
     */
    public AdjustableDate2 getAdjustableDate() {
        return adjustableDate;
    }

    /**
     * Sets the value of the adjustableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate2 }
     *     
     */
    public void setAdjustableDate(AdjustableDate2 value) {
        this.adjustableDate = value;
    }

}