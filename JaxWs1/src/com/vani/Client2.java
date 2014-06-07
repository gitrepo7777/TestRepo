package com.vani;

import javax.xml.ws.BindingProvider;

import com.vani.stubs.HelloBeanService;


//To run as j2se webservice endpoint
public class Client2 {
	
	public static void main(String[] args) {
		HelloBeanService hbs = new HelloBeanService();
		com.vani.stubs.HelloBean hb = hbs.getHelloBeanPort();
		//here the hb is the BindingProvider;
		
		hb.sayHello("Vani Talla");
		
		//you can use hb for getting request Context, or change port number etc.,s
		//for example :
		/*BindingProvider bp = (BindingProvider)hb;
		String address = (String)bp.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
		address.replace("8080", "4040");*/
	}
		
		
}
