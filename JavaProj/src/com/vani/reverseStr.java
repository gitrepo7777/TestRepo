package com.vani;

public class reverseStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Vani";
		
		System.out.println(rr(str));

	}

	public  static String rr(String str)
	{
		if(str.length() == 0)
		 return str;
		 
		System.out.println("str.substring(1) = "  + str.substring(1));
		System.out.println("str.charAt(0) = " + str.charAt(0) );
		String str2 = rr(str.substring(1)) + str.charAt(0);
		System.out.println("str2 = "+str2);
		 return str2;
		 //rr(str.substring(1)) + str.charAt(0);
	}
}
