package com.prowings.methodreferenejava08;

import java.util.function.BiFunction;

public class MethodReference3 {

	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> f=MethodReference3::add;
		System.out.println(f.apply(10, 20));
	}
}
