package com.mkyong.ws.stubs;

import com.mkyong.ws.HelloWorld;
 
public class HelloWorldClient{
 
	public static void main(String[] args) {
 
		HelloWorldImplService helloService = new HelloWorldImplService();
		HelloWorld hello = helloService.getHelloWorldImplPort();
 
		System.out.println(hello.getHelloWorldAsString("mkyong"));
 
    }
}
 
