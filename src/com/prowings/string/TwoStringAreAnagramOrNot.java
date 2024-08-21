package com.prowings.string;

import java.util.Arrays;

public class TwoStringAreAnagramOrNot {

	
	public static void main(String[] args) {
		
		String s1="listen";
		String s2="silent";
		if(isAnagram(s1, s2))
			System.out.println("Anagram ");
		else
			System.out.println("Not Anagram");
		
	}
	
	public static boolean isAnagram(String s1,String s2)
	{
		String str1=s1.replaceAll(" ", "").toLowerCase();
		String str2=s1.replaceAll(" ", "").toLowerCase();
		char[]charArray1=str1.toCharArray();
		char[]charArray2=str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}
	
}
