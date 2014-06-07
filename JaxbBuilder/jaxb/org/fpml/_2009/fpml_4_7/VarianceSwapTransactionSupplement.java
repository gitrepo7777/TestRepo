//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:52:39 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A Variance Swap Transaction Supplement.
 * 
 * <p>Java class for VarianceSwapTransactionSupplement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VarianceSwapTransactionSupplement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}Product">
 *       &lt;sequence>
 *         &lt;element name="varianceLeg" type="{http://www.fpml.org/2009/FpML-4-7}VarianceLeg" maxOccurs="unbounded"/>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}EquityUnderlyerProvisions.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VarianceSwapTransactionSupplement", propOrder = {
    "varianceLeg",
    "multipleExchangeIndexAnnexFallback",
    "multipleExchangeAnnex",
    "localJurisdiction",
    "relevantJurisdiction"
})
public class VarianceSwapTransactionSupplement
    extends Product
{

    @XmlElement(required = true)
    protected List<VarianceLeg> varianceLeg;
    protected Boolean multipleExchangeIndexAnnexFallback;
    protected MultipleExchangeAnnex multipleExchangeAnnex;
    protected Country localJurisdiction;
    protected Country relevantJurisdiction;

    /**
     * Gets the value of the varianceLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the varianceLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVarianceLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VarianceLeg }
     * 
     * 
     */
    public List<VarianceLeg> getVarianceLeg() {
        if (varianceLeg == null) {
            varianceLeg = new ArrayList<VarianceLeg>();
        }
        return this.varianceLeg;
    }

    /**
     * Gets the value of the multipleExchangeIndexAnnexFallback property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleExchangeIndexAnnexFallback() {
        return multipleExchangeIndexAnnexFallback;
    }

    /**
     * Sets the value of the multipleExchangeIndexAnnexFallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleExchangeIndexAnnexFallback(Boolean value) {
        this.multipleExchangeIndexAnnexFallback = value;
    }

    /**
     * Gets the value of the multipleExchangeAnnex property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleExchangeAnnex }
     *     
     */
    public MultipleExchangeAnnex getMultipleExchangeAnnex() {
        return multipleExchangeAnnex;
    }

    /**
     * Sets the value of the multipleExchangeAnnex property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleExchangeAnnex }
     *     
     */
    public void setMultipleExchangeAnnex(MultipleExchangeAnnex value) {
        this.multipleExchangeAnnex = value;
    }

    /**
     * Gets the value of the localJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getLocalJurisdiction() {
        return localJurisdiction;
    }

    /**
     * Sets the value of the localJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setLocalJurisdiction(Country value) {
        this.localJurisdiction = value;
    }

    /**
     * Gets the value of the relevantJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getRelevantJurisdiction() {
        return relevantJurisdiction;
    }

    /**
     * Sets the value of the relevantJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setRelevantJurisdiction(Country value) {
        this.relevantJurisdiction = value;
    }

}