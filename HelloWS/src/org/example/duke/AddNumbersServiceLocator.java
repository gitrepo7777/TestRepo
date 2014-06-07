/**
 * AddNumbersServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.duke;

public class AddNumbersServiceLocator extends org.apache.axis.client.Service implements org.example.duke.AddNumbersService {

    public AddNumbersServiceLocator() {
    }


    public AddNumbersServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddNumbersServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AddNumbersPort
    private java.lang.String AddNumbersPort_address = "http://localhost:8080/HelloWS/services/AddNumbersPort";

    public java.lang.String getAddNumbersPortAddress() {
        return AddNumbersPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddNumbersPortWSDDServiceName = "AddNumbersPort";

    public java.lang.String getAddNumbersPortWSDDServiceName() {
        return AddNumbersPortWSDDServiceName;
    }

    public void setAddNumbersPortWSDDServiceName(java.lang.String name) {
        AddNumbersPortWSDDServiceName = name;
    }

    public org.example.duke.AddNumbersPortType getAddNumbersPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddNumbersPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddNumbersPort(endpoint);
    }

    public org.example.duke.AddNumbersPortType getAddNumbersPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.example.duke.AddNumbersBindingStub _stub = new org.example.duke.AddNumbersBindingStub(portAddress, this);
            _stub.setPortName(getAddNumbersPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddNumbersPortEndpointAddress(java.lang.String address) {
        AddNumbersPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.example.duke.AddNumbersPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.example.duke.AddNumbersBindingStub _stub = new org.example.duke.AddNumbersBindingStub(new java.net.URL(AddNumbersPort_address), this);
                _stub.setPortName(getAddNumbersPortWSDDServiceName());
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
        if ("AddNumbersPort".equals(inputPortName)) {
            return getAddNumbersPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://duke.example.org", "AddNumbersService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://duke.example.org", "AddNumbersPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AddNumbersPort".equals(portName)) {
            setAddNumbersPortEndpointAddress(address);
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
