package com.vani;

public class Person // Comparable<Person> 
{

	private int id;
	private String name;
	
	public Person(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	/*@Override
	public int compareTo(Person o) {
		return (this.id < o.id ? -1 :(this.id > o.id ? 1 : 0));
	}*/
	
	/*@Override
	public int compareTo(Person o) {
		
		return name.compareTo(o.name); 
		
	}*/

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
