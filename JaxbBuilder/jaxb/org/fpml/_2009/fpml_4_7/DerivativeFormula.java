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
 * A formula for computing a complex derivative from partial derivatives. Its value is the sum of the terms divided by the product of the denominator terms.
 * 
 * <p>Java class for DerivativeFormula complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DerivativeFormula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="term" type="{http://www.fpml.org/2009/FpML-4-7}FormulaTerm"/>
 *         &lt;element name="denominatorTerm" type="{http://www.fpml.org/2009/FpML-4-7}DenominatorTerm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeFormula", propOrder = {
    "term",
    "denominatorTerm"
})
public class DerivativeFormula {

    @XmlElement(required = true)
    protected FormulaTerm term;
    @XmlElement(required = true)
    protected DenominatorTerm denominatorTerm;

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link FormulaTerm }
     *     
     */
    public FormulaTerm getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormulaTerm }
     *     
     */
    public void setTerm(FormulaTerm value) {
        this.term = value;
    }

    /**
     * Gets the value of the denominatorTerm property.
     * 
     * @return
     *     possible object is
     *     {@link DenominatorTerm }
     *     
     */
    public DenominatorTerm getDenominatorTerm() {
        return denominatorTerm;
    }

    /**
     * Sets the value of the denominatorTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DenominatorTerm }
     *     
     */
    public void setDenominatorTerm(DenominatorTerm value) {
        this.denominatorTerm = value;
    }

}
