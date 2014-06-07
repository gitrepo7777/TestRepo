//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the source for a piece of information (e.g. a rate refix or an fx fixing).
 * 
 * <p>Java class for InformationSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformationSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rateSource" type="{http://www.fpml.org/2009/FpML-4-7}InformationProvider"/>
 *         &lt;element name="rateSourcePage" type="{http://www.fpml.org/2009/FpML-4-7}RateSourcePage" minOccurs="0"/>
 *         &lt;element name="rateSourcePageHeading" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationSource", propOrder = {
    "rateSource",
    "rateSourcePage",
    "rateSourcePageHeading"
})
public class InformationSource {

    @XmlElement(required = true)
    protected InformationProvider rateSource;
    protected RateSourcePage rateSourcePage;
    protected String rateSourcePageHeading;

    /**
     * Gets the value of the rateSource property.
     * 
     * @return
     *     possible object is
     *     {@link InformationProvider }
     *     
     */
    public InformationProvider getRateSource() {
        return rateSource;
    }

    /**
     * Sets the value of the rateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationProvider }
     *     
     */
    public void setRateSource(InformationProvider value) {
        this.rateSource = value;
    }

    /**
     * Gets the value of the rateSourcePage property.
     * 
     * @return
     *     possible object is
     *     {@link RateSourcePage }
     *     
     */
    public RateSourcePage getRateSourcePage() {
        return rateSourcePage;
    }

    /**
     * Sets the value of the rateSourcePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSourcePage }
     *     
     */
    public void setRateSourcePage(RateSourcePage value) {
        this.rateSourcePage = value;
    }

    /**
     * Gets the value of the rateSourcePageHeading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateSourcePageHeading() {
        return rateSourcePageHeading;
    }

    /**
     * Sets the value of the rateSourcePageHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateSourcePageHeading(String value) {
        this.rateSourcePageHeading = value;
    }

}
