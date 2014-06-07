package com.vani;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */

@Configuration
public class AppConfig 
{
	@Bean(name="helloBean")
	public HelloWorld helloBean()
	{
		return new HelloWorldImpl();
	}
}
