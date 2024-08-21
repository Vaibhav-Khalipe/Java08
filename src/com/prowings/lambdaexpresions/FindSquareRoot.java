package com.prowings.lambdaexpresions;

import java.util.function.Function;

public class FindSquareRoot {

	
	public static void main(String[] args) {
		
		Function<Integer, Integer>f=i->i*i;
		System.out.println("The Square Root of 40 is :"+f.apply(40));
		System.out.println("The Square Root of 50 is :"+f.apply(50));
}
}
