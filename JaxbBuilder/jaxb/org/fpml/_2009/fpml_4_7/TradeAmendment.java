//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the original trade and the amended trade.
 * 
 * <p>Java class for TradeAmendment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeAmendment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="originalTrade" type="{http://www.fpml.org/2009/FpML-4-7}Trade"/>
 *           &lt;element name="originalTradeIdentifier" type="{http://www.fpml.org/2009/FpML-4-7}PartyTradeIdentifier" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="amendedTrade" type="{http://www.fpml.org/2009/FpML-4-7}Trade"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeAmendment", propOrder = {
    "originalTrade",
    "originalTradeIdentifier",
    "amendedTrade"
})
public class TradeAmendment {

    protected Trade originalTrade;
    protected List<PartyTradeIdentifier> originalTradeIdentifier;
    @XmlElement(required = true)
    protected Trade amendedTrade;

    /**
     * Gets the value of the originalTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getOriginalTrade() {
        return originalTrade;
    }

    /**
     * Sets the value of the originalTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setOriginalTrade(Trade value) {
        this.originalTrade = value;
    }

    /**
     * Gets the value of the originalTradeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originalTradeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginalTradeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTradeIdentifier }
     * 
     * 
     */
    public List<PartyTradeIdentifier> getOriginalTradeIdentifier() {
        if (originalTradeIdentifier == null) {
            originalTradeIdentifier = new ArrayList<PartyTradeIdentifier>();
        }
        return this.originalTradeIdentifier;
    }

    /**
     * Gets the value of the amendedTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getAmendedTrade() {
        return amendedTrade;
    }

    /**
     * Sets the value of the amendedTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setAmendedTrade(Trade value) {
        this.amendedTrade = value;
    }

}
