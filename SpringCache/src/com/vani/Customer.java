package com.vani;

public class Customer {

	private String id;
	private String name;
	private String type;
	
	public Customer(String id, String name, String type){
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Customer){
			
			Customer customerObj = (Customer)obj;
			return id.equals(customerObj.id);
		}
		return false;		 
	}	
}
