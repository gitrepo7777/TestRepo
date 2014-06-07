package com.vani;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = 
			new ClassPathXmlApplicationContext("annotation-config.xml");
		
		CustomerDao customerDao = (CustomerDao)applicationContext.getBean(CustomerDao.class);
		
		testGetAllCustomers(customerDao);
		/*testGetCustomer(customerDao, "2");
		testAllCustomers(customerDao);*/
	}
	
	private static void testGetAllCustomers(CustomerDao customerDao){
		
		System.out.println();
		
		long startTime = System.currentTimeMillis();
		customerDao.getAllCustomers();
		long endTime = System.currentTimeMillis();
		System.out.println("First invocation on getAllCustomers took " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		customerDao.getAllCustomers();
		endTime = System.currentTimeMillis();
		System.out.println("Second invocation on getAllCustomers took " + (endTime - startTime));		
	}

	private static void testGetCustomer(CustomerDao customerDao, String customerId){
		
		System.out.println();
		
		long startTime = System.currentTimeMillis();
		customerDao.findCustomer(customerId);
		long endTime = System.currentTimeMillis();
		System.out.println("First invocation on findCustomer took " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		customerDao.findCustomer(customerId);
		endTime = System.currentTimeMillis();
		System.out.println("Second invocation on findCustomer took " + (endTime - startTime));
	}

	private static void testAllCustomers(CustomerDao customerDao){
		
		customerDao.getCustomers("regular");
		customerDao.getCustomers("premium");
		
		customerDao.getCustomers("regular");
		customerDao.getCustomers("premium");		
	}
}
