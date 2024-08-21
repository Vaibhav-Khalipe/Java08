package com.prowings.byfunction;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		
		Function<Integer, Integer> function=i->i*i;
		System.out.println(function.apply(10));
	}
}
