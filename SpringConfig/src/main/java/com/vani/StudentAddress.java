package com.vani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vani.Student;

public class StudentAddress {
	
	public static void main(String args[])
	{
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("context.xml");
		Student student = (Student)ctx.getBean("student");
		String str = student.getAddr().getCity();
		
		System.out.println("str = " + str);
		
	}
	
}
