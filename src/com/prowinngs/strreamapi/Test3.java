package com.prowinngs.strreamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,2,3,3,4,5,6,6,6,7,7,7,7,7);
		
		List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctList);
	}
}
