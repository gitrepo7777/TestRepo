package com.vani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class VMain {

		public static void main(String[] args)
		{
			System.out.println("test vmain");
			
			
			//ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Module-Annotaion.xml");
			
			GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
			ctx.load("classpath:Spring-Module-Annotaion.xml");
			ctx.refresh();
			
			VClass2 vc = (VClass2)ctx.getBean("vbean");
			 vc.run();
			
			
		}
}
