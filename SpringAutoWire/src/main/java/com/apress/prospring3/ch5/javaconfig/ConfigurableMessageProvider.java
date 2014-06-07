package com.apress.prospring3.ch5.javaconfig;

public class ConfigurableMessageProvider implements MessageProvider {
	
	
	private String message = "Default message from ConfigurableMessageProvider";

	public ConfigurableMessageProvider() {
	}

	public ConfigurableMessageProvider(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}