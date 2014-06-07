package com.apress.prospring3.ch4.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.apress.prospring3.ch4.MessageProvider;
import com.apress.prospring3.ch4.MessageRenderer;

public class DeclareSpringComponents {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:Spring.xml");
		ctx.refresh();*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		
		/*MessageProvider messageProvider = (MessageProvider) ctx.getBean("messageProvider",		MessageProvider.class);
		System.out.println(messageProvider.getMessage());*/
		
		MessageRenderer messageRenderer = (MessageRenderer)ctx.getBean("messageRenderer", MessageRenderer.class);
				messageRenderer.render();

	}

}
