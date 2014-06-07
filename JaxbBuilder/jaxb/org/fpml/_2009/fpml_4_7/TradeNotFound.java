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
 * A type defining the content model of a response message generated when an operation as requested on a trade unknown to the service.
 * 
 * <p>Java class for TradeNotFound complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeNotFound">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}ResponseMessage">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="tradeIdentifier" type="{http://www.fpml.org/2009/FpML-4-7}TradeIdentifier"/>
 *           &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}TradeOrTradeReference.model"/>
 *         &lt;/choice>
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
@XmlType(name = "TradeNotFound", propOrder = {
    "tradeIdentifier",
    "trade",
    "tradeReference",
    "party"
})
public class TradeNotFound
    extends ResponseMessage
{

    protected TradeIdentifier tradeIdentifier;
    protected Trade trade;
    protected PartyTradeIdentifiers tradeReference;
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
     * Gets the value of the trade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getTrade() {
        return trade;
    }

    /**
     * Sets the value of the trade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setTrade(Trade value) {
        this.trade = value;
    }

    /**
     * Gets the value of the tradeReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTradeIdentifiers }
     *     
     */
    public PartyTradeIdentifiers getTradeReference() {
        return tradeReference;
    }

    /**
     * Sets the value of the tradeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTradeIdentifiers }
     *     
     */
    public void setTradeReference(PartyTradeIdentifiers value) {
        this.tradeReference = value;
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
