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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Allocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Allocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allocationTradeId" type="{http://www.fpml.org/2009/FpML-4-7}PartyTradeIdentifier"/>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}AccountReferenceOrPartyReference.model"/>
 *         &lt;choice>
 *           &lt;element name="allocatedFraction" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="allocatedNotional" type="{http://www.fpml.org/2009/FpML-4-7}Money"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}AllocationContent.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Allocation", propOrder = {
    "allocationTradeId",
    "accountReference",
    "partyReference",
    "allocatedFraction",
    "allocatedNotional",
    "collateral",
    "creditChargeAmount",
    "approvals",
    "masterConfirmationDate"
})
public class Allocation {

    @XmlElement(required = true)
    protected PartyTradeIdentifier allocationTradeId;
    protected AccountReference accountReference;
    protected PartyReference partyReference;
    protected BigDecimal allocatedFraction;
    protected Money allocatedNotional;
    protected Collateral collateral;
    protected Money creditChargeAmount;
    protected Approvals approvals;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar masterConfirmationDate;

    /**
     * Gets the value of the allocationTradeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTradeIdentifier }
     *     
     */
    public PartyTradeIdentifier getAllocationTradeId() {
        return allocationTradeId;
    }

    /**
     * Sets the value of the allocationTradeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTradeIdentifier }
     *     
     */
    public void setAllocationTradeId(PartyTradeIdentifier value) {
        this.allocationTradeId = value;
    }

    /**
     * Gets the value of the accountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getAccountReference() {
        return accountReference;
    }

    /**
     * Sets the value of the accountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setAccountReference(AccountReference value) {
        this.accountReference = value;
    }

    /**
     * Gets the value of the partyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getPartyReference() {
        return partyReference;
    }

    /**
     * Sets the value of the partyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setPartyReference(PartyReference value) {
        this.partyReference = value;
    }

    /**
     * Gets the value of the allocatedFraction property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllocatedFraction() {
        return allocatedFraction;
    }

    /**
     * Sets the value of the allocatedFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAllocatedFraction(BigDecimal value) {
        this.allocatedFraction = value;
    }

    /**
     * Gets the value of the allocatedNotional property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAllocatedNotional() {
        return allocatedNotional;
    }

    /**
     * Sets the value of the allocatedNotional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAllocatedNotional(Money value) {
        this.allocatedNotional = value;
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
     * Gets the value of the creditChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCreditChargeAmount() {
        return creditChargeAmount;
    }

    /**
     * Sets the value of the creditChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCreditChargeAmount(Money value) {
        this.creditChargeAmount = value;
    }

    /**
     * Gets the value of the approvals property.
     * 
     * @return
     *     possible object is
     *     {@link Approvals }
     *     
     */
    public Approvals getApprovals() {
        return approvals;
    }

    /**
     * Sets the value of the approvals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Approvals }
     *     
     */
    public void setApprovals(Approvals value) {
        this.approvals = value;
    }

    /**
     * Gets the value of the masterConfirmationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMasterConfirmationDate() {
        return masterConfirmationDate;
    }

    /**
     * Sets the value of the masterConfirmationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMasterConfirmationDate(XMLGregorianCalendar value) {
        this.masterConfirmationDate = value;
    }

}
