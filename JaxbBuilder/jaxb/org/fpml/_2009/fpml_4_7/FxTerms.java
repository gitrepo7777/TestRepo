//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:11 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A structure which specifies FX conversion terms.
 * 
 * <p>Java class for FxTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTerms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fxRate" type="{http://www.fpml.org/2009/FpML-4-7}FxRate"/>
 *         &lt;element name="fixingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxTerms", propOrder = {
    "fxRate",
    "fixingDate"
})
public class FxTerms {

    @XmlElement(required = true)
    protected FxRate fxRate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fixingDate;

    /**
     * Gets the value of the fxRate property.
     * 
     * @return
     *     possible object is
     *     {@link FxRate }
     *     
     */
    public FxRate getFxRate() {
        return fxRate;
    }

    /**
     * Sets the value of the fxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxRate }
     *     
     */
    public void setFxRate(FxRate value) {
        this.fxRate = value;
    }

    /**
     * Gets the value of the fixingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFixingDate() {
        return fixingDate;
    }

    /**
     * Sets the value of the fixingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFixingDate(XMLGregorianCalendar value) {
        this.fixingDate = value;
    }

}