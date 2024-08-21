package com.prowings.functions;

import java.util.function.Function;

public class Test2 {

	
	public static void main(String[] args) {
		
		Function<String, Integer> p=s->s.length();
		
		System.out.println(p.apply("VaibhavKhalipe"));
	}
}
