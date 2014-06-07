//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:16 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the cashflow representation of a swap trade.
 * 
 * <p>Java class for Cashflows complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cashflows">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cashflowsMatchParameters" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="principalExchange" type="{http://www.fpml.org/2009/FpML-4-7}PrincipalExchange" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paymentCalculationPeriod" type="{http://www.fpml.org/2009/FpML-4-7}PaymentCalculationPeriod" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cashflows", propOrder = {
    "cashflowsMatchParameters",
    "principalExchange",
    "paymentCalculationPeriod"
})
public class Cashflows {

    protected boolean cashflowsMatchParameters;
    protected List<PrincipalExchange> principalExchange;
    protected List<PaymentCalculationPeriod> paymentCalculationPeriod;

    /**
     * Gets the value of the cashflowsMatchParameters property.
     * 
     */
    public boolean isCashflowsMatchParameters() {
        return cashflowsMatchParameters;
    }

    /**
     * Sets the value of the cashflowsMatchParameters property.
     * 
     */
    public void setCashflowsMatchParameters(boolean value) {
        this.cashflowsMatchParameters = value;
    }

    /**
     * Gets the value of the principalExchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalExchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalExchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrincipalExchange }
     * 
     * 
     */
    public List<PrincipalExchange> getPrincipalExchange() {
        if (principalExchange == null) {
            principalExchange = new ArrayList<PrincipalExchange>();
        }
        return this.principalExchange;
    }

    /**
     * Gets the value of the paymentCalculationPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentCalculationPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentCalculationPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCalculationPeriod }
     * 
     * 
     */
    public List<PaymentCalculationPeriod> getPaymentCalculationPeriod() {
        if (paymentCalculationPeriod == null) {
            paymentCalculationPeriod = new ArrayList<PaymentCalculationPeriod>();
        }
        return this.paymentCalculationPeriod;
    }

}