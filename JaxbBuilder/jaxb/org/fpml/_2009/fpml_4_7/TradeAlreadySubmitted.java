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
 * A type defining the content model for a message sent by a confirmation provider when it believes that one party has repeated a request to confirm a trade.
 * 
 * <p>Java class for TradeAlreadySubmitted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeAlreadySubmitted">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}ResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="tradeIdentifier" type="{http://www.fpml.org/2009/FpML-4-7}TradeIdentifier"/>
 *         &lt;element name="party" type="{http://www.fpml.org/2009/FpML-4-7}Party"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeAlreadySubmitted", propOrder = {
    "tradeIdentifier",
    "party"
})
public class TradeAlreadySubmitted
    extends ResponseMessage
{

    @XmlElement(required = true)
    protected TradeIdentifier tradeIdentifier;
    @XmlElement(required = true)
    protected Party party;

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
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setParty(Party value) {
        this.party = value;
    }

}
