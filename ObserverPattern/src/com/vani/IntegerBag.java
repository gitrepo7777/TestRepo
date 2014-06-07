package com.vani;

import java.util.ArrayList;


public class IntegerBag implements Subject {
	
	ArrayList<Observer> listObservers = new ArrayList<Observer>();
	ArrayList<Integer> listIntegers = new ArrayList<Integer>();


	public ArrayList<Integer> getListIntegers() {
		return listIntegers;
	}

	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		listObservers.add(o);

	}

	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		listObservers.remove(o);

	}
	
	public void addIntToBag(Integer i)
	{
		listIntegers.add(i);
		for(Observer o : listObservers)
		{
			o.update(this);
		}
	}


	public void removeIntFromBag(int i)
	{
		listIntegers.remove(i);
		for(Observer o : listObservers)
		{
			o.update(this);
		}
	}
	
	
}
