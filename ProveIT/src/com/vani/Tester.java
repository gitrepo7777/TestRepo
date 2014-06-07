package com.vani;

public class Tester {
	enum Color{R, W, B}
	
	public static void main (String[] args)
	{
		/*for(Color c : Color.values())
		{
			System.out.println(c);
		}*/
		
		/*short s1 = 1;
		short s2 = 2;
		short s3 = s1 + s2;*/
		
		
		Tester t = new Tester();
		/*t.p("vani");*/
		//t.p();
		/*System.out.println(t.calc(5));
		
		*/
		
		/*int a = 1;
		int b = 2;
		int c = ++a + b--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		
		/*int a = 1;
		int b =2;*/
		/*int c = 3;
		
		if((a ==1) | (++b >1))
		{
			c +=b;
			
		}
		System.out.println(c);*/
	
		/*int c = (a <b ? a : b);
		System.out.println(c);*/
		
		/*int a = 312;
		int b = 4;
		int c = a >> b;
		System.out.println(c);*/
		
		/*String mystr = new String("Test123");
		System.out.println(mystr.length());
		System.out.println(mystr.substring(4));
		
		StringBuffer mybuff = new StringBuffer("Test123");
		System.out.println(mybuff.reverse());*/
		
		
		/*String s1 = "Test123";
		String s2 = "Test123";
		String s3 = new String ("Test123");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));*/
		
		Tester obj = new Tester();
		System.out.println(obj.reverseString("Vani"));
		
	}
	String mystr = "Tester";
	
	public void p()
	{
		mystr = "change";
		System.out.println("--" + mystr);
	}

	public void p(String s)
	{
		System.out.println("s = "+s);
	}

	public int calc(int n)
	{
		if(n <=1){
			return 1;
		}else{
			return calc(n-1) + n;
		}
	}

	public String reverseString(String s){
		System.out.println(s);
	    if (s.length() == 0) {
	    	System.out.println("s = " + s);
	    	 return s;
	    	
	    }
	        
	    System.out.println("s.substring(1) = " + s.substring(1));
	    System.out.println("s.charAt(0) = " + s.charAt(0));
	   
	    return reverseString(s.substring(1)) + s.charAt(0);
	}


}



