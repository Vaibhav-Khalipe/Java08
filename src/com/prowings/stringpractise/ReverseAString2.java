package com.prowings.stringpractise;

public class ReverseAString2 {

	public static void main(String[] args) {
		
		String str = "VaibhavKhalipe";
		String revesed=reverseString(str);
		System.out.println(revesed);
	}

	private static String reverseString(String str) {

		char[]charArray=str.toCharArray();
		char[]reversedCharArray=new char[charArray.length];
		 for (int i = 0; i < charArray.length; i++) {
	            reversedCharArray[i] = charArray[charArray.length - 1 - i];
		}
		return new String(reversedCharArray);
	}
}
