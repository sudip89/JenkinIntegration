package com.sudip.javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array2ArrayList {

	public static void main(String[] args) {
		
		String[] myArray={"SUDIP","GANGULY","JADEJA","ASHWIN"};
		List<String> myList=Arrays.asList(myArray);
		
		List<String> myList1=new ArrayList<>(myList);
		
		System.out.println(myList1);
		
		myList1.add("PANT");

		System.out.println(myList1);
	}

}
