package com.vani;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
	
	public static void main(String[] args)
	{
		
		XmlBeanFactory bf = new XmlBeanFactory(new ClassPathResource("context.xml"));
		B b = (B)bf.getBean("b");
		 System.out.println(b);
		 
		 A a = (A)bf.getBean("a");
		 System.out.println(a.toString());
		 
	}
	
	public final static class Shared
	{
		private static Object sharedObject = null;
		
		public static Object getSharedObjectValue()
		{
			return sharedObject;
		}
		
		public static void setSharedObjectValue(Object o)
		{
			sharedObject = o;
		}
		 
	}

}
