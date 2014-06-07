package com.vani;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable {

	@Override
	public void run() {
		String dtStr = ThreadFormatter1.getDateFormatter().format(new Date());
		System.out.println("dtStr = " + dtStr);
	}

}


class ThreadFormatter1 {
	
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
