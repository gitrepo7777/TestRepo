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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type representing an arbitary grouping of trade references.
 * 
 * <p>Java class for Portfolio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Portfolio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyPortfolioName" type="{http://www.fpml.org/2009/FpML-4-7}PartyPortfolioName" minOccurs="0"/>
 *         &lt;element name="tradeId" type="{http://www.fpml.org/2009/FpML-4-7}TradeId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="portfolio" type="{http://www.fpml.org/2009/FpML-4-7}Portfolio" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Portfolio", propOrder = {
    "partyPortfolioName",
    "tradeId",
    "portfolio"
})
@XmlSeeAlso({
    QueryPortfolio.class
})
public class Portfolio {

    protected PartyPortfolioName partyPortfolioName;
    protected List<TradeId> tradeId;
    protected List<Portfolio> portfolio;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the partyPortfolioName property.
     * 
     * @return
     *     possible object is
     *     {@link PartyPortfolioName }
     *     
     */
    public PartyPortfolioName getPartyPortfolioName() {
        return partyPortfolioName;
    }

    /**
     * Sets the value of the partyPortfolioName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyPortfolioName }
     *     
     */
    public void setPartyPortfolioName(PartyPortfolioName value) {
        this.partyPortfolioName = value;
    }

    /**
     * Gets the value of the tradeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeId }
     * 
     * 
     */
    public List<TradeId> getTradeId() {
        if (tradeId == null) {
            tradeId = new ArrayList<TradeId>();
        }
        return this.tradeId;
    }

    /**
     * Gets the value of the portfolio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portfolio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortfolio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Portfolio }
     * 
     * 
     */
    public List<Portfolio> getPortfolio() {
        if (portfolio == null) {
            portfolio = new ArrayList<Portfolio>();
        }
        return this.portfolio;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
