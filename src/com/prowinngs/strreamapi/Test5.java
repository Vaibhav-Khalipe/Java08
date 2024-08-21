package com.prowinngs.strreamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test5 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Alice", "Bob", "Charlie");
	List<String> peek = list.stream().peek(name->System.out.println("Name :"+name)).collect(Collectors.toList());
	System.out.println(peek);
	}
}
