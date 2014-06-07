package com.eiconsulting.services;

import java.util.List;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eiconsulting.beans.Customer;
import com.googlecode.ehcache.annotations.Cacheable;
import com.googlecode.ehcache.annotations.TriggersRemove;
import com.googlecode.ehcache.annotations.When;

@Service("CustomerService")
public class CustomerService {
	@Autowired
	public CacheManager cacheManager;
	
	public boolean saveCustomer(Customer customer){
		Cache cache=cacheManager.getCache("customer");
		cache.put(new Element(customer.getId(),customer));
		return true;
	}
	
	public Customer getCachedCustomer(String customerId){
		Cache cache=cacheManager.getCache("customer");
		return (Customer)cache.get(customerId).getObjectValue();	
	}
	
	@Cacheable(cacheName="customer")
	public Customer getCustomer(String customerId){
		Customer c=new Customer();
		c.setId(customerId);
		c.setName("Adeel Shafqat");
		c.setAddress("Address");
		return c;
	}
	
	@TriggersRemove(cacheName = "customer", when = When.AFTER_METHOD_INVOCATION, removeAll = true) 
	public boolean clearCache(){
		Cache cache=cacheManager.getCache("customer");
		List l=cache.getKeys();
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		return true;
	}
	
}