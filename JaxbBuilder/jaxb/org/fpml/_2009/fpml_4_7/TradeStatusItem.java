//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type used in trade status enquiry messages which relates a trade identifier to its current status value.
 * 
 * <p>Java class for TradeStatusItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeStatusItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tradeIdentifier" type="{http://www.fpml.org/2009/FpML-4-7}TradeIdentifier"/>
 *         &lt;element name="tradeStatusValue" type="{http://www.fpml.org/2009/FpML-4-7}TradeStatusValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeStatusItem", propOrder = {
    "tradeIdentifier",
    "tradeStatusValue"
})
public class TradeStatusItem {

    @XmlElement(required = true)
    protected TradeIdentifier tradeIdentifier;
    @XmlElement(required = true)
    protected TradeStatusValue tradeStatusValue;

    /**
     * Gets the value of the tradeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TradeIdentifier }
     *     
     */
    public TradeIdentifier getTradeIdentifier() {
        return tradeIdentifier;
    }

    /**
     * Sets the value of the tradeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeIdentifier }
     *     
     */
    public void setTradeIdentifier(TradeIdentifier value) {
        this.tradeIdentifier = value;
    }

    /**
     * Gets the value of the tradeStatusValue property.
     * 
     * @return
     *     possible object is
     *     {@link TradeStatusValue }
     *     
     */
    public TradeStatusValue getTradeStatusValue() {
        return tradeStatusValue;
    }

    /**
     * Sets the value of the tradeStatusValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeStatusValue }
     *     
     */
    public void setTradeStatusValue(TradeStatusValue value) {
        this.tradeStatusValue = value;
    }

}
