package com.vani;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.annotation.Resource;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) 	
public @interface Ann {
	public String value() default "Test";

}
