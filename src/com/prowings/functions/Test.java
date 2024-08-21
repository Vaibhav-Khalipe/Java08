package com.prowings.functions;

import java.util.function.Function;

public class Test {

	
	public static void main(String[] args) {
		
		Function<Integer, Integer>  p=i->i*i;
		System.out.println(p.apply(5));
		System.out.println(p.apply(12));
	}
	
}
