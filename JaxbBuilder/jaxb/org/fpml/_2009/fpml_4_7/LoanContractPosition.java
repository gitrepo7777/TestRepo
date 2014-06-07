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
import javax.xml.bind.annotation.XmlType;


/**
 * Represents outstanding loan amounts on both the global and lender position levels.
 * 
 * <p>Java class for LoanContractPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanContractPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loanContractSummary" type="{http://www.fpml.org/2009/FpML-4-7}LoanContractSummary"/>
 *         &lt;element name="currentAmount" type="{http://www.fpml.org/2009/FpML-4-7}ParticipationAmount"/>
 *         &lt;element name="priorAmount" type="{http://www.fpml.org/2009/FpML-4-7}ParticipationAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanContractPosition", propOrder = {
    "loanContractSummary",
    "currentAmount",
    "priorAmount"
})
public class LoanContractPosition {

    @XmlElement(required = true)
    protected LoanContractSummary loanContractSummary;
    @XmlElement(required = true)
    protected ParticipationAmount currentAmount;
    protected ParticipationAmount priorAmount;

    /**
     * Gets the value of the loanContractSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LoanContractSummary }
     *     
     */
    public LoanContractSummary getLoanContractSummary() {
        return loanContractSummary;
    }

    /**
     * Sets the value of the loanContractSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanContractSummary }
     *     
     */
    public void setLoanContractSummary(LoanContractSummary value) {
        this.loanContractSummary = value;
    }

    /**
     * Gets the value of the currentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationAmount }
     *     
     */
    public ParticipationAmount getCurrentAmount() {
        return currentAmount;
    }

    /**
     * Sets the value of the currentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationAmount }
     *     
     */
    public void setCurrentAmount(ParticipationAmount value) {
        this.currentAmount = value;
    }

    /**
     * Gets the value of the priorAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationAmount }
     *     
     */
    public ParticipationAmount getPriorAmount() {
        return priorAmount;
    }

    /**
     * Sets the value of the priorAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationAmount }
     *     
     */
    public void setPriorAmount(ParticipationAmount value) {
        this.priorAmount = value;
    }

}
