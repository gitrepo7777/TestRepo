//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:20 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type that represents a single exchange of one currency for another. This is used for representing FX spot, forward, and swap transactions.
 * 
 * <p>Java class for FxLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}Product">
 *       &lt;sequence>
 *         &lt;element name="exchangedCurrency1" type="{http://www.fpml.org/2009/FpML-4-7}Payment"/>
 *         &lt;element name="exchangedCurrency2" type="{http://www.fpml.org/2009/FpML-4-7}Payment"/>
 *         &lt;choice>
 *           &lt;element name="valueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;sequence>
 *             &lt;element name="currency1ValueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *             &lt;element name="currency2ValueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="exchangeRate" type="{http://www.fpml.org/2009/FpML-4-7}ExchangeRate"/>
 *         &lt;element name="nonDeliverableForward" type="{http://www.fpml.org/2009/FpML-4-7}FxCashSettlement" minOccurs="0"/>
 *         &lt;element name="confirmationSenderPartyReference" type="{http://www.fpml.org/2009/FpML-4-7}PartyReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxLeg", propOrder = {
    "exchangedCurrency1",
    "exchangedCurrency2",
    "valueDate",
    "currency1ValueDate",
    "currency2ValueDate",
    "exchangeRate",
    "nonDeliverableForward",
    "confirmationSenderPartyReference"
})
public class FxLeg
    extends Product
{

    @XmlElement(required = true)
    protected Payment exchangedCurrency1;
    @XmlElement(required = true)
    protected Payment exchangedCurrency2;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valueDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar currency1ValueDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar currency2ValueDate;
    @XmlElement(required = true)
    protected ExchangeRate exchangeRate;
    protected FxCashSettlement nonDeliverableForward;
    protected PartyReference confirmationSenderPartyReference;

    /**
     * Gets the value of the exchangedCurrency1 property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getExchangedCurrency1() {
        return exchangedCurrency1;
    }

    /**
     * Sets the value of the exchangedCurrency1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setExchangedCurrency1(Payment value) {
        this.exchangedCurrency1 = value;
    }

    /**
     * Gets the value of the exchangedCurrency2 property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getExchangedCurrency2() {
        return exchangedCurrency2;
    }

    /**
     * Sets the value of the exchangedCurrency2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setExchangedCurrency2(Payment value) {
        this.exchangedCurrency2 = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the currency1ValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrency1ValueDate() {
        return currency1ValueDate;
    }

    /**
     * Sets the value of the currency1ValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrency1ValueDate(XMLGregorianCalendar value) {
        this.currency1ValueDate = value;
    }

    /**
     * Gets the value of the currency2ValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrency2ValueDate() {
        return currency2ValueDate;
    }

    /**
     * Sets the value of the currency2ValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrency2ValueDate(XMLGregorianCalendar value) {
        this.currency2ValueDate = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRate }
     *     
     */
    public ExchangeRate getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRate }
     *     
     */
    public void setExchangeRate(ExchangeRate value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the nonDeliverableForward property.
     * 
     * @return
     *     possible object is
     *     {@link FxCashSettlement }
     *     
     */
    public FxCashSettlement getNonDeliverableForward() {
        return nonDeliverableForward;
    }

    /**
     * Sets the value of the nonDeliverableForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxCashSettlement }
     *     
     */
    public void setNonDeliverableForward(FxCashSettlement value) {
        this.nonDeliverableForward = value;
    }

    /**
     * Gets the value of the confirmationSenderPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getConfirmationSenderPartyReference() {
        return confirmationSenderPartyReference;
    }

    /**
     * Sets the value of the confirmationSenderPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setConfirmationSenderPartyReference(PartyReference value) {
        this.confirmationSenderPartyReference = value;
    }

}
