package com.vani;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;



@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)

public class HelloBean {

	@WebMethod
	public String sayHello(@WebParam String name )
	{
		System.out.println("Hello " + name);
		return "Hello "+name;
	}
}
