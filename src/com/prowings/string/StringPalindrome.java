package com.prowings.string;

public class StringPalindrome {

	public static void main(String[] args) {
	
		String str="Madam";
		if(isPalindrome(str))
		System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
}

	public static boolean isPalindrome(String s1) {
		

		String str=s1.toLowerCase();
		int leftCount=0;
		int rightCount=s1.length()-1;
		
		while(leftCount<rightCount)
		{
			if(str.charAt(leftCount)!=str.charAt(rightCount))
				return false;
			leftCount++;
			rightCount--;
		}
		
		
		return true;
	}
}