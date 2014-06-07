/**
 * AddNumbersPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.duke;

public interface AddNumbersPortType extends java.rmi.Remote {
    public int addNumbers(int arg0, int arg1) throws java.rmi.RemoteException, org.example.duke.AddNumbersFault;
    public void oneWayInt(int arg0) throws java.rmi.RemoteException;
}
