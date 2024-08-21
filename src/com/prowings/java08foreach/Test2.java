package com.prowings.java08foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		list.add("Vaibhav");
		list.add("Khalipe");
		list.add("Java");
		list.add("Full");
		list.add("Stack");
		list.add("Developer");
		
	//	Stream<String> stream = list.stream();
		//stream.forEach(name->System.out.println(name));
		
		Stream<String> stream = list.stream();
		stream.forEachOrdered(System.out::println);
		
		
	}
}
