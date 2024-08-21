package com.prowings.stringpractise;

public class StringPalindrome {

	
	public static void main(String[] args) {
		
		String str="nayan";
		boolean isPalindrome=isPalindromeOrNot(str);
		System.out.println(isPalindrome);
	}

	private static boolean isPalindromeOrNot(String str) {

		int left=0;
		int right=str.length()-1;
		while(left<right)
		{
			if(str.charAt(left)!=str.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
}
