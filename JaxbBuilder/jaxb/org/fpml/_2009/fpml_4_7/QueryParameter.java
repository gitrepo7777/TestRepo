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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type representing criteria for defining a query portfolio. The criteria are made up of a QueryParameterId, QueryParameterValue and QueryParameterOperator.
 * 
 * <p>Java class for QueryParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryParameterId" type="{http://www.fpml.org/2009/FpML-4-7}QueryParameterId"/>
 *         &lt;element name="queryParameterValue" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="queryParameterOperator" type="{http://www.fpml.org/2009/FpML-4-7}QueryParameterOperator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryParameter", propOrder = {
    "queryParameterId",
    "queryParameterValue",
    "queryParameterOperator"
})
public class QueryParameter {

    @XmlElement(required = true)
    protected QueryParameterId queryParameterId;
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String queryParameterValue;
    protected QueryParameterOperator queryParameterOperator;

    /**
     * Gets the value of the queryParameterId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryParameterId }
     *     
     */
    public QueryParameterId getQueryParameterId() {
        return queryParameterId;
    }

    /**
     * Sets the value of the queryParameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryParameterId }
     *     
     */
    public void setQueryParameterId(QueryParameterId value) {
        this.queryParameterId = value;
    }

    /**
     * Gets the value of the queryParameterValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryParameterValue() {
        return queryParameterValue;
    }

    /**
     * Sets the value of the queryParameterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryParameterValue(String value) {
        this.queryParameterValue = value;
    }

    /**
     * Gets the value of the queryParameterOperator property.
     * 
     * @return
     *     possible object is
     *     {@link QueryParameterOperator }
     *     
     */
    public QueryParameterOperator getQueryParameterOperator() {
        return queryParameterOperator;
    }

    /**
     * Sets the value of the queryParameterOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryParameterOperator }
     *     
     */
    public void setQueryParameterOperator(QueryParameterOperator value) {
        this.queryParameterOperator = value;
    }

}
