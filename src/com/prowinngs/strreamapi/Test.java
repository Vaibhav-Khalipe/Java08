package com.prowinngs.strreamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		list.add("Vaibhav");
		list.add("Khalipe");
		list.add("Java");
		list.add("Full");
		list.add("Stack");
		list.add("Developer");
		
	//	List<String> list2 = list.stream().filter(name->name.startsWith("S")).collect(Collectors.toList());
		//System.out.println(list2);
		List<String> list2 = list.stream().filter(name->name.startsWith("S")).collect(Collectors.toList());
		System.out.println(list2);
		
	}
}
