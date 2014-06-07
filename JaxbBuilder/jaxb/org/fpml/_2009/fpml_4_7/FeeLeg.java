//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:11 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FeeLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}Leg">
 *       &lt;sequence>
 *         &lt;element name="initialPayment" type="{http://www.fpml.org/2009/FpML-4-7}InitialPayment" minOccurs="0"/>
 *         &lt;element name="singlePayment" type="{http://www.fpml.org/2009/FpML-4-7}SinglePayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="periodicPayment" type="{http://www.fpml.org/2009/FpML-4-7}PeriodicPayment" minOccurs="0"/>
 *         &lt;element name="marketFixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="paymentDelay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="initialPoints" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quotationStyle" type="{http://www.fpml.org/2009/FpML-4-7}QuotationStyleEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeLeg", propOrder = {
    "initialPayment",
    "singlePayment",
    "periodicPayment",
    "marketFixedRate",
    "paymentDelay",
    "initialPoints",
    "quotationStyle"
})
public class FeeLeg
    extends Leg
{

    protected InitialPayment initialPayment;
    protected List<SinglePayment> singlePayment;
    protected PeriodicPayment periodicPayment;
    protected BigDecimal marketFixedRate;
    protected Boolean paymentDelay;
    protected BigDecimal initialPoints;
    protected QuotationStyleEnum quotationStyle;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the initialPayment property.
     * 
     * @return
     *     possible object is
     *     {@link InitialPayment }
     *     
     */
    public InitialPayment getInitialPayment() {
        return initialPayment;
    }

    /**
     * Sets the value of the initialPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialPayment }
     *     
     */
    public void setInitialPayment(InitialPayment value) {
        this.initialPayment = value;
    }

    /**
     * Gets the value of the singlePayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the singlePayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSinglePayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SinglePayment }
     * 
     * 
     */
    public List<SinglePayment> getSinglePayment() {
        if (singlePayment == null) {
            singlePayment = new ArrayList<SinglePayment>();
        }
        return this.singlePayment;
    }

    /**
     * Gets the value of the periodicPayment property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodicPayment }
     *     
     */
    public PeriodicPayment getPeriodicPayment() {
        return periodicPayment;
    }

    /**
     * Sets the value of the periodicPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodicPayment }
     *     
     */
    public void setPeriodicPayment(PeriodicPayment value) {
        this.periodicPayment = value;
    }

    /**
     * Gets the value of the marketFixedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarketFixedRate() {
        return marketFixedRate;
    }

    /**
     * Sets the value of the marketFixedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarketFixedRate(BigDecimal value) {
        this.marketFixedRate = value;
    }

    /**
     * Gets the value of the paymentDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentDelay() {
        return paymentDelay;
    }

    /**
     * Sets the value of the paymentDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentDelay(Boolean value) {
        this.paymentDelay = value;
    }

    /**
     * Gets the value of the initialPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialPoints() {
        return initialPoints;
    }

    /**
     * Sets the value of the initialPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialPoints(BigDecimal value) {
        this.initialPoints = value;
    }

    /**
     * Gets the value of the quotationStyle property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationStyleEnum }
     *     
     */
    public QuotationStyleEnum getQuotationStyle() {
        return quotationStyle;
    }

    /**
     * Sets the value of the quotationStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationStyleEnum }
     *     
     */
    public void setQuotationStyle(QuotationStyleEnum value) {
        this.quotationStyle = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}