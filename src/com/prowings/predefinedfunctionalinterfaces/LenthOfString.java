package com.prowings.predefinedfunctionalinterfaces;

import java.util.function.Predicate;

public class LenthOfString {

	
	public static void main(String[] args) {
		
		String s1="VaibhavKhalipe";
		
		Predicate<String> p1=s->s1.length()>5;
		
		System.out.println(p1.test(s1));
		
		
	}
}
