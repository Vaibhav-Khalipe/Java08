package com.prowinngs.strreamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		
		List<List<String>> list = Arrays.asList(Arrays.asList("Alice","Bob"),Arrays.asList("Charlie","David"));
		
		List<String> collect = list.stream().flatMap(List::stream).collect(Collectors.toList());
		
		System.out.println(collect);
		
	}
}
