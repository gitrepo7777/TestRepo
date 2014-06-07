package com.odesk;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<Integer>();
		
		boolean b = s.add(5);
		System.out.println(" b = " + b);
		b = s.add(5);
		System.out.println(" b = " + b);
		
		Iterator<Integer> iter = s.iterator();
		while(iter.hasNext())
		{
			Integer i = iter.next();
			System.out.println("i = " + i.intValue());
		}
	
	}
}
