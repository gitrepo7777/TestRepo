/**
 * EchoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.was.wssample.sei.echo;

public class EchoServiceLocator extends org.apache.axis.client.Service implements com.ibm.was.wssample.sei.echo.EchoService {

    public EchoServiceLocator() {
    }


    public EchoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EchoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EchoServicePort
    private java.lang.String EchoServicePort_address = "jms:jndi:jms/myQueue";

    public java.lang.String getEchoServicePortAddress() {
        return EchoServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EchoServicePortWSDDServiceName = "EchoServicePort";

    public java.lang.String getEchoServicePortWSDDServiceName() {
        return EchoServicePortWSDDServiceName;
    }

    public void setEchoServicePortWSDDServiceName(java.lang.String name) {
        EchoServicePortWSDDServiceName = name;
    }

    public com.ibm.was.wssample.sei.echo.EchoServicePortType getEchoServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EchoServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEchoServicePort(endpoint);
    }

    public com.ibm.was.wssample.sei.echo.EchoServicePortType getEchoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ibm.was.wssample.sei.echo.EchoSOAPStub _stub = new com.ibm.was.wssample.sei.echo.EchoSOAPStub(portAddress, this);
            _stub.setPortName(getEchoServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEchoServicePortEndpointAddress(java.lang.String address) {
        EchoServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ibm.was.wssample.sei.echo.EchoServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ibm.was.wssample.sei.echo.EchoSOAPStub _stub = new com.ibm.was.wssample.sei.echo.EchoSOAPStub(new java.net.URL(EchoServicePort_address), this);
                _stub.setPortName(getEchoServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EchoServicePort".equals(inputPortName)) {
            return getEchoServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://com/ibm/was/wssample/sei/echo/", "EchoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://com/ibm/was/wssample/sei/echo/", "EchoServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EchoServicePort".equals(portName)) {
            setEchoServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
