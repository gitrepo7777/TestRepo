package com.vani;

public class JavaTest {
	public static void main(String[] args)
	{
		System.out.println("Test");
		int val = 0;
		/*while(val < 10){
			val = val +1;
			if(val ==4) continue;
			if(val >4) break;
			System.out.println("val = "+ val);
			
			
		}*/
		
		for(;;)
		{
			System.out.println(val);
			val = val +1;
			if(val >3) break;
		}
	}

}
