/**
 * EchoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.was.wssample.sei.echo;

public interface EchoService extends javax.xml.rpc.Service {
    public java.lang.String getEchoServicePortAddress();

    public com.ibm.was.wssample.sei.echo.EchoServicePortType getEchoServicePort() throws javax.xml.rpc.ServiceException;

    public com.ibm.was.wssample.sei.echo.EchoServicePortType getEchoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
