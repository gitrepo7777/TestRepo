package com.vani;

public class Test {
	static int x = 10;
	static int v = 20;
	
	static {
		 x = 100;
		 v = x = 9;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("x = " + x);
		System.out.println("v = " + v);
		
	}

}
