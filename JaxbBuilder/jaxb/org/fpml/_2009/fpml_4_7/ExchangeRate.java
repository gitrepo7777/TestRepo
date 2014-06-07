//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:20 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that is used for describing the exchange rate for a particular transaction.
 * 
 * <p>Java class for ExchangeRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}FxRate">
 *       &lt;sequence>
 *         &lt;element name="spotRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="forwardPoints" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sideRates" type="{http://www.fpml.org/2009/FpML-4-7}SideRates" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRate", propOrder = {
    "spotRate",
    "forwardPoints",
    "sideRates"
})
public class ExchangeRate
    extends FxRate
{

    protected BigDecimal spotRate;
    protected BigDecimal forwardPoints;
    protected SideRates sideRates;

    /**
     * Gets the value of the spotRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpotRate() {
        return spotRate;
    }

    /**
     * Sets the value of the spotRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpotRate(BigDecimal value) {
        this.spotRate = value;
    }

    /**
     * Gets the value of the forwardPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getForwardPoints() {
        return forwardPoints;
    }

    /**
     * Sets the value of the forwardPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setForwardPoints(BigDecimal value) {
        this.forwardPoints = value;
    }

    /**
     * Gets the value of the sideRates property.
     * 
     * @return
     *     possible object is
     *     {@link SideRates }
     *     
     */
    public SideRates getSideRates() {
        return sideRates;
    }

    /**
     * Sets the value of the sideRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link SideRates }
     *     
     */
    public void setSideRates(SideRates value) {
        this.sideRates = value;
    }

}
