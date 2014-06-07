//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:11 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The agent bank will request that the borrower makes a fee payment in accordance with the credit agreement. The borrower will make a payment to the agent bank after which the agent bank will calculate each lender's fee amount.
 * 
 * <p>Java class for OnGoingFeeNotice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnGoingFeeNotice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}FacilityNotice">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="loanContractSummary" type="{http://www.fpml.org/2009/FpML-4-7}LoanContractSummary"/>
 *           &lt;element name="lcSummary" type="{http://www.fpml.org/2009/FpML-4-7}LcSummary"/>
 *         &lt;/choice>
 *         &lt;element name="feePayment" type="{http://www.fpml.org/2009/FpML-4-7}OnGoingFeePayment"/>
 *         &lt;element name="feeAccrualSchedule" type="{http://www.fpml.org/2009/FpML-4-7}FeeAccrualSchedule"/>
 *         &lt;element name="party" type="{http://www.fpml.org/2009/FpML-4-7}Party" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnGoingFeeNotice", propOrder = {
    "loanContractSummary",
    "lcSummary",
    "feePayment",
    "feeAccrualSchedule",
    "party"
})
public class OnGoingFeeNotice
    extends FacilityNotice
{

    protected LoanContractSummary loanContractSummary;
    protected LcSummary lcSummary;
    @XmlElement(required = true)
    protected OnGoingFeePayment feePayment;
    @XmlElement(required = true)
    protected FeeAccrualSchedule feeAccrualSchedule;
    @XmlElement(required = true)
    protected List<Party> party;

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
     * Gets the value of the lcSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LcSummary }
     *     
     */
    public LcSummary getLcSummary() {
        return lcSummary;
    }

    /**
     * Sets the value of the lcSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LcSummary }
     *     
     */
    public void setLcSummary(LcSummary value) {
        this.lcSummary = value;
    }

    /**
     * Gets the value of the feePayment property.
     * 
     * @return
     *     possible object is
     *     {@link OnGoingFeePayment }
     *     
     */
    public OnGoingFeePayment getFeePayment() {
        return feePayment;
    }

    /**
     * Sets the value of the feePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnGoingFeePayment }
     *     
     */
    public void setFeePayment(OnGoingFeePayment value) {
        this.feePayment = value;
    }

    /**
     * Gets the value of the feeAccrualSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAccrualSchedule }
     *     
     */
    public FeeAccrualSchedule getFeeAccrualSchedule() {
        return feeAccrualSchedule;
    }

    /**
     * Sets the value of the feeAccrualSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAccrualSchedule }
     *     
     */
    public void setFeeAccrualSchedule(FeeAccrualSchedule value) {
        this.feeAccrualSchedule = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

}
