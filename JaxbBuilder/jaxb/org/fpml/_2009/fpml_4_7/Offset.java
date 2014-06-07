//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining an offset used in calculating a new date relative to a reference date. Currently, the only offsets defined are expected to be expressed as either calendar or business day offsets.
 * 
 * <p>Java class for Offset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Offset">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}Period">
 *       &lt;sequence>
 *         &lt;element name="dayType" type="{http://www.fpml.org/2009/FpML-4-7}DayTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Offset", propOrder = {
    "dayType"
})
@XmlSeeAlso({
    DateOffset.class,
    RelativeDateOffset.class
})
public class Offset
    extends Period
{

    protected DayTypeEnum dayType;

    /**
     * Gets the value of the dayType property.
     * 
     * @return
     *     possible object is
     *     {@link DayTypeEnum }
     *     
     */
    public DayTypeEnum getDayType() {
        return dayType;
    }

    /**
     * Sets the value of the dayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTypeEnum }
     *     
     */
    public void setDayType(DayTypeEnum value) {
        this.dayType = value;
    }

}