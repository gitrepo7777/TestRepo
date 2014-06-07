package com.vani;

import java.lang.reflect.Method;

public class AnnParser {
	
	public void parse(Class clazz) throws Exception { 
		Method[] methods = clazz.getMethods();
	


	    for (Method method : methods) {
	        if (method.isAnnotationPresent(Ann.class)) {
	        	Ann test = method.getAnnotation(Ann.class);
	            String info = test.value();
	
	            if ("AWESOME".equals(info)) {
	                 System.out.println("info is awesome!");
	                 // try to invoke the method with param
	                 method.invoke(
	                    AnnClass.class.newInstance(), info);
	            }
	        }
	    }
	}
}
