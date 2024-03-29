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
 * <p>Java class for DividendPeriodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DividendPeriodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FirstPeriod"/>
 *     &lt;enumeration value="SecondPeriod"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DividendPeriodEnum")
@XmlEnum
public enum DividendPeriodEnum {


    /**
     * "First Period" per the 2002 ISDA Equity Derivatives Definitions will apply.
     * 
     */
    @XmlEnumValue("FirstPeriod")
    FIRST_PERIOD("FirstPeriod"),

    /**
     * "Second Period" per the 2002 ISDA Equity Derivatives Definitions will apply.
     * 
     */
    @XmlEnumValue("SecondPeriod")
    SECOND_PERIOD("SecondPeriod");
    private final String value;

    DividendPeriodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DividendPeriodEnum fromValue(String v) {
        for (DividendPeriodEnum c: DividendPeriodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
