package com.mkyong.ws;
 
import javax.jws.WebService;

import com.mkyong.ws.stubs.HelloWorld;
 
//Service Implementation
@WebService(endpointInterface = "com.mkyong.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}
 
}