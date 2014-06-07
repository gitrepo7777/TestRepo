package com.vani;

public class HelloBean implements Hello {



		
		public HelloBean()
		{
			
		}
		
		public String sayHello()
		{
			System.out.format("%s, %s", "vani", "talla \n");
			return "Hello from AppConfig";
		}
}
