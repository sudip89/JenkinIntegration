package com.sudip.javatest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConvertArrayList2Array {

	public static void main(String[] args) {
		
		List<String> myArrlist=new ArrayList<>();
		myArrlist.add("SUDIP");
		myArrlist.add("KOHLI");
		myArrlist.add("PANT");
		myArrlist.add("ROHIT");
		
		Iterator<String> itr=myArrlist.iterator();
		// Displaying the values after iterating 
        // through the list 
        System.out.println("\nThe iterator values"
                           + " of list are: "); 
        while (itr.hasNext()) { 
            System.out.print(itr.next() + " "); 
        } 
		
		String[] array=new String[myArrlist.size()];
		array=myArrlist.toArray(array);
		
		// Displaying the values after iterating 
        // through the Array
		
		
		System.out.println("\nThe iterator values"
                + " of Array are: "); 
		for(String x: array)
		{
			System.out.print(x+" ");
		}
		
		

	}

}
