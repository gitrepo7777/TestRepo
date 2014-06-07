package com.vani;

public class AThread2 extends Thread {
	
ATest aTest;
	
	AThread2(ATest aTest)
	{
		aTest =  aTest;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("AThread2-run() method");
		synchronized (ATest.class) {
			aTest.staticMethod();
		}
		
	}



}
