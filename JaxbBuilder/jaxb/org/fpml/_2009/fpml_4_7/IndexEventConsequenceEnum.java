//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndexEventConsequenceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndexEventConsequenceEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CalculationAgentAdjustment"/>
 *     &lt;enumeration value="NegotiatedCloseOut"/>
 *     &lt;enumeration value="CancellationAndPayment"/>
 *     &lt;enumeration value="RelatedExchange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndexEventConsequenceEnum")
@XmlEnum
public enum IndexEventConsequenceEnum {


    /**
     * Calculation Agent Adjustment
     * 
     */
    @XmlEnumValue("CalculationAgentAdjustment")
    CALCULATION_AGENT_ADJUSTMENT("CalculationAgentAdjustment"),

    /**
     * Negotiated Close Out
     * 
     */
    @XmlEnumValue("NegotiatedCloseOut")
    NEGOTIATED_CLOSE_OUT("NegotiatedCloseOut"),

    /**
     * Cancellation and Payment
     * 
     */
    @XmlEnumValue("CancellationAndPayment")
    CANCELLATION_AND_PAYMENT("CancellationAndPayment"),

    /**
     * Related Exchange Adjustment
     * 
     */
    @XmlEnumValue("RelatedExchange")
    RELATED_EXCHANGE("RelatedExchange");
    private final String value;

    IndexEventConsequenceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndexEventConsequenceEnum fromValue(String v) {
        for (IndexEventConsequenceEnum c: IndexEventConsequenceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}