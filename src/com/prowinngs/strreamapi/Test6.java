package com.prowinngs.strreamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Test6 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = list.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		
	}
}
