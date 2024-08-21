package com.prowings.byfunction;

public class ReverseAString2 {

	public static void main(String[] args) {
		
		String str="Vaibhav";
		
		String reversed=   reverseString(str);
		System.out.println(reversed);
	}

	private static  String  reverseString(String str) {
		// TODO Auto-generated method stub
		return new StringBuffer(str).reverse().toString();
		
	}
}
