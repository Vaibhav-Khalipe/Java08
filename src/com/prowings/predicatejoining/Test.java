package com.prowings.predicatejoining;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		int[] x = { 0, 5, 10, 15, 20, 25, 30, 35 };
		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 10;

		// AND check the both conditions are true or not

		for (int x1 : x) {
			if (p1.and(p2).test(x1)) {
				System.out.println(x1);
			}
		}

		System.out.println("==========================================");

		// OR check the any of the condition is true or not

		for (int x1 : x) {
			if (p1.or(p2).test(x1)) {
				System.out.println(x1);
			}
		}
		
		
		System.out.println("==============================================");
		
		//Negate means inversion of result 
		
		for(int x1:x)
		{
			if(p2.negate().test(x1))
			{
				System.out.println(x1);
			}
		}
	}
}
