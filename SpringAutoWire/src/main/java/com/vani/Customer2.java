package com.vani;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer2 {
	
	private String action;
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Autowired
	private Person person;

	public void printPerson()
	{
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
	}

}