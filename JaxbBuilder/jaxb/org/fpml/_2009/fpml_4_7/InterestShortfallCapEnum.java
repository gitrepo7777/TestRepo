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
 * <p>Java class for InterestShortfallCapEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterestShortfallCapEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Fixed"/>
 *     &lt;enumeration value="Variable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterestShortfallCapEnum")
@XmlEnum
public enum InterestShortfallCapEnum {

    @XmlEnumValue("Fixed")
    FIXED("Fixed"),
    @XmlEnumValue("Variable")
    VARIABLE("Variable");
    private final String value;

    InterestShortfallCapEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterestShortfallCapEnum fromValue(String v) {
        for (InterestShortfallCapEnum c: InterestShortfallCapEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
