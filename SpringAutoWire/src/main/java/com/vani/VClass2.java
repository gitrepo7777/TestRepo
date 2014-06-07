package com.vani;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("vbean")
public class VClass2 {

	@Autowired
	VInterface vint;

	public void setVint(VInterface vint) {
		this.vint = vint;
	}

	public void run()
	{
		String str = vint.sayHello("Test from VClass2");
		System.out.println("str = " + str);
	}
		
}
