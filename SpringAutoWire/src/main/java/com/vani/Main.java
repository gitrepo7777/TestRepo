package com.vani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Module.xml");
		Customer customer = (Customer)ctx.getBean("customer");
		
		String action = customer.getAction();
		
		System.out.println("action =  " + action);
		
		String fName = customer.getPerson().getFirstName();
		String lName = customer.getPerson().getLastName();
		
		System.out.println("fName = " + fName + " lName = " + lName);
		
		//customer2
		
		
		Customer2 customer2 = (Customer2)ctx.getBean("customer2");
		customer2.printPerson();
	}

}
