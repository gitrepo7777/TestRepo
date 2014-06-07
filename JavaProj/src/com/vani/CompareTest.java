package com.vani;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person (100, "Kumar");
		Person p2 = new Person (101, "Lewis");
		Person p3 = new Person (104, "John");
		
		Person p4 = new Person (106, "Kumar");
		Person p5 = new Person (105, "Lewis");
		Person p6 = new Person (104, "John");
		
		List<Person> pList = new ArrayList<Person>();
		/*pList.add(p1);
		pList.add(p2);
		pList.add(p3);*/
		
		
		pList.add(p4);
		pList.add(p5);
		pList.add(p6);
		
		/*pList.add(p6);
		pList.add(p5);
		pList.add(p4);*/
		
		
		Collections.sort(pList, new PersonComparator());
		//Collections.sort(pList, new ColorComparator());
		
		for(Person p : pList)
		{
			String str = String.format("%s, %s", p.getId(), p.getName());
			System.out.println(str);
			
		
		}
		
		
	}

}
