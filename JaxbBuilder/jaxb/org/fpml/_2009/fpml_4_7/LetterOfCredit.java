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
 * An unfunded borrowing in the form of a Letter of Credit.
 * 
 * <p>Java class for LetterOfCredit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LetterOfCredit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lcSummary" type="{http://www.fpml.org/2009/FpML-4-7}LcSummary"/>
 *         &lt;element name="lcType" type="{http://www.fpml.org/2009/FpML-4-7}LcTypeEnum"/>
 *         &lt;element name="lcPurpose" type="{http://www.fpml.org/2009/FpML-4-7}LcPurposeEnum"/>
 *         &lt;element name="borrowerPartyReference" type="{http://www.fpml.org/2009/FpML-4-7}PartyReference"/>
 *         &lt;choice>
 *           &lt;element name="beneficiaryPartyReference" type="{http://www.fpml.org/2009/FpML-4-7}PartyReference"/>
 *           &lt;element name="beneficiaryPartyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="originalAmount" type="{http://www.fpml.org/2009/FpML-4-7}Money"/>
 *         &lt;element name="amount" type="{http://www.fpml.org/2009/FpML-4-7}Money"/>
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fxTerms" type="{http://www.fpml.org/2009/FpML-4-7}FxTerms" minOccurs="0"/>
 *         &lt;element name="evergreenOption" type="{http://www.fpml.org/2009/FpML-4-7}LcEvergreenOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LetterOfCredit", propOrder = {
    "lcSummary",
    "lcType",
    "lcPurpose",
    "borrowerPartyReference",
    "beneficiaryPartyReference",
    "beneficiaryPartyName",
    "originalAmount",
    "amount",
    "effectiveDate",
    "expiryDate",
    "fxTerms",
    "evergreenOption"
})
public class LetterOfCredit {

    @XmlElement(required = true)
    protected LcSummary lcSummary;
    @XmlElement(required = true)
    protected LcTypeEnum lcType;
    @XmlElement(required = true)
    protected LcPurposeEnum lcPurpose;
    @XmlElement(required = true)
    protected PartyReference borrowerPartyReference;
    protected PartyReference beneficiaryPartyReference;
    protected String beneficiaryPartyName;
    @XmlElement(required = true)
    protected Money originalAmount;
    @XmlElement(required = true)
    protected Money amount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    protected FxTerms fxTerms;
    protected LcEvergreenOption evergreenOption;

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
     * Gets the value of the lcType property.
     * 
     * @return
     *     possible object is
     *     {@link LcTypeEnum }
     *     
     */
    public LcTypeEnum getLcType() {
        return lcType;
    }

    /**
     * Sets the value of the lcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LcTypeEnum }
     *     
     */
    public void setLcType(LcTypeEnum value) {
        this.lcType = value;
    }

    /**
     * Gets the value of the lcPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link LcPurposeEnum }
     *     
     */
    public LcPurposeEnum getLcPurpose() {
        return lcPurpose;
    }

    /**
     * Sets the value of the lcPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link LcPurposeEnum }
     *     
     */
    public void setLcPurpose(LcPurposeEnum value) {
        this.lcPurpose = value;
    }

    /**
     * Gets the value of the borrowerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getBorrowerPartyReference() {
        return borrowerPartyReference;
    }

    /**
     * Sets the value of the borrowerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setBorrowerPartyReference(PartyReference value) {
        this.borrowerPartyReference = value;
    }

    /**
     * Gets the value of the beneficiaryPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getBeneficiaryPartyReference() {
        return beneficiaryPartyReference;
    }

    /**
     * Sets the value of the beneficiaryPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setBeneficiaryPartyReference(PartyReference value) {
        this.beneficiaryPartyReference = value;
    }

    /**
     * Gets the value of the beneficiaryPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryPartyName() {
        return beneficiaryPartyName;
    }

    /**
     * Sets the value of the beneficiaryPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryPartyName(String value) {
        this.beneficiaryPartyName = value;
    }

    /**
     * Gets the value of the originalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Sets the value of the originalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setOriginalAmount(Money value) {
        this.originalAmount = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmount(Money value) {
        this.amount = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the fxTerms property.
     * 
     * @return
     *     possible object is
     *     {@link FxTerms }
     *     
     */
    public FxTerms getFxTerms() {
        return fxTerms;
    }

    /**
     * Sets the value of the fxTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxTerms }
     *     
     */
    public void setFxTerms(FxTerms value) {
        this.fxTerms = value;
    }

    /**
     * Gets the value of the evergreenOption property.
     * 
     * @return
     *     possible object is
     *     {@link LcEvergreenOption }
     *     
     */
    public LcEvergreenOption getEvergreenOption() {
        return evergreenOption;
    }

    /**
     * Sets the value of the evergreenOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link LcEvergreenOption }
     *     
     */
    public void setEvergreenOption(LcEvergreenOption value) {
        this.evergreenOption = value;
    }

}
