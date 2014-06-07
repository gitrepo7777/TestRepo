package com.vani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String[] args)
	{
		ApplicationContext  ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld hw = (HelloWorld)ctx.getBean("helloBean");
		System.out.println(hw.sayHello());
		
	}

}
