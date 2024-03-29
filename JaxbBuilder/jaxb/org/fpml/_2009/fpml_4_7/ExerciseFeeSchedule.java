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
 * A type to define a fee or schedule of fees to be payable on the exercise of an option. This fee may be defined as an amount or a percentage of the notional exercised.
 * 
 * <p>Java class for ExerciseFeeSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExerciseFeeSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}PayerReceiver.model"/>
 *         &lt;element name="notionalReference" type="{http://www.fpml.org/2009/FpML-4-7}ScheduleReference"/>
 *         &lt;choice>
 *           &lt;element name="feeAmountSchedule" type="{http://www.fpml.org/2009/FpML-4-7}AmountSchedule"/>
 *           &lt;element name="feeRateSchedule" type="{http://www.fpml.org/2009/FpML-4-7}Schedule"/>
 *         &lt;/choice>
 *         &lt;element name="feePaymentDate" type="{http://www.fpml.org/2009/FpML-4-7}RelativeDateOffset"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExerciseFeeSchedule", propOrder = {
    "payerPartyReference",
    "receiverPartyReference",
    "notionalReference",
    "feeAmountSchedule",
    "feeRateSchedule",
    "feePaymentDate"
})
public class ExerciseFeeSchedule {

    @XmlElement(required = true)
    protected PartyOrAccountReference payerPartyReference;
    @XmlElement(required = true)
    protected PartyOrAccountReference receiverPartyReference;
    @XmlElement(required = true)
    protected ScheduleReference notionalReference;
    protected AmountSchedule feeAmountSchedule;
    protected Schedule feeRateSchedule;
    @XmlElement(required = true)
    protected RelativeDateOffset feePaymentDate;

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
     * Gets the value of the notionalReference property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleReference }
     *     
     */
    public ScheduleReference getNotionalReference() {
        return notionalReference;
    }

    /**
     * Sets the value of the notionalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleReference }
     *     
     */
    public void setNotionalReference(ScheduleReference value) {
        this.notionalReference = value;
    }

    /**
     * Gets the value of the feeAmountSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link AmountSchedule }
     *     
     */
    public AmountSchedule getFeeAmountSchedule() {
        return feeAmountSchedule;
    }

    /**
     * Sets the value of the feeAmountSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountSchedule }
     *     
     */
    public void setFeeAmountSchedule(AmountSchedule value) {
        this.feeAmountSchedule = value;
    }

    /**
     * Gets the value of the feeRateSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getFeeRateSchedule() {
        return feeRateSchedule;
    }

    /**
     * Sets the value of the feeRateSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setFeeRateSchedule(Schedule value) {
        this.feeRateSchedule = value;
    }

    /**
     * Gets the value of the feePaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDateOffset }
     *     
     */
    public RelativeDateOffset getFeePaymentDate() {
        return feePaymentDate;
    }

    /**
     * Sets the value of the feePaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDateOffset }
     *     
     */
    public void setFeePaymentDate(RelativeDateOffset value) {
        this.feePaymentDate = value;
    }

}
