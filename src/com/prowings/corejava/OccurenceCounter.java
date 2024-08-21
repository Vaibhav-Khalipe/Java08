package com.prowings.corejava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceCounter {

	
	public static void main(String[] args) {
		
		 List<Integer> numbers = Arrays.asList(1, 2, 4, 56, 5, 6, 1, 2);

	        Map<Integer, Long> occurrences = numbers.stream()
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	        occurrences.forEach((key, value) -> System.out.println(key + ": " + value));
	}
}
