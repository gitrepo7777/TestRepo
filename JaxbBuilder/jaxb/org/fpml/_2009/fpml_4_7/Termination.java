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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An event type that defines the content of a Termination transaction.
 * 
 * <p>Java class for Termination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Termination">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}Event">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}TradeOrTradeReference.model"/>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}TerminationDetails.model"/>
 *         &lt;element name="payment" type="{http://www.fpml.org/2009/FpML-4-7}Payment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Termination", propOrder = {
    "trade",
    "tradeReference",
    "terminationTradeDate",
    "terminationEffectiveDate",
    "full",
    "partial",
    "payment"
})
public class Termination
    extends Event
{

    protected Trade trade;
    protected PartyTradeIdentifiers tradeReference;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminationTradeDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminationEffectiveDate;
    protected Empty full;
    protected PartialTerminationAmount partial;
    protected Payment payment;

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
     * Gets the value of the terminationTradeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationTradeDate() {
        return terminationTradeDate;
    }

    /**
     * Sets the value of the terminationTradeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationTradeDate(XMLGregorianCalendar value) {
        this.terminationTradeDate = value;
    }

    /**
     * Gets the value of the terminationEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationEffectiveDate() {
        return terminationEffectiveDate;
    }

    /**
     * Sets the value of the terminationEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationEffectiveDate(XMLGregorianCalendar value) {
        this.terminationEffectiveDate = value;
    }

    /**
     * Gets the value of the full property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getFull() {
        return full;
    }

    /**
     * Sets the value of the full property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setFull(Empty value) {
        this.full = value;
    }

    /**
     * Gets the value of the partial property.
     * 
     * @return
     *     possible object is
     *     {@link PartialTerminationAmount }
     *     
     */
    public PartialTerminationAmount getPartial() {
        return partial;
    }

    /**
     * Sets the value of the partial property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialTerminationAmount }
     *     
     */
    public void setPartial(PartialTerminationAmount value) {
        this.partial = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

}