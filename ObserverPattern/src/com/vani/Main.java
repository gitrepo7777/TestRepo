package com.vani;

public class Main {
	
     
	

     public static void main(String[] args) {
    	 
    	 IntegerBag bag = new IntegerBag();
    	 Observer observer = new ObserverImpl(bag);
    	 Integer i1 = new Integer( 1 ); Integer i2 = new Integer( 2 );
         Integer i3 = new Integer( 3 ); Integer i4 = new Integer( 4 );
         Integer i5 = new Integer( 5 ); Integer i6 = new Integer( 6 );
         Integer i7 = new Integer( 7 ); Integer i8 = new Integer( 8 );
         Integer i9 = new Integer( 9 );
         
         
         bag.addIntToBag(i1);
         bag.addIntToBag(i2);
         bag.addIntToBag(i3);
         bag.addIntToBag(i4);
         bag.addIntToBag(i5);
         
     
        
         
	}
	

}
