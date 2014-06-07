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
 * A curve used to model a set of forward interest rates. Used for forecasting interest rates as part of a pricing calculation.
 * 
 * <p>Java class for ForwardRateCurve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForwardRateCurve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assetReference" type="{http://www.fpml.org/2009/FpML-4-7}AssetReference" minOccurs="0"/>
 *         &lt;element name="rateCurve" type="{http://www.fpml.org/2009/FpML-4-7}TermCurve"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForwardRateCurve", propOrder = {
    "assetReference",
    "rateCurve"
})
public class ForwardRateCurve {

    protected AssetReference assetReference;
    @XmlElement(required = true)
    protected TermCurve rateCurve;

    /**
     * Gets the value of the assetReference property.
     * 
     * @return
     *     possible object is
     *     {@link AssetReference }
     *     
     */
    public AssetReference getAssetReference() {
        return assetReference;
    }

    /**
     * Sets the value of the assetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetReference }
     *     
     */
    public void setAssetReference(AssetReference value) {
        this.assetReference = value;
    }

    /**
     * Gets the value of the rateCurve property.
     * 
     * @return
     *     possible object is
     *     {@link TermCurve }
     *     
     */
    public TermCurve getRateCurve() {
        return rateCurve;
    }

    /**
     * Sets the value of the rateCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCurve }
     *     
     */
    public void setRateCurve(TermCurve value) {
        this.rateCurve = value;
    }

}
