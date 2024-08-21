 package com.prowings.lambdaexpresions;

import java.util.function.BiConsumer;

public class AdditionOfTwoNumbers {

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> m1 = (a, b) -> {
			System.out.println(a + b);
			System.out.println(a + b);
		};
		m1.accept(5, 4);
		m1.accept(4, 7);
	}
}


// (a,b)->{System.out.println(a+b);