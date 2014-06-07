package com.vani;

public class i1i2 implements I1, I2 {
	
	public void m1(){
		System.out.println("m1");
	}

	public void m2(){
		System.out.println("m2");
	}
	
	public static void main(String[] args)
	{
		/*i1i2 obj = new i1i2();
		obj.m1();
		obj.m2();*/
		
		I1 obj = new i1i2();
		/*obj.m1();
		obj.m2();*/
		
		I2 i2 = (I2)new i1i2();
	}
}
