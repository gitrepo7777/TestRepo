package com.vani;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CustomerDaoImpl implements CustomerDao{

	private static Map<String, Customer> MAP;
	
	public Customer findCustomer(String customerId){	
				
		waitFor();
		return MAP.get(customerId);
	}	
		
	
	public Set<Customer> getAllCustomers() {
		
		waitFor();
		return new HashSet<Customer>(MAP.values());
	}
	
	public Set<Customer> getCustomers(String type){
		
		System.out.println("For type ->" + type);
		
		Set<Customer> customers = new HashSet<Customer>();
		Iterator<Map.Entry<String, Customer>> iterator = MAP.entrySet().iterator();
		while (iterator.hasNext()){
			
			Map.Entry<String, Customer> entry = iterator.next();
			Customer customer = entry.getValue();
			if (type.equals(customer.getType())){
				customers.add(customer);
			}
		}
		return customers;
	}
	
	private void waitFor(){		
		try{
			Thread.sleep(3 * 1000);
		}catch (Exception e){
			e.printStackTrace();
		}		
	}	
		
	static{		
		MAP = new HashMap<String, Customer>();
		
		MAP.put("1", new Customer("Mike", "Michael", "Regular"));
		MAP.put("2", new Customer("Jame", "James", "Premium"));
		MAP.put("3", new Customer("Chris", "Christopher", "Regular"));
		MAP.put("3", new Customer("Jeff", "Jeff", "Premium"));
	}
}