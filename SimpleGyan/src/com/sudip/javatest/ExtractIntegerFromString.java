package com.sudip.javatest;

public class ExtractIntegerFromString {

	public static void main(String[] args) {
		
		
		String s="#$DHDHFHFHF&8DHDH66^%DHDHD56";
		String[] split=s.split("\\D+");
		for(int i=0;i<split.length;i++)
		{
			System.out.print(split[i]);
		}

	}

}
