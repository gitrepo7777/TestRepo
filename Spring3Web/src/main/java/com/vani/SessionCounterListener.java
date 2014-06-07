package com.vani;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SessionCounterListener  implements HttpSessionListener{

	
	private static int totalActiveSessions;
	
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("SessionCounterListener : sessionCreated ");
		totalActiveSessions++;
		printCounter(arg0);
		
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		
		System.out.println("SessionCounterListener : sessionDestroyed "  );
		totalActiveSessions--;
		printCounter(arg0);
		
	}
	
	private void printCounter(HttpSessionEvent event)
	{
		
		System.out.println("SessionCounterListener : printCounter ");
		ApplicationContext ctx =
		WebApplicationContextUtils.getWebApplicationContext(event.getSession().getServletContext());
		
		System.out.println("In Listener : "+ totalActiveSessions);
		System.out.println("before calling CounterService Bean printCounter");
		CounterService cs = (CounterService)ctx.getBean("counterService");
		cs.printCounter(totalActiveSessions);
		cs.sayHello();
	}

}
