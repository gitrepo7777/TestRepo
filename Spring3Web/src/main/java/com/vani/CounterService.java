package com.vani;

public class CounterService {
	
	public void sayHello()
	{
		System.out.println("Hello from CounterService");
	}
	
	public void printCounter(int count){
		
		System.out.println("In CounterService printCounter" );
		System.out.println("Total session created : " + count);
	}
}
