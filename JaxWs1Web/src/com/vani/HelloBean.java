package com.vani;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;



@WebService(endpointInterface="com.vani.HelloIntf")
//@SOAPBinding(style=SOAPBinding.Style.RPC)

public class HelloBean implements HelloIntf{

	@WebMethod
	public String sayHello(@WebParam String name )
	{
		System.out.println("Hello " + name);
		return "Hello "+name;
	}
}
