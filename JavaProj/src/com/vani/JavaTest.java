package com.vani;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JavaTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		int[] myArray = new int[64];
		myArray[15] = 9226;
		System.out.println(myArray[15]);
		
		
		int x = 16 >> 2;
		System.out.println(x);
		
		String s1 = "hello";
		String s2 = "hello";

		System.out.println(s1==s2);
		
		String s3 = new String ("hello");
		String s4 = new String("hello");
		System.out.println(s3==s4);
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader con = new BufferedReader(in);
		String str = con.readLine();
		System.out.println("str = "+ str);
		
		/*List<Object> ol = new ArrayList<Long>();
		List<String>[] stringLists = new List<String>[1];
		List<Integer> intList = Arrays.asList(42);
		Object[] objects = stringLists;
		objects[0] = intList;
		String s = stringLists[0].get(0);
		
		
		List<Number>  ln = new ArrayList<Number>();
		Set<String> guys = new HashSet<String>();
		List<Integer> li = new  ArrayList<Integer>();
		List<String>  ls = new ArrayList<String>();
		List<Object>  lo = new ArrayList<Object>();
		
		
		
		ln = li;
		lo = ls;
		
		li = ln;
		ls = lo;*/
		
		Set<String> set = new HashSet<String>();
		//set.add(null);
		set.add("vani");
		Iterator<String> iter = set.iterator();
		while(iter.hasNext())
		{
			String strq = iter.next();
			System.out.println("str = "+ strq);
		}
		
	}
	
	/*static <E> E reduce(List<E> list, Function<E> f, E initVal) {
		E[] snapshot = list.toArray(); // Locks list
		E[] snapshot1 = (E[]) list.toArray();
		E result = initVal;
		for (E e : snapshot)
		result = f.apply(result, e);
		return result;
		}
	
	
	
	// List-based generic reduction
	static <E> E reduce2(List<E> list, Function<E> f, E initVal) {
	List<E> snapshot;
	synchronized(list) {
		snapshot = new ArrayList<E>(list);
	}
	E result = initVal;
	for (E e : snapshot)
	result = f.apply(result, e);
	return result;
	}
	
	interface Function<T> {
		T apply(T arg1, T arg2);
		}
*/
}
