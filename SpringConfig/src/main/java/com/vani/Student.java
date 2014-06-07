package com.vani;

import org.springframework.beans.factory.annotation.Autowired;

import com.vani.Address;

public class Student {
	
	@Autowired
	Address  addr;

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	

}
