
package com.vani;

import java.util.ArrayList;
import java.util.Iterator;

public class ObserverImpl implements Observer {
	
	private IntegerBag intBag;
	
	public ObserverImpl(IntegerBag intBag)
	{
	
		this.intBag =  intBag;
		intBag.addObserver(this);
		
	}
	
	public void update(Subject sub) {
		
		
		if(intBag instanceof Subject ) {
            System.out.println( "The contents of the IntegerDataBag have changed." );
            int counter = 0;
            ArrayList<Integer> intList = ( ArrayList<Integer> )intBag.getListIntegers();
            Iterator<Integer> i = intList.iterator();
            while( i.hasNext() ) {
                  Integer integer = ( Integer ) i.next();
                  counter =integer.intValue();
                  System.out.println( "The new bag of integers is: " + counter );
            }
            
      }
}
		
		
	
}
