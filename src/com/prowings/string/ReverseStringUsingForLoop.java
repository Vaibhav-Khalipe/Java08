package com.prowings.string;

public class ReverseStringUsingForLoop {

	public static void main(String[] args) {
	
		String s="Vaibhav Khalipe";
		String reversedString= reverseString(s);
		System.out.println(reversedString);
				
	}

	private static String reverseString(String s) {

		String reversed="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reversed+=s.charAt(i);
		}
		
		return reversed;
	}

	
}
