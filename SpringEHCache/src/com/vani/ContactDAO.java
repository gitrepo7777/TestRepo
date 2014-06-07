package com.vani;

import java.util.List;

public interface ContactDAO {
	boolean createContact(String firstName, String lastName, String email);

	List findAll();
}