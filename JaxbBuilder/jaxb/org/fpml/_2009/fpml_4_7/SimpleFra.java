//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:15 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleFra complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleFra">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}UnderlyingAsset">
 *       &lt;sequence>
 *         &lt;element name="startTerm" type="{http://www.fpml.org/2009/FpML-4-7}Period"/>
 *         &lt;element name="endTerm" type="{http://www.fpml.org/2009/FpML-4-7}Period"/>
 *         &lt;element name="dayCountFraction" type="{http://www.fpml.org/2009/FpML-4-7}DayCountFraction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleFra", propOrder = {
    "startTerm",
    "endTerm",
    "dayCountFraction"
})
public class SimpleFra
    extends UnderlyingAsset
{

    @XmlElement(required = true)
    protected Period startTerm;
    @XmlElement(required = true)
    protected Period endTerm;
    protected DayCountFraction dayCountFraction;

    /**
     * Gets the value of the startTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getStartTerm() {
        return startTerm;
    }

    /**
     * Sets the value of the startTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setStartTerm(Period value) {
        this.startTerm = value;
    }

    /**
     * Gets the value of the endTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getEndTerm() {
        return endTerm;
    }

    /**
     * Sets the value of the endTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setEndTerm(Period value) {
        this.endTerm = value;
    }

    /**
     * Gets the value of the dayCountFraction property.
     * 
     * @return
     *     possible object is
     *     {@link DayCountFraction }
     *     
     */
    public DayCountFraction getDayCountFraction() {
        return dayCountFraction;
    }

    /**
     * Sets the value of the dayCountFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayCountFraction }
     *     
     */
    public void setDayCountFraction(DayCountFraction value) {
        this.dayCountFraction = value;
    }

}
