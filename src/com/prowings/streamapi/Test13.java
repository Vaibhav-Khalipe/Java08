package com.prowings.streamapi;

import java.util.Arrays;
import java.util.List;

public class Test13 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = list.stream().filter(i->i%2!=0).peek(x->System.out.println(x)).distinct().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		 
	}
}
