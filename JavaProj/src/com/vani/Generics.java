package com.vani;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Generics {
	public static void main(String[] args) {
		/*List<Number> nums = Arrays.<Number>asList(2.78, 3.14);
		List<Integer> ints = nums; // compile-time error
		assert ints.toString().equals("[2.78, 3.14]"); // uh oh!
*/		
		
		
		/*List<Number> nums = new ArrayList<Number>();
		List<Integer> ints = Arrays.asList(1, 2);
		List<Double> dbls = Arrays.asList(2.78, 3.14);
		nums.addAll(ints);
		nums.addAll(dbls);
		assert nums.toString().equals("[1, 2, 2.78, 3.14]");
		*/
	
		/*List<Integer> ints = Arrays.asList(1,2);
		List<? extends Number> nums = ints;
		nums.add(3.14); // compile-time error
		assert ints.toString().equals("[1, 2, 3.14]");*/ // uh oh!
	
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<Object>();
		fromArrayToCollection(oa, co);
		
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<String>();
		fromArrayToCollection(sa, cs);
		
		fromArrayToCollection(sa, co);
		
		Integer[] ia = new Integer[100];
		Float[] fa = new Float[100];
		Number[] na = new Number[100];
		
		Collection<Number> cn = new ArrayList<Number>();
		
		fromArrayToCollection(ia, cn);
		fromArrayToCollection(fa, cn);
		fromArrayToCollection(na, cn);
		fromArrayToCollection(na, co);
		fromArrayToCollection(na, cs);
		
		
		HashMap<String, Integer> contacts = newContacts(); 
	}
	public void test()
	{
		List mylist = new LinkedList();
		mylist.add(new Integer(0));
		Integer x = (Integer)mylist.get(0);
		
		List<Integer> myListInt = new LinkedList<Integer>();
		myListInt.add(56);
		int i = myListInt.get(0);
		int j = myListInt.iterator().next();
		
				
	}
	
	static void fromArrayToCollection2(Object[] a, Collection<?> c) {
	    for (Object o : a) { 
	        c.add(o); // compile-time error
	    }
	}

	static <T> void fromArrayToCollection(T[] a, Collection<T> c)
	{
		for(T t: a)
		{
			c.add(t);
		}
	}
	
	public static <K,V> HashMap<K,V> newContacts() {
		   return new HashMap<K,V>();
		}

		

}
