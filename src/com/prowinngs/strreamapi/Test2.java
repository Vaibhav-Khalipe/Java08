package com.prowinngs.strreamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		
		List<Integer> list = names.stream().map(String::length).collect(Collectors.toList());
		System.out.println(list);
	}
}
