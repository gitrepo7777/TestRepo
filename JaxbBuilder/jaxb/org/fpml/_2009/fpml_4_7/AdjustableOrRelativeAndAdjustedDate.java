//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An adjustable or relative date with the option to provide the adjusted date.
 * 
 * <p>Java class for AdjustableOrRelativeAndAdjustedDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustableOrRelativeAndAdjustedDate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}AdjustableOrRelativeDate">
 *       &lt;sequence>
 *         &lt;element name="adjustedDate" type="{http://www.fpml.org/2009/FpML-4-7}IdentifiedDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustableOrRelativeAndAdjustedDate", propOrder = {
    "adjustedDate"
})
public class AdjustableOrRelativeAndAdjustedDate
    extends AdjustableOrRelativeDate
{

    protected IdentifiedDate adjustedDate;

    /**
     * Gets the value of the adjustedDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getAdjustedDate() {
        return adjustedDate;
    }

    /**
     * Sets the value of the adjustedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setAdjustedDate(IdentifiedDate value) {
        this.adjustedDate = value;
    }

}