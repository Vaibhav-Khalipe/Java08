package com.prowings.byfunction;

public class ReverseAString1 {

	public static void main(String[] args) {
		
		String str="NBY Mellon Technology";
		String reversedString = reversedString(str);
		System.out.println(reversedString);
		
	}
	
	public static String reversedString(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		return rev;
	}
}
