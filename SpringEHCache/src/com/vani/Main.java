package com.vani;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String args[]){
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		ContactDAOImpl c = (ContactDAOImpl)ctx.getBean("contactDAOTarget");
		boolean b = c.createContact("test", "test", "email");
		System.out.println("b = " + b);
	}

	

	/*@Test
	public void shouldCreateNewContact() {
		assertTrue(contactDAO.createContact("gabbar", "singh",
				"gabbar@singh.com"));
		assertTrue(contactDAO
				.createContact("kalia", "singh", "kalia@singh.com"));
	}

	@Test
	public void shouldReturnListOfContact() {
		assertTrue(contactDAO.findAll().size() > 0);
		assertTrue(contactDAO.findAll().size() > 0);
		assertTrue(contactDAO.findAll().size() > 0);
		// This will cause the cache to be cleared. refer to logs.
		assertTrue(contactDAO
				.createContact("samba", "singh", "samba@singh.com"));
		assertTrue(contactDAO.findAll().size() > 0);
		assertTrue(contactDAO.findAll().size() > 0);
		assertTrue(contactDAO.findAll().size() > 0);
	}*/
}