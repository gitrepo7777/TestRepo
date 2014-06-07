package com.vani;

public class Factorial {

	int result = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial f = new Factorial();
		int res = f.factorial(5);
		System.out.println("res = "+ res);

	}


	
	private int factorial(int n)
	{
		if(n <=1){
			return 1;	
		}else{
			n = n* factorial(n-1);
		}
		
		return n;
		
	}
}
