package com.prowings.lambdaexpresions;

import java.util.function.Function;
import java.util.function.Predicate;

public class CheckPrimeNumber {

	
	public static void main(String[] args) {
		
		
		Predicate<Integer>p=i->i%2==0;
		System.out.println(p.test(4));
		System.out.println(p.test(10));
		
	}
}
