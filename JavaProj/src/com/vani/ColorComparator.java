package com.vani;

import java.util.Comparator;

public class ColorComparator implements Comparator<Color> 
{


	
	@Override
	public int compare(Color o1, Color o2) {
		
		return o1.getName().compareTo(o2.getName()); 
		
	}


	
}
