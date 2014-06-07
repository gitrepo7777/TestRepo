//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:58 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Commodity Option.
 * 
 * <p>Java class for CommodityOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}BuyerSeller.model"/>
 *         &lt;element name="optionType" type="{http://www.fpml.org/2009/FpML-4-7}PutCallEnum"/>
 *         &lt;element name="commodity" type="{http://www.fpml.org/2009/FpML-4-7}Commodity"/>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}CommodityAsian.model" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}CommodityNotionalQuantity.model"/>
 *         &lt;element name="exercise" type="{http://www.fpml.org/2009/FpML-4-7}CommodityExercise"/>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}CommodityStrikePrice.model"/>
 *         &lt;element name="premium" type="{http://www.fpml.org/2009/FpML-4-7}CommodityPremium"/>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}CommodityContent.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityOption", propOrder = {
    "buyerPartyReference",
    "sellerPartyReference",
    "optionType",
    "commodity",
    "effectiveDate",
    "calculationPeriodsSchedule",
    "calculationPeriods",
    "pricingDates",
    "averagingMethod",
    "notionalQuantitySchedule",
    "notionalQuantity",
    "settlementPeriodsNotionalQuantity",
    "totalNotionalQuantity",
    "quantityReference",
    "exercise",
    "strikePricePerUnit",
    "strikePricePerUnitSchedule",
    "premium",
    "commonPricing",
    "marketDisruption",
    "settlementDisruption",
    "rounding"
})
public class CommodityOption
    extends Product
{

    @XmlElement(required = true)
    protected PartyOrTradeSideReference buyerPartyReference;
    @XmlElement(required = true)
    protected PartyOrTradeSideReference sellerPartyReference;
    @XmlElement(required = true)
    protected PutCallEnum optionType;
    @XmlElement(required = true)
    protected Commodity commodity;
    protected AdjustableOrRelativeDate effectiveDate;
    protected CommodityCalculationPeriodsSchedule calculationPeriodsSchedule;
    protected AdjustableDates calculationPeriods;
    protected CommodityPricingDates pricingDates;
    protected AveragingMethodEnum averagingMethod;
    protected CommodityNotionalQuantitySchedule notionalQuantitySchedule;
    protected CommodityNotionalQuantity notionalQuantity;
    protected List<CommoditySettlementPeriodsNotionalQuantity> settlementPeriodsNotionalQuantity;
    protected BigDecimal totalNotionalQuantity;
    protected QuantityReference quantityReference;
    @XmlElement(required = true)
    protected CommodityExercise exercise;
    protected NonNegativeMoney strikePricePerUnit;
    protected CommodityStrikeSchedule strikePricePerUnitSchedule;
    @XmlElement(required = true)
    protected CommodityPremium premium;
    protected Boolean commonPricing;
    protected CommodityMarketDisruption marketDisruption;
    protected CommodityBullionSettlementDisruptionEnum settlementDisruption;
    protected Rounding rounding;

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
     * Gets the value of the optionType property.
     * 
     * @return
     *     possible object is
     *     {@link PutCallEnum }
     *     
     */
    public PutCallEnum getOptionType() {
        return optionType;
    }

    /**
     * Sets the value of the optionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PutCallEnum }
     *     
     */
    public void setOptionType(PutCallEnum value) {
        this.optionType = value;
    }

    /**
     * Gets the value of the commodity property.
     * 
     * @return
     *     possible object is
     *     {@link Commodity }
     *     
     */
    public Commodity getCommodity() {
        return commodity;
    }

    /**
     * Sets the value of the commodity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commodity }
     *     
     */
    public void setCommodity(Commodity value) {
        this.commodity = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setEffectiveDate(AdjustableOrRelativeDate value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the calculationPeriodsSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityCalculationPeriodsSchedule }
     *     
     */
    public CommodityCalculationPeriodsSchedule getCalculationPeriodsSchedule() {
        return calculationPeriodsSchedule;
    }

    /**
     * Sets the value of the calculationPeriodsSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityCalculationPeriodsSchedule }
     *     
     */
    public void setCalculationPeriodsSchedule(CommodityCalculationPeriodsSchedule value) {
        this.calculationPeriodsSchedule = value;
    }

    /**
     * Gets the value of the calculationPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDates }
     *     
     */
    public AdjustableDates getCalculationPeriods() {
        return calculationPeriods;
    }

    /**
     * Sets the value of the calculationPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDates }
     *     
     */
    public void setCalculationPeriods(AdjustableDates value) {
        this.calculationPeriods = value;
    }

    /**
     * Gets the value of the pricingDates property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityPricingDates }
     *     
     */
    public CommodityPricingDates getPricingDates() {
        return pricingDates;
    }

    /**
     * Sets the value of the pricingDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPricingDates }
     *     
     */
    public void setPricingDates(CommodityPricingDates value) {
        this.pricingDates = value;
    }

    /**
     * Gets the value of the averagingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link AveragingMethodEnum }
     *     
     */
    public AveragingMethodEnum getAveragingMethod() {
        return averagingMethod;
    }

    /**
     * Sets the value of the averagingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AveragingMethodEnum }
     *     
     */
    public void setAveragingMethod(AveragingMethodEnum value) {
        this.averagingMethod = value;
    }

    /**
     * Gets the value of the notionalQuantitySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityNotionalQuantitySchedule }
     *     
     */
    public CommodityNotionalQuantitySchedule getNotionalQuantitySchedule() {
        return notionalQuantitySchedule;
    }

    /**
     * Sets the value of the notionalQuantitySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityNotionalQuantitySchedule }
     *     
     */
    public void setNotionalQuantitySchedule(CommodityNotionalQuantitySchedule value) {
        this.notionalQuantitySchedule = value;
    }

    /**
     * Gets the value of the notionalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityNotionalQuantity }
     *     
     */
    public CommodityNotionalQuantity getNotionalQuantity() {
        return notionalQuantity;
    }

    /**
     * Sets the value of the notionalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityNotionalQuantity }
     *     
     */
    public void setNotionalQuantity(CommodityNotionalQuantity value) {
        this.notionalQuantity = value;
    }

    /**
     * Gets the value of the settlementPeriodsNotionalQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementPeriodsNotionalQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementPeriodsNotionalQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommoditySettlementPeriodsNotionalQuantity }
     * 
     * 
     */
    public List<CommoditySettlementPeriodsNotionalQuantity> getSettlementPeriodsNotionalQuantity() {
        if (settlementPeriodsNotionalQuantity == null) {
            settlementPeriodsNotionalQuantity = new ArrayList<CommoditySettlementPeriodsNotionalQuantity>();
        }
        return this.settlementPeriodsNotionalQuantity;
    }

    /**
     * Gets the value of the totalNotionalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalNotionalQuantity() {
        return totalNotionalQuantity;
    }

    /**
     * Sets the value of the totalNotionalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalNotionalQuantity(BigDecimal value) {
        this.totalNotionalQuantity = value;
    }

    /**
     * Gets the value of the quantityReference property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityReference }
     *     
     */
    public QuantityReference getQuantityReference() {
        return quantityReference;
    }

    /**
     * Sets the value of the quantityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityReference }
     *     
     */
    public void setQuantityReference(QuantityReference value) {
        this.quantityReference = value;
    }

    /**
     * Gets the value of the exercise property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityExercise }
     *     
     */
    public CommodityExercise getExercise() {
        return exercise;
    }

    /**
     * Sets the value of the exercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityExercise }
     *     
     */
    public void setExercise(CommodityExercise value) {
        this.exercise = value;
    }

    /**
     * Gets the value of the strikePricePerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getStrikePricePerUnit() {
        return strikePricePerUnit;
    }

    /**
     * Sets the value of the strikePricePerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setStrikePricePerUnit(NonNegativeMoney value) {
        this.strikePricePerUnit = value;
    }

    /**
     * Gets the value of the strikePricePerUnitSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityStrikeSchedule }
     *     
     */
    public CommodityStrikeSchedule getStrikePricePerUnitSchedule() {
        return strikePricePerUnitSchedule;
    }

    /**
     * Sets the value of the strikePricePerUnitSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityStrikeSchedule }
     *     
     */
    public void setStrikePricePerUnitSchedule(CommodityStrikeSchedule value) {
        this.strikePricePerUnitSchedule = value;
    }

    /**
     * Gets the value of the premium property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityPremium }
     *     
     */
    public CommodityPremium getPremium() {
        return premium;
    }

    /**
     * Sets the value of the premium property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPremium }
     *     
     */
    public void setPremium(CommodityPremium value) {
        this.premium = value;
    }

    /**
     * Gets the value of the commonPricing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommonPricing() {
        return commonPricing;
    }

    /**
     * Sets the value of the commonPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommonPricing(Boolean value) {
        this.commonPricing = value;
    }

    /**
     * Gets the value of the marketDisruption property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityMarketDisruption }
     *     
     */
    public CommodityMarketDisruption getMarketDisruption() {
        return marketDisruption;
    }

    /**
     * Sets the value of the marketDisruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityMarketDisruption }
     *     
     */
    public void setMarketDisruption(CommodityMarketDisruption value) {
        this.marketDisruption = value;
    }

    /**
     * Gets the value of the settlementDisruption property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityBullionSettlementDisruptionEnum }
     *     
     */
    public CommodityBullionSettlementDisruptionEnum getSettlementDisruption() {
        return settlementDisruption;
    }

    /**
     * Sets the value of the settlementDisruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityBullionSettlementDisruptionEnum }
     *     
     */
    public void setSettlementDisruption(CommodityBullionSettlementDisruptionEnum value) {
        this.settlementDisruption = value;
    }

    /**
     * Gets the value of the rounding property.
     * 
     * @return
     *     possible object is
     *     {@link Rounding }
     *     
     */
    public Rounding getRounding() {
        return rounding;
    }

    /**
     * Sets the value of the rounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rounding }
     *     
     */
    public void setRounding(Rounding value) {
        this.rounding = value;
    }

}
