package com.prowings.java08foreach;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		list.add("Vaibhav");
		list.add("Khalipe");
		list.add("Java");
		list.add("Full");
		list.add("Stack");
		list.add("Developer");
		list.forEach(name->System.out.println(name));
	//	list.forEach(System.out::println);
	}
	
}
