package com.vani;

public class AnnClass {
	

	@Ann(value="AWESOME")
	public void getValue(String myParam) throws Exception
	{
		System.out.println("AnnClass:getValue() : myParam = "  + myParam);
	}

}
