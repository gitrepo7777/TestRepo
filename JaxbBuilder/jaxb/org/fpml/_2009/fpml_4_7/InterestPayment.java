//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:11 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A payment requested by the agent bank from each lender for the accrued interest amount for the given period and a given loan contract.
 * 
 * <p>Java class for InterestPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestPayment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}PaymentBase">
 *       &lt;sequence>
 *         &lt;element name="calculationMethod" type="{http://www.fpml.org/2009/FpML-4-7}InterestCalculationMethodEnum"/>
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="amount" type="{http://www.fpml.org/2009/FpML-4-7}ParticipationAmount"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestPayment", propOrder = {
    "calculationMethod",
    "paymentDate",
    "amount"
})
public class InterestPayment
    extends PaymentBase
{

    @XmlElement(required = true)
    protected InterestCalculationMethodEnum calculationMethod;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(required = true)
    protected ParticipationAmount amount;

    /**
     * Gets the value of the calculationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link InterestCalculationMethodEnum }
     *     
     */
    public InterestCalculationMethodEnum getCalculationMethod() {
        return calculationMethod;
    }

    /**
     * Sets the value of the calculationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestCalculationMethodEnum }
     *     
     */
    public void setCalculationMethod(InterestCalculationMethodEnum value) {
        this.calculationMethod = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationAmount }
     *     
     */
    public ParticipationAmount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationAmount }
     *     
     */
    public void setAmount(ParticipationAmount value) {
        this.amount = value;
    }

}