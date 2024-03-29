//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type defining an FpML trade.
 * 
 * <p>Java class for Trade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Trade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tradeHeader" type="{http://www.fpml.org/2009/FpML-4-7}TradeHeader"/>
 *         &lt;element ref="{http://www.fpml.org/2009/FpML-4-7}product"/>
 *         &lt;element name="otherPartyPayment" type="{http://www.fpml.org/2009/FpML-4-7}Payment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="brokerPartyReference" type="{http://www.fpml.org/2009/FpML-4-7}PartyReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}CalculationAgent.model"/>
 *         &lt;element name="determiningParty" type="{http://www.fpml.org/2009/FpML-4-7}PartyReference" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="hedgingParty" type="{http://www.fpml.org/2009/FpML-4-7}PartyReference" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="collateral" type="{http://www.fpml.org/2009/FpML-4-7}Collateral" minOccurs="0"/>
 *         &lt;element name="documentation" type="{http://www.fpml.org/2009/FpML-4-7}Documentation" minOccurs="0"/>
 *         &lt;element name="governingLaw" type="{http://www.fpml.org/2009/FpML-4-7}GoverningLaw" minOccurs="0"/>
 *         &lt;element name="allocations" type="{http://www.fpml.org/2009/FpML-4-7}Allocations" minOccurs="0"/>
 *         &lt;element name="tradeSide" type="{http://www.fpml.org/2009/FpML-4-7}TradeSide" maxOccurs="2" minOccurs="0"/>
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
@XmlType(name = "Trade", propOrder = {
    "tradeHeader",
    "product",
    "otherPartyPayment",
    "brokerPartyReference",
    "calculationAgent",
    "calculationAgentBusinessCenter",
    "determiningParty",
    "hedgingParty",
    "collateral",
    "documentation",
    "governingLaw",
    "allocations",
    "tradeSide"
})
public class Trade {

    @XmlElement(required = true)
    protected TradeHeader tradeHeader;
    @XmlElementRef(name = "product", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class)
    protected JAXBElement<? extends Product> product;
    protected List<Payment> otherPartyPayment;
    protected List<PartyReference> brokerPartyReference;
    protected CalculationAgent calculationAgent;
    protected BusinessCenter calculationAgentBusinessCenter;
    protected List<PartyReference> determiningParty;
    protected List<PartyReference> hedgingParty;
    protected Collateral collateral;
    protected Documentation documentation;
    protected GoverningLaw governingLaw;
    protected Allocations allocations;
    protected List<TradeSide> tradeSide;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the tradeHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TradeHeader }
     *     
     */
    public TradeHeader getTradeHeader() {
        return tradeHeader;
    }

    /**
     * Sets the value of the tradeHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeHeader }
     *     
     */
    public void setTradeHeader(TradeHeader value) {
        this.tradeHeader = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Strategy }{@code >}
     *     {@link JAXBElement }{@code <}{@link Product }{@code >}
     *     
     */
    public JAXBElement<? extends Product> getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Strategy }{@code >}
     *     {@link JAXBElement }{@code <}{@link Product }{@code >}
     *     
     */
    public void setProduct(JAXBElement<? extends Product> value) {
        this.product = ((JAXBElement<? extends Product> ) value);
    }

    /**
     * Gets the value of the otherPartyPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPartyPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPartyPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getOtherPartyPayment() {
        if (otherPartyPayment == null) {
            otherPartyPayment = new ArrayList<Payment>();
        }
        return this.otherPartyPayment;
    }

    /**
     * Gets the value of the brokerPartyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerPartyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerPartyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getBrokerPartyReference() {
        if (brokerPartyReference == null) {
            brokerPartyReference = new ArrayList<PartyReference>();
        }
        return this.brokerPartyReference;
    }

    /**
     * Gets the value of the calculationAgent property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationAgent }
     *     
     */
    public CalculationAgent getCalculationAgent() {
        return calculationAgent;
    }

    /**
     * Sets the value of the calculationAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationAgent }
     *     
     */
    public void setCalculationAgent(CalculationAgent value) {
        this.calculationAgent = value;
    }

    /**
     * Gets the value of the calculationAgentBusinessCenter property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenter }
     *     
     */
    public BusinessCenter getCalculationAgentBusinessCenter() {
        return calculationAgentBusinessCenter;
    }

    /**
     * Sets the value of the calculationAgentBusinessCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenter }
     *     
     */
    public void setCalculationAgentBusinessCenter(BusinessCenter value) {
        this.calculationAgentBusinessCenter = value;
    }

    /**
     * Gets the value of the determiningParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the determiningParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeterminingParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getDeterminingParty() {
        if (determiningParty == null) {
            determiningParty = new ArrayList<PartyReference>();
        }
        return this.determiningParty;
    }

    /**
     * Gets the value of the hedgingParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hedgingParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHedgingParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getHedgingParty() {
        if (hedgingParty == null) {
            hedgingParty = new ArrayList<PartyReference>();
        }
        return this.hedgingParty;
    }

    /**
     * Gets the value of the collateral property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral }
     *     
     */
    public Collateral getCollateral() {
        return collateral;
    }

    /**
     * Sets the value of the collateral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral }
     *     
     */
    public void setCollateral(Collateral value) {
        this.collateral = value;
    }

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link Documentation }
     *     
     */
    public Documentation getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentation }
     *     
     */
    public void setDocumentation(Documentation value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the governingLaw property.
     * 
     * @return
     *     possible object is
     *     {@link GoverningLaw }
     *     
     */
    public GoverningLaw getGoverningLaw() {
        return governingLaw;
    }

    /**
     * Sets the value of the governingLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoverningLaw }
     *     
     */
    public void setGoverningLaw(GoverningLaw value) {
        this.governingLaw = value;
    }

    /**
     * Gets the value of the allocations property.
     * 
     * @return
     *     possible object is
     *     {@link Allocations }
     *     
     */
    public Allocations getAllocations() {
        return allocations;
    }

    /**
     * Sets the value of the allocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Allocations }
     *     
     */
    public void setAllocations(Allocations value) {
        this.allocations = value;
    }

    /**
     * Gets the value of the tradeSide property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeSide property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeSide().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeSide }
     * 
     * 
     */
    public List<TradeSide> getTradeSide() {
        if (tradeSide == null) {
            tradeSide = new ArrayList<TradeSide>();
        }
        return this.tradeSide;
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
