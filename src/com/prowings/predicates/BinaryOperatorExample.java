package com.prowings.predicates;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	
	public static void main(String[] args) {
		
		
		BinaryOperator<Integer>f=(i1,i2)->i1*i2;
		System.out.println(f.apply(10, 5));
	}
}
