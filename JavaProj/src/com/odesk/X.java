package com.odesk;

public class X {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A x = new A();
		B y = new B();
		C z = new C();
		
		System.out.println("Before");
		//x = y;
		//z = x; compile time error
		
		//y = (B)x; class cast exception Runtime error

		//y = (A)y; compile time error
		System.out.println("After");
	}

}
