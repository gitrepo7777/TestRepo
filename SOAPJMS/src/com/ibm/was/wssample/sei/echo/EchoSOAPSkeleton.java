/**
 * EchoSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.was.wssample.sei.echo;

public class EchoSOAPSkeleton implements com.ibm.was.wssample.sei.echo.EchoServicePortType, org.apache.axis.wsdl.Skeleton {
    private com.ibm.was.wssample.sei.echo.EchoServicePortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com/ibm/was/wssample/sei/echo/", "echoStringInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://com/ibm/was/wssample/sei/echo/", ">echoStringInput"), com.ibm.was.wssample.sei.echo.EchoStringInput.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("echoOperation", _params, new javax.xml.namespace.QName("http://com/ibm/was/wssample/sei/echo/", "echoStringResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://com/ibm/was/wssample/sei/echo/", ">echoStringResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "echoOperation"));
        _oper.setSoapAction("echoOperation");
        _myOperationsList.add(_oper);
        if (_myOperations.get("echoOperation") == null) {
            _myOperations.put("echoOperation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("echoOperation")).add(_oper);
    }

    public EchoSOAPSkeleton() {
        this.impl = new com.ibm.was.wssample.sei.echo.EchoSOAPImpl();
    }

    public EchoSOAPSkeleton(com.ibm.was.wssample.sei.echo.EchoServicePortType impl) {
        this.impl = impl;
    }
    public com.ibm.was.wssample.sei.echo.EchoStringResponse echoOperation(com.ibm.was.wssample.sei.echo.EchoStringInput parameter) throws java.rmi.RemoteException
    {
        com.ibm.was.wssample.sei.echo.EchoStringResponse ret = impl.echoOperation(parameter);
        return ret;
    }

}
