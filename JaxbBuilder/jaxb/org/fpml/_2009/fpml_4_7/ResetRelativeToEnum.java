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
 * <p>Java class for ResetRelativeToEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResetRelativeToEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CalculationPeriodStartDate"/>
 *     &lt;enumeration value="CalculationPeriodEndDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResetRelativeToEnum")
@XmlEnum
public enum ResetRelativeToEnum {


    /**
     * Resets will occur relative to the first day of each calculation period.
     * 
     */
    @XmlEnumValue("CalculationPeriodStartDate")
    CALCULATION_PERIOD_START_DATE("CalculationPeriodStartDate"),

    /**
     * Resets will occur relative to the last day of each calculation period.
     * 
     */
    @XmlEnumValue("CalculationPeriodEndDate")
    CALCULATION_PERIOD_END_DATE("CalculationPeriodEndDate");
    private final String value;

    ResetRelativeToEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResetRelativeToEnum fromValue(String v) {
        for (ResetRelativeToEnum c: ResetRelativeToEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
