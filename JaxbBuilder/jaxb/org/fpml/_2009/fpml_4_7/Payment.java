//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining payments
 * 
 * <p>Java class for Payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}PaymentBase">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}PayerReceiver.model"/>
 *         &lt;element name="paymentAmount" type="{http://www.fpml.org/2009/FpML-4-7}Money"/>
 *         &lt;element name="paymentDate" type="{http://www.fpml.org/2009/FpML-4-7}AdjustableDate" minOccurs="0"/>
 *         &lt;element name="adjustedPaymentDate" type="{http://www.fpml.org/2009/FpML-4-7}IdentifiedDate" minOccurs="0"/>
 *         &lt;element name="paymentType" type="{http://www.fpml.org/2009/FpML-4-7}PaymentType" minOccurs="0"/>
 *         &lt;element name="settlementInformation" type="{http://www.fpml.org/2009/FpML-4-7}SettlementInformation" minOccurs="0"/>
 *         &lt;element name="discountFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="presentValueAmount" type="{http://www.fpml.org/2009/FpML-4-7}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", propOrder = {
    "payerPartyReference",
    "receiverPartyReference",
    "paymentAmount",
    "paymentDate",
    "adjustedPaymentDate",
    "paymentType",
    "settlementInformation",
    "discountFactor",
    "presentValueAmount"
})
public class Payment
    extends PaymentBase
{

    @XmlElement(required = true)
    protected PartyOrAccountReference payerPartyReference;
    @XmlElement(required = true)
    protected PartyOrAccountReference receiverPartyReference;
    @XmlElement(required = true)
    protected Money paymentAmount;
    protected AdjustableDate paymentDate;
    protected IdentifiedDate adjustedPaymentDate;
    protected PaymentType paymentType;
    protected SettlementInformation settlementInformation;
    protected BigDecimal discountFactor;
    protected Money presentValueAmount;
    @XmlAttribute
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object href;

    /**
     * Gets the value of the payerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyOrAccountReference }
     *     
     */
    public PartyOrAccountReference getPayerPartyReference() {
        return payerPartyReference;
    }

    /**
     * Sets the value of the payerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyOrAccountReference }
     *     
     */
    public void setPayerPartyReference(PartyOrAccountReference value) {
        this.payerPartyReference = value;
    }

    /**
     * Gets the value of the receiverPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyOrAccountReference }
     *     
     */
    public PartyOrAccountReference getReceiverPartyReference() {
        return receiverPartyReference;
    }

    /**
     * Sets the value of the receiverPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyOrAccountReference }
     *     
     */
    public void setReceiverPartyReference(PartyOrAccountReference value) {
        this.receiverPartyReference = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPaymentAmount(Money value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate }
     *     
     */
    public AdjustableDate getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate }
     *     
     */
    public void setPaymentDate(AdjustableDate value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the adjustedPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getAdjustedPaymentDate() {
        return adjustedPaymentDate;
    }

    /**
     * Sets the value of the adjustedPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setAdjustedPaymentDate(IdentifiedDate value) {
        this.adjustedPaymentDate = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentType(PaymentType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the settlementInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInformation }
     *     
     */
    public SettlementInformation getSettlementInformation() {
        return settlementInformation;
    }

    /**
     * Sets the value of the settlementInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInformation }
     *     
     */
    public void setSettlementInformation(SettlementInformation value) {
        this.settlementInformation = value;
    }

    /**
     * Gets the value of the discountFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountFactor() {
        return discountFactor;
    }

    /**
     * Sets the value of the discountFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountFactor(BigDecimal value) {
        this.discountFactor = value;
    }

    /**
     * Gets the value of the presentValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPresentValueAmount() {
        return presentValueAmount;
    }

    /**
     * Sets the value of the presentValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPresentValueAmount(Money value) {
        this.presentValueAmount = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHref(Object value) {
        this.href = value;
    }

}