package com.vani;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

		public static void main(String[] args)
		{
			Class[] clazz = {AppConfig.class};
			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
			ctx.register(clazz);
			ctx.refresh();
			HelloBean hb = (HelloBean)ctx.getBean("hello");
			String str = hb.sayHello();
			System.out.println("str = " + str);
			
			
			
			/*String[] hbnames = ctx.getBeanNamesForType(Hello.class);
			for (String name : hbnames){
				System.out.println( name);
			}*/
		}
}
