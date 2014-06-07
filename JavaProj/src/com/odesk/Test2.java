package com.odesk;

public class Test2 {
	
	private String privStr = "privStr";
	public String pubStr = "pubStr";
	public final String pubFinal = "pubFinal";
	private final String privFinal = "privFinal";
	public void test(final int outer)
	{
		System.out.println("outer = " + outer);
		//what and why a class like this is useful ?
	
		class Enclose{
			public void testInner(final int inner )
			{
				System.out.println("privStr = " + privStr);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.test(7);

	}

}
