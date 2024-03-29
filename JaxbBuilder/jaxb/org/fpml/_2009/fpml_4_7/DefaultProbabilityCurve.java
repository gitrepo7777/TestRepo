//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:11 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A set of default probabilities.
 * 
 * <p>Java class for DefaultProbabilityCurve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefaultProbabilityCurve">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}PricingStructureValuation">
 *       &lt;sequence>
 *         &lt;element name="baseYieldCurve" type="{http://www.fpml.org/2009/FpML-4-7}PricingStructureReference"/>
 *         &lt;element name="defaultProbabilities" type="{http://www.fpml.org/2009/FpML-4-7}TermCurve" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultProbabilityCurve", propOrder = {
    "baseYieldCurve",
    "defaultProbabilities"
})
public class DefaultProbabilityCurve
    extends PricingStructureValuation
{

    @XmlElement(required = true)
    protected PricingStructureReference baseYieldCurve;
    protected TermCurve defaultProbabilities;

    /**
     * Gets the value of the baseYieldCurve property.
     * 
     * @return
     *     possible object is
     *     {@link PricingStructureReference }
     *     
     */
    public PricingStructureReference getBaseYieldCurve() {
        return baseYieldCurve;
    }

    /**
     * Sets the value of the baseYieldCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingStructureReference }
     *     
     */
    public void setBaseYieldCurve(PricingStructureReference value) {
        this.baseYieldCurve = value;
    }

    /**
     * Gets the value of the defaultProbabilities property.
     * 
     * @return
     *     possible object is
     *     {@link TermCurve }
     *     
     */
    public TermCurve getDefaultProbabilities() {
        return defaultProbabilities;
    }

    /**
     * Sets the value of the defaultProbabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCurve }
     *     
     */
    public void setDefaultProbabilities(TermCurve value) {
        this.defaultProbabilities = value;
    }

}
