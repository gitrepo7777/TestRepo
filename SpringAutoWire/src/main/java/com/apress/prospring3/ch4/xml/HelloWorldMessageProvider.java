package com.apress.prospring3.ch4.xml;

import org.springframework.stereotype.Service;

import com.apress.prospring3.ch4.MessageProvider;

@Service
public class HelloWorldMessageProvider implements MessageProvider {
	public String getMessage() {
		return "Hello World!";
	}
}