package com.vani;

import javax.xml.ws.Endpoint;

public class PublishBean {
	
	public static void main(String[] args) {
		HelloBean hb = new HelloBean();

		 Endpoint ep = 
				 Endpoint.publish("http://localhost:8080/JaxWs/hellovani", 
						 hb);

	}
	
		
}
