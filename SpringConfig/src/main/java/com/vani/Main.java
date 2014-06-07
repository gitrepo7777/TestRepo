package com.vani;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	
	
	public static void main(String[] args){
	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		HelloBean1 hb = (HelloBean1)ctx.getBean("hello1");

		String str = hb.getName();
		System.out.println("str = " + str);
	}
		
	
}
