package com.vani;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;


@Configurable
public class AppConfig {

	@Bean(name="hello")
	public Hello getHelloBean()
	{
		 return new HelloBean();
	}

}
