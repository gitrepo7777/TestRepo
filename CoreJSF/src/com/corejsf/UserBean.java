package com.corejsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="user")
@SessionScoped
public class UserBean implements Serializable {
	
	private String name;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getGreeting()
	{
		if(name == null || name.length() == 0)
			return "";
		else
			return "Hello : " + name;
	}
	
	public void methodExpr()
	{
		System.out.println("methodExpr"); 
	}
	
}
