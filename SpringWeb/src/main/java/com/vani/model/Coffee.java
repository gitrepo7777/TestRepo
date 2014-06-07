package com.vani.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "coffee")
public class Coffee {
	String name ;
	int quantity;
	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	
	@XmlElement
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Coffee()
	{
		
	}
	
	public Coffee(String c, int i)
	{
		this.name = c;
		this.quantity = i;
	}
	
}
