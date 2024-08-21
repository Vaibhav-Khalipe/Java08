package com.prowinngs.strreamapi;

import java.util.Arrays;
import java.util.List;

public class Test8 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3);
		
//		int sum = list.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();
//		System.out.println(sum);
		list.set(2, 5);
	//	System.out.println(list);
		
//		
		List<Integer> list1= List.of(1,2,3);
		list1.set(2, 6);
		System.out.println(list1);
		
		
	}
}
