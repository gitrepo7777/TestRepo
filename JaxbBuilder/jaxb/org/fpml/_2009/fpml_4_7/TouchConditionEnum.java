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
 * <p>Java class for TouchConditionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TouchConditionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Touch"/>
 *     &lt;enumeration value="Notouch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TouchConditionEnum")
@XmlEnum
public enum TouchConditionEnum {


    /**
     * The spot rate must have touched the predetermined trigger rate at any time over the life of the option for the payout to occur.
     * 
     */
    @XmlEnumValue("Touch")
    TOUCH("Touch"),

    /**
     * The spot rate has not touched the predetermined trigger rate at any time over the life of the option for the payout to occur.
     * 
     */
    @XmlEnumValue("Notouch")
    NOTOUCH("Notouch");
    private final String value;

    TouchConditionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TouchConditionEnum fromValue(String v) {
        for (TouchConditionEnum c: TouchConditionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
