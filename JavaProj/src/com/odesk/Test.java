package com.odesk;

public class Test {
	
	
	static public  void main(String[] args) {
		/*int[] intArr = {1,2,3,4,5};
		intArr.length;
		
		int iRand;
		iRand = Math.random();
		System.out.println(iRand);*/
		
		//System.out.println(Math.floor(-2.1));
	/*	int i = 2;
		int j = 3;
		System.out.println(i & j);*/
				
				
		//System.out.println(args[0]);
		
		
		String a, b, c, d;
		a = "Hello123";
		b = "Hello" + String.valueOf(123);
		c = "Hello" + "123";
		d = new String (new char[]{'H', 'e', 'l', 'l', 'o', '1', '2', '3'});
		
		System.out.println(a == b); //false
		System.out.println(a.equals(b)); //true
		
		System.out.println(a == c); //true
		System.out.println(a.equals(c)); //true
		
		System.out.println(a == d); //false
		System.out.println(a.equals(d)); //true
		
	}

}
