//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:16 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type defining a Forward Rate Agreement (FRA) product.
 * 
 * <p>Java class for Fra complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fra">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}BuyerSeller.model"/>
 *         &lt;element name="adjustedEffectiveDate" type="{http://www.fpml.org/2009/FpML-4-7}RequiredIdentifierDate"/>
 *         &lt;element name="adjustedTerminationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="paymentDate" type="{http://www.fpml.org/2009/FpML-4-7}AdjustableDate"/>
 *         &lt;element name="fixingDateOffset" type="{http://www.fpml.org/2009/FpML-4-7}RelativeDateOffset"/>
 *         &lt;element name="dayCountFraction" type="{http://www.fpml.org/2009/FpML-4-7}DayCountFraction"/>
 *         &lt;element name="calculationPeriodNumberOfDays" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="notional" type="{http://www.fpml.org/2009/FpML-4-7}Money"/>
 *         &lt;element name="fixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="floatingRateIndex" type="{http://www.fpml.org/2009/FpML-4-7}FloatingRateIndex"/>
 *         &lt;element name="indexTenor" type="{http://www.fpml.org/2009/FpML-4-7}Period" maxOccurs="unbounded"/>
 *         &lt;element name="fraDiscounting" type="{http://www.fpml.org/2009/FpML-4-7}FraDiscountingEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fra", propOrder = {
    "buyerPartyReference",
    "sellerPartyReference",
    "adjustedEffectiveDate",
    "adjustedTerminationDate",
    "paymentDate",
    "fixingDateOffset",
    "dayCountFraction",
    "calculationPeriodNumberOfDays",
    "notional",
    "fixedRate",
    "floatingRateIndex",
    "indexTenor",
    "fraDiscounting"
})
public class Fra
    extends Product
{

    @XmlElement(required = true)
    protected PartyOrTradeSideReference buyerPartyReference;
    @XmlElement(required = true)
    protected PartyOrTradeSideReference sellerPartyReference;
    @XmlElement(required = true)
    protected RequiredIdentifierDate adjustedEffectiveDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar adjustedTerminationDate;
    @XmlElement(required = true)
    protected AdjustableDate paymentDate;
    @XmlElement(required = true)
    protected RelativeDateOffset fixingDateOffset;
    @XmlElement(required = true)
    protected DayCountFraction dayCountFraction;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger calculationPeriodNumberOfDays;
    @XmlElement(required = true)
    protected Money notional;
    @XmlElement(required = true)
    protected BigDecimal fixedRate;
    @XmlElement(required = true)
    protected FloatingRateIndex floatingRateIndex;
    @XmlElement(required = true)
    protected List<Period> indexTenor;
    @XmlElement(required = true)
    protected FraDiscountingEnum fraDiscounting;

    /**
     * Gets the value of the buyerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyOrTradeSideReference }
     *     
     */
    public PartyOrTradeSideReference getBuyerPartyReference() {
        return buyerPartyReference;
    }

    /**
     * Sets the value of the buyerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyOrTradeSideReference }
     *     
     */
    public void setBuyerPartyReference(PartyOrTradeSideReference value) {
        this.buyerPartyReference = value;
    }

    /**
     * Gets the value of the sellerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyOrTradeSideReference }
     *     
     */
    public PartyOrTradeSideReference getSellerPartyReference() {
        return sellerPartyReference;
    }

    /**
     * Sets the value of the sellerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyOrTradeSideReference }
     *     
     */
    public void setSellerPartyReference(PartyOrTradeSideReference value) {
        this.sellerPartyReference = value;
    }

    /**
     * Gets the value of the adjustedEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredIdentifierDate }
     *     
     */
    public RequiredIdentifierDate getAdjustedEffectiveDate() {
        return adjustedEffectiveDate;
    }

    /**
     * Sets the value of the adjustedEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredIdentifierDate }
     *     
     */
    public void setAdjustedEffectiveDate(RequiredIdentifierDate value) {
        this.adjustedEffectiveDate = value;
    }

    /**
     * Gets the value of the adjustedTerminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdjustedTerminationDate() {
        return adjustedTerminationDate;
    }

    /**
     * Sets the value of the adjustedTerminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdjustedTerminationDate(XMLGregorianCalendar value) {
        this.adjustedTerminationDate = value;
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
     * Gets the value of the fixingDateOffset property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDateOffset }
     *     
     */
    public RelativeDateOffset getFixingDateOffset() {
        return fixingDateOffset;
    }

    /**
     * Sets the value of the fixingDateOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDateOffset }
     *     
     */
    public void setFixingDateOffset(RelativeDateOffset value) {
        this.fixingDateOffset = value;
    }

    /**
     * Gets the value of the dayCountFraction property.
     * 
     * @return
     *     possible object is
     *     {@link DayCountFraction }
     *     
     */
    public DayCountFraction getDayCountFraction() {
        return dayCountFraction;
    }

    /**
     * Sets the value of the dayCountFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayCountFraction }
     *     
     */
    public void setDayCountFraction(DayCountFraction value) {
        this.dayCountFraction = value;
    }

    /**
     * Gets the value of the calculationPeriodNumberOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCalculationPeriodNumberOfDays() {
        return calculationPeriodNumberOfDays;
    }

    /**
     * Sets the value of the calculationPeriodNumberOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCalculationPeriodNumberOfDays(BigInteger value) {
        this.calculationPeriodNumberOfDays = value;
    }

    /**
     * Gets the value of the notional property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getNotional() {
        return notional;
    }

    /**
     * Sets the value of the notional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setNotional(Money value) {
        this.notional = value;
    }

    /**
     * Gets the value of the fixedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedRate() {
        return fixedRate;
    }

    /**
     * Sets the value of the fixedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedRate(BigDecimal value) {
        this.fixedRate = value;
    }

    /**
     * Gets the value of the floatingRateIndex property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateIndex }
     *     
     */
    public FloatingRateIndex getFloatingRateIndex() {
        return floatingRateIndex;
    }

    /**
     * Sets the value of the floatingRateIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateIndex }
     *     
     */
    public void setFloatingRateIndex(FloatingRateIndex value) {
        this.floatingRateIndex = value;
    }

    /**
     * Gets the value of the indexTenor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indexTenor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexTenor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Period }
     * 
     * 
     */
    public List<Period> getIndexTenor() {
        if (indexTenor == null) {
            indexTenor = new ArrayList<Period>();
        }
        return this.indexTenor;
    }

    /**
     * Gets the value of the fraDiscounting property.
     * 
     * @return
     *     possible object is
     *     {@link FraDiscountingEnum }
     *     
     */
    public FraDiscountingEnum getFraDiscounting() {
        return fraDiscounting;
    }

    /**
     * Sets the value of the fraDiscounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraDiscountingEnum }
     *     
     */
    public void setFraDiscounting(FraDiscountingEnum value) {
        this.fraDiscounting = value;
    }

}
