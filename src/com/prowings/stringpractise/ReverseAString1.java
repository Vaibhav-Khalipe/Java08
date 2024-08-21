package com.prowings.stringpractise;

public class ReverseAString1 {

	public static void main(String[] args) {
		String str = "VaibhavKhalipe";
		String revesed=reverseString(str);
		System.out.println(revesed);
		
	//	String s1=new StringBuffer(str).reverse().toString();
	//	System.out.println(s1);
	}

	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		return sb.toString();
	}
}
