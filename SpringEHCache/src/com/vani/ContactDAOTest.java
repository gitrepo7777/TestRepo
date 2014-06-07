package com.vani;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "/context.xml")
public class ContactDAOTest {

	@Autowired
	ContactDAO contactDAO;

	@Test
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
	}
}