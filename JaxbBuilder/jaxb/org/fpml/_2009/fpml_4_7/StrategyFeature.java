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
 * A type for definining equity option simple strike or calendar spread strategy features.
 * 
 * <p>Java class for StrategyFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategyFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="strikeSpread" type="{http://www.fpml.org/2009/FpML-4-7}StrikeSpread"/>
 *         &lt;element name="calendarSpread" type="{http://www.fpml.org/2009/FpML-4-7}CalendarSpread"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategyFeature", propOrder = {
    "strikeSpread",
    "calendarSpread"
})
public class StrategyFeature {

    protected StrikeSpread strikeSpread;
    protected CalendarSpread calendarSpread;

    /**
     * Gets the value of the strikeSpread property.
     * 
     * @return
     *     possible object is
     *     {@link StrikeSpread }
     *     
     */
    public StrikeSpread getStrikeSpread() {
        return strikeSpread;
    }

    /**
     * Sets the value of the strikeSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrikeSpread }
     *     
     */
    public void setStrikeSpread(StrikeSpread value) {
        this.strikeSpread = value;
    }

    /**
     * Gets the value of the calendarSpread property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarSpread }
     *     
     */
    public CalendarSpread getCalendarSpread() {
        return calendarSpread;
    }

    /**
     * Sets the value of the calendarSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarSpread }
     *     
     */
    public void setCalendarSpread(CalendarSpread value) {
        this.calendarSpread = value;
    }

}
