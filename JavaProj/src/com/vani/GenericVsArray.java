package com.vani;

public class GenericVsArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Holder<Integer> numbers = new Holder<Integer>(10);
		numbers.add(300);
		System.out.println(numbers.get(0));
	}

}


class Holder<T>{
	private T[] contents;
	private int index;
	
	public Holder(int size)
	{
		contents = (T[])new Object[10];
		
	}
	
	public void add(T content)
	{
		contents[index] = content;
	}
	
	public T get(int index)
	{
		return contents[index];
	}
}