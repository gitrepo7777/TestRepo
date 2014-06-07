package com.vani;

import java.net.URI;

import com.sun.org.apache.xml.internal.utils.QName;

public class Client {
	public static void main(String[] args) throws Exception {
		URI uri = new URI("http://localhost:8080/JaxWs/hellovani?wsdl");
		QName qname = new QName("http://vani.com", "hello");
		
		//??
	}
	
}
