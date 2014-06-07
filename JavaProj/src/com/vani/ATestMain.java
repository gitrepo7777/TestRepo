package com.vani;

public class ATestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create 2 threads, where one accesses regular method and the other
		//static methos of the same class ATest simultaneously.
		
		ATest aTest = new ATest();
		
		AThread1 thr1 = new AThread1(aTest);
		thr1.start();
		
		AThread2 thr2 = new AThread2(aTest);
		thr2.start();
		
		

	}

}
