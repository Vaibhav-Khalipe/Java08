package com.prowings.stringpractise;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		
		String s1="listen                   ".trim();
		String s2="silent".trim();
		
		boolean isAnagram=Anagram(s1,s2);
		System.out.println(isAnagram);
	}

	private static boolean Anagram(String s1, String s2) {

		char[]charArray1=s1.toCharArray();
		char[]charArray2=s2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		System.out.println(Arrays.toString(charArray1));
		System.out.println(Arrays.toString(charArray2));
		
		return Arrays.equals(charArray1, charArray2);
	}
}
