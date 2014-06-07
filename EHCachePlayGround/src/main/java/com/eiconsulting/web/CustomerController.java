package com.eiconsulting.web;

import net.sf.ehcache.CacheManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.eiconsulting.beans.Customer;
import com.eiconsulting.services.CustomerService;

@Controller
public class CustomerController {
	@Autowired @Qualifier("CustomerService")
	public CustomerService customerService;

	
	
	@RequestMapping(value="/GetCustomer/{customerId}",method={RequestMethod.GET})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody String getCustomer(@PathVariable String customerId){
		Customer c=customerService.getCustomer(customerId);
		return c.toString();
	}
	
	
	@RequestMapping(value="/GetCachedCustomer/{customerId}",method={RequestMethod.GET})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody String getCachedCustomer(@PathVariable String customerId){
		Customer c=customerService.getCachedCustomer(customerId);
		return c.toString();
	}
	
	@RequestMapping(value="/ClearCache",method={RequestMethod.GET})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody String clearCache(){
		boolean result=customerService.clearCache();
		if(result) return "Sucessfully Cache Cleaned";
		else return "Not able to Clean Cache";
			
	}
	
	@RequestMapping(value="/SaveCustomer/{customerId}",method={RequestMethod.GET})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody String saveCustomer(@PathVariable String customerId){
		
		Customer c=new Customer();
		c.setId(customerId);
		c.setAddress("New Address");
		c.setName("New Name");
		boolean result=customerService.saveCustomer(c);
		if(result) return "Sucessfully Saved Customer";
		else return "Not able to Save Customer";
			
	}
	
}
