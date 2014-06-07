package com.vani;

public class AThread1 extends Thread {

	ATest aTest;
	
	AThread1(ATest aTest)
	{
		aTest =  aTest;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("AThread1-run() method");
		synchronized (aTest) {
			aTest.regularMethod();
		}
		
	}



}
