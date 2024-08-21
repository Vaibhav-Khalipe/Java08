package com.prowings.byfunction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);

	int oddSum = list.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();
		
	System.out.println(oddSum);
	
	
	}
}
