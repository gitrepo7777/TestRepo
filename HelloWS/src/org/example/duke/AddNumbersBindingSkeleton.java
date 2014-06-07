/**
 * AddNumbersBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.duke;

public class AddNumbersBindingSkeleton implements org.example.duke.AddNumbersPortType, org.apache.axis.wsdl.Skeleton {
    private org.example.duke.AddNumbersPortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://duke.example.org", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://duke.example.org", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addNumbers", _params, new javax.xml.namespace.QName("http://duke.example.org", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://duke.example.org", "addNumbers"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addNumbers") == null) {
            _myOperations.put("addNumbers", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addNumbers")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("addNumbersFault");
        _fault.setQName(new javax.xml.namespace.QName("http://duke.example.org", "AddNumbersFault"));
        _fault.setClassName("org.example.duke.AddNumbersFault");
        _fault.setXmlType(new javax.xml.namespace.QName("http://duke.example.org", "AddNumbersFault"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://duke.example.org", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("oneWayInt", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://duke.example.org", "oneWayInt"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("oneWayInt") == null) {
            _myOperations.put("oneWayInt", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("oneWayInt")).add(_oper);
    }

    public AddNumbersBindingSkeleton() {
        this.impl = new org.example.duke.AddNumbersBindingImpl();
    }

    public AddNumbersBindingSkeleton(org.example.duke.AddNumbersPortType impl) {
        this.impl = impl;
    }
    public int addNumbers(int arg0, int arg1) throws java.rmi.RemoteException, org.example.duke.AddNumbersFault
    {
        int ret = impl.addNumbers(arg0, arg1);
        return ret;
    }

    public void oneWayInt(int arg0) throws java.rmi.RemoteException
    {
        impl.oneWayInt(arg0);
    }

}
