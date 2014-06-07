package com.vani;

import java.text.DateFormat;
import java.text.SimpleDateFormat;



public class ThreadFormatter {
	
	private static final ThreadLocal<SimpleDateFormat> df = 
			new ThreadLocal<SimpleDateFormat>(){
		
		protected SimpleDateFormat initialValue()
		{
			System.out.println("I am in initialValue");
			return new SimpleDateFormat("dd/MM/yyyy");
			
		}
		
	};

	
	
	
	
	public static DateFormat getDateFormatter()
	{
		System.out.println(" I am in getDateFormatter");
		return df.get();
	}
	
	
}
