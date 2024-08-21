package com.prowings.stringpractise;

public class ReverseAString {
	public static void main(String[] args) {

		String str = "VaibhavKhalipe";
		String revesed=reverseString(str);
		System.out.println(revesed);
	}

	public static String reverseString(String str) {

		String empty="";
		for(int i=str.length()-1;i>=0;i--)
		{
			empty+=str.charAt(i);
			
		}
		return empty;
	}

}