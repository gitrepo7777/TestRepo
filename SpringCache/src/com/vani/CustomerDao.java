package com.vani;

import java.util.Set;

import org.springframework.cache.annotation.Cacheable;

public interface CustomerDao {
	
	@Cacheable(value = {"customer"})
	Customer findCustomer(String customerId);

	@Cacheable("allCustomers")
	Set<Customer> getAllCustomers();

	@Cacheable(value = {"customers"}, condition = "#type == 'regular'")
	Set<Customer> getCustomers(String type);
}
