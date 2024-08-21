package com.prowings.byfunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest1 {

	public static void main(String[] args) {
		
		   List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		 Consumer<String> consumer=name->System.out.println(name);
		 names.forEach(consumer);
	}
}
