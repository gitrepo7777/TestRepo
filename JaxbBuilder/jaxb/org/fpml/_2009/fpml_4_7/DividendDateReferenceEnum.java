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
 * <p>Java class for DividendDateReferenceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DividendDateReferenceEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ExDate"/>
 *     &lt;enumeration value="DividendPaymentDate"/>
 *     &lt;enumeration value="RecordDate"/>
 *     &lt;enumeration value="TerminationDate"/>
 *     &lt;enumeration value="EquityPaymentDate"/>
 *     &lt;enumeration value="FollowingPaymentDate"/>
 *     &lt;enumeration value="AdHocDate"/>
 *     &lt;enumeration value="CumulativeEquityPaid"/>
 *     &lt;enumeration value="CumulativeLiborPaid"/>
 *     &lt;enumeration value="CumulativeEquityExDiv"/>
 *     &lt;enumeration value="CumulativeLiborExDiv"/>
 *     &lt;enumeration value="SharePayment"/>
 *     &lt;enumeration value="CashSettlementPaymentDate"/>
 *     &lt;enumeration value="FloatingAmountPaymentDate"/>
 *     &lt;enumeration value="CashSettlePaymentDateExDiv"/>
 *     &lt;enumeration value="CashSettlePaymentDateIssuerPayment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DividendDateReferenceEnum")
@XmlEnum
public enum DividendDateReferenceEnum {


    /**
     * Date on which a holder of the security is entitled to the dividend.
     * 
     */
    @XmlEnumValue("ExDate")
    EX_DATE("ExDate"),

    /**
     * Date on which the dividend will be paid by the issuer.
     * 
     */
    @XmlEnumValue("DividendPaymentDate")
    DIVIDEND_PAYMENT_DATE("DividendPaymentDate"),

    /**
     * Date on which the dividend will be recorded in the books of the paying agent.
     * 
     */
    @XmlEnumValue("RecordDate")
    RECORD_DATE("RecordDate"),

    /**
     * Termination date of the swap.
     * 
     */
    @XmlEnumValue("TerminationDate")
    TERMINATION_DATE("TerminationDate"),

    /**
     * Equity payment date of the swap.
     * 
     */
    @XmlEnumValue("EquityPaymentDate")
    EQUITY_PAYMENT_DATE("EquityPaymentDate"),

    /**
     * The next payment date of the swap.
     * 
     */
    @XmlEnumValue("FollowingPaymentDate")
    FOLLOWING_PAYMENT_DATE("FollowingPaymentDate"),

    /**
     * The dividend date will be specified ad hoc by the parties, typically on the dividend ex-date
     * 
     */
    @XmlEnumValue("AdHocDate")
    AD_HOC_DATE("AdHocDate"),

    /**
     * Total of paid dividends, paid on next following Cash Settlement Payment Date, which is immediately following the Dividend Period during which the dividend is paid by the Issuer to the holders of record of a Share.
     * 
     */
    @XmlEnumValue("CumulativeEquityPaid")
    CUMULATIVE_EQUITY_PAID("CumulativeEquityPaid"),

    /**
     * Total of paid dividends, paid on next following Payment Date, which is immediately following the Dividend Period during which the dividend is paid by the Issuer to the holders of record of a Share.
     * 
     */
    @XmlEnumValue("CumulativeLiborPaid")
    CUMULATIVE_LIBOR_PAID("CumulativeLiborPaid"),

    /**
     * Total of dividends which go ex, paid on next following Cash Settlement Payment Date, which is immediately following the Dividend Period during which the Shares commence trading ex-dividend on the Exchange
     * 
     */
    @XmlEnumValue("CumulativeEquityExDiv")
    CUMULATIVE_EQUITY_EX_DIV("CumulativeEquityExDiv"),

    /**
     * Total of dividends which go ex, paid on next following Payment Date, which is immediately following the Dividend Period during which the Shares commence trading ex-dividend on the Exchange, or where the date on which the Shares commence trading ex-dividend is a Payment Date, such Payment Date.
     * 
     */
    @XmlEnumValue("CumulativeLiborExDiv")
    CUMULATIVE_LIBOR_EX_DIV("CumulativeLiborExDiv"),

    /**
     * If "Dividend Payment Date(s)" is specified in the Transaction Supplement as "Share Payment", then the Dividend Payment Date in respect of a Dividend Amount shall fall on a date on or before the date that is two (or any other number that is specified in the Transaction Supplement) Currency Business Days following the day on which the Issuer of the Shares pays the relevant dividend to holders of record of the Shares
     * 
     */
    @XmlEnumValue("SharePayment")
    SHARE_PAYMENT("SharePayment"),

    /**
     * If "Dividend Payment Date(s)" is specified in the Transaction Supplement as "Cash Settlement Payment Date", then the Dividend Payment Date in respect of a Dividend Amount shall be the Cash Settlement Payment Date relating to the end of the Dividend Period during which the Shares commenced trading "ex" the relevant dividend on the Exchange
     * 
     */
    @XmlEnumValue("CashSettlementPaymentDate")
    CASH_SETTLEMENT_PAYMENT_DATE("CashSettlementPaymentDate"),

    /**
     * If "Dividend Payment Date(s)" is specified in the Transaction Supplement as "Floating Amount Payment Date", then the Dividend Payment Date in respect of a Dividend Amount shall be the first Payment Date falling at least one Settlement Cycle after the date that the Shares have commenced trading "ex" the relevant dividend on the Exchange.
     * 
     */
    @XmlEnumValue("FloatingAmountPaymentDate")
    FLOATING_AMOUNT_PAYMENT_DATE("FloatingAmountPaymentDate"),

    /**
     * If "Dividend Payment Date(s)" is specified in the Transaction Supplement as "Cash Settlement Payment Date � Ex Dividend", then the Dividend Payment Date in respect of a Dividend Amount shall be the Cash Settlement Payment Date relating to the end of the Dividend Period during which the Shares commenced trading �ex� the relevant dividend on the Exchange.
     * 
     */
    @XmlEnumValue("CashSettlePaymentDateExDiv")
    CASH_SETTLE_PAYMENT_DATE_EX_DIV("CashSettlePaymentDateExDiv"),

    /**
     * If "Dividend Payment Date(s)" is specified in the Transaction Supplement as "Cash Settlement Payment Date � Issuer Payment", then the Dividend Payment Date in respect of a Dividend Amount shall be the Cash Settlement Payment Date relating to the end of the Dividend Period during which the issuer pays the relevant dividend to a holder of record provided that in the case where the Equity Amount Payer is the party specified to be the sole Hedging Party and the Hedging Party has not received the Dividend Amount by such date, then the date falling a number of Currency Business Days as specified in the Cash Settlement Payment Date after actual receipt by the Hedging Party of the Received Ex Amount or Paid Ex Amount (as applicable).
     * 
     */
    @XmlEnumValue("CashSettlePaymentDateIssuerPayment")
    CASH_SETTLE_PAYMENT_DATE_ISSUER_PAYMENT("CashSettlePaymentDateIssuerPayment");
    private final String value;

    DividendDateReferenceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DividendDateReferenceEnum fromValue(String v) {
        for (DividendDateReferenceEnum c: DividendDateReferenceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}