package com.vani;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VClass implements VInterface {

	
	
	public String sayHello(String str) {
		
		return "VANI " + str;
	}

}
