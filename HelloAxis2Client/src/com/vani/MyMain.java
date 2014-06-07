package com.vani;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

public class MyMain {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException {
		SayHello sh = new SayHello();
		sh.setStr("Hello Test");
		
		HelloWorldServiceStub myStub = new HelloWorldServiceStub();
		SayHelloResponse shr = (SayHelloResponse)myStub.sayHello(sh);
		System.out.println("resnonse : "+shr.get_return());
	}

}
