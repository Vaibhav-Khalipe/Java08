package com.prowings.predicates;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorExample {

	
	public static void main(String[] args) {
		
		DoubleBinaryOperator f=(i1,i2)->i1*i2;
		
		System.out.println(f.applyAsDouble(10.5, 1.0));
	}
}
