//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:58 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * ISDA 1993 or 2005 commodity market disruption elements.
 * 
 * <p>Java class for CommodityMarketDisruption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityMarketDisruption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="marketDisruptionEvents" type="{http://www.fpml.org/2009/FpML-4-7}MarketDisruptionEventsEnum"/>
 *             &lt;element name="additionalMarketDisruptionEvent" type="{http://www.fpml.org/2009/FpML-4-7}MarketDisruptionEvent" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="marketDisruptionEvent" type="{http://www.fpml.org/2009/FpML-4-7}MarketDisruptionEvent" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="disruptionFallbacks" type="{http://www.fpml.org/2009/FpML-4-7}DisruptionFallbacksEnum"/>
 *           &lt;element name="disruptionFallback" type="{http://www.fpml.org/2009/FpML-4-7}SequencedDirsuptionFallback" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="fallbackReferencePrice" type="{http://www.fpml.org/2009/FpML-4-7}Underlyer" minOccurs="0"/>
 *         &lt;element name="maximumNumberOfDaysOfDisruption" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="priceMaterialityPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="minimumFuturesContracts" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityMarketDisruption", propOrder = {
    "marketDisruptionEvents",
    "additionalMarketDisruptionEvent",
    "marketDisruptionEvent",
    "disruptionFallbacks",
    "disruptionFallback",
    "fallbackReferencePrice",
    "maximumNumberOfDaysOfDisruption",
    "priceMaterialityPercentage",
    "minimumFuturesContracts"
})
public class CommodityMarketDisruption {

    protected MarketDisruptionEventsEnum marketDisruptionEvents;
    protected List<MarketDisruptionEvent> additionalMarketDisruptionEvent;
    protected List<MarketDisruptionEvent> marketDisruptionEvent;
    protected DisruptionFallbacksEnum disruptionFallbacks;
    protected List<SequencedDirsuptionFallback> disruptionFallback;
    protected Underlyer fallbackReferencePrice;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfDaysOfDisruption;
    protected BigDecimal priceMaterialityPercentage;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minimumFuturesContracts;

    /**
     * Gets the value of the marketDisruptionEvents property.
     * 
     * @return
     *     possible object is
     *     {@link MarketDisruptionEventsEnum }
     *     
     */
    public MarketDisruptionEventsEnum getMarketDisruptionEvents() {
        return marketDisruptionEvents;
    }

    /**
     * Sets the value of the marketDisruptionEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketDisruptionEventsEnum }
     *     
     */
    public void setMarketDisruptionEvents(MarketDisruptionEventsEnum value) {
        this.marketDisruptionEvents = value;
    }

    /**
     * Gets the value of the additionalMarketDisruptionEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalMarketDisruptionEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalMarketDisruptionEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketDisruptionEvent }
     * 
     * 
     */
    public List<MarketDisruptionEvent> getAdditionalMarketDisruptionEvent() {
        if (additionalMarketDisruptionEvent == null) {
            additionalMarketDisruptionEvent = new ArrayList<MarketDisruptionEvent>();
        }
        return this.additionalMarketDisruptionEvent;
    }

    /**
     * Gets the value of the marketDisruptionEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketDisruptionEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketDisruptionEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketDisruptionEvent }
     * 
     * 
     */
    public List<MarketDisruptionEvent> getMarketDisruptionEvent() {
        if (marketDisruptionEvent == null) {
            marketDisruptionEvent = new ArrayList<MarketDisruptionEvent>();
        }
        return this.marketDisruptionEvent;
    }

    /**
     * Gets the value of the disruptionFallbacks property.
     * 
     * @return
     *     possible object is
     *     {@link DisruptionFallbacksEnum }
     *     
     */
    public DisruptionFallbacksEnum getDisruptionFallbacks() {
        return disruptionFallbacks;
    }

    /**
     * Sets the value of the disruptionFallbacks property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisruptionFallbacksEnum }
     *     
     */
    public void setDisruptionFallbacks(DisruptionFallbacksEnum value) {
        this.disruptionFallbacks = value;
    }

    /**
     * Gets the value of the disruptionFallback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disruptionFallback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisruptionFallback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequencedDirsuptionFallback }
     * 
     * 
     */
    public List<SequencedDirsuptionFallback> getDisruptionFallback() {
        if (disruptionFallback == null) {
            disruptionFallback = new ArrayList<SequencedDirsuptionFallback>();
        }
        return this.disruptionFallback;
    }

    /**
     * Gets the value of the fallbackReferencePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Underlyer }
     *     
     */
    public Underlyer getFallbackReferencePrice() {
        return fallbackReferencePrice;
    }

    /**
     * Sets the value of the fallbackReferencePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Underlyer }
     *     
     */
    public void setFallbackReferencePrice(Underlyer value) {
        this.fallbackReferencePrice = value;
    }

    /**
     * Gets the value of the maximumNumberOfDaysOfDisruption property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfDaysOfDisruption() {
        return maximumNumberOfDaysOfDisruption;
    }

    /**
     * Sets the value of the maximumNumberOfDaysOfDisruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfDaysOfDisruption(BigInteger value) {
        this.maximumNumberOfDaysOfDisruption = value;
    }

    /**
     * Gets the value of the priceMaterialityPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceMaterialityPercentage() {
        return priceMaterialityPercentage;
    }

    /**
     * Sets the value of the priceMaterialityPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceMaterialityPercentage(BigDecimal value) {
        this.priceMaterialityPercentage = value;
    }

    /**
     * Gets the value of the minimumFuturesContracts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumFuturesContracts() {
        return minimumFuturesContracts;
    }

    /**
     * Sets the value of the minimumFuturesContracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumFuturesContracts(BigInteger value) {
        this.minimumFuturesContracts = value;
    }

}
