package com.vani;

public class Testj {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	void unflow(boolean flag) {
		final int k;
		if (flag) {
			k = 3;
			System.out.println(k);
		} else {
			k = 4;
			System.out.println(k);
		}
	}

	void unflow1(boolean flag) {
		final int k;
		if (flag) {
			k = 3;
			System.out.println(k);
		}
		if (!flag) {
			k = 4;
			System.out.println(k); /*
									 * k is not "definitely unassigned" before
									 * this statement
									 */
		}
	}

}
