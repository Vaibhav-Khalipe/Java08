package com.prowinngs.strreamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Charlie", "Alice", "Bob");
		List<String> sortedList = list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		System.out.println(sortedList);
	}
}
