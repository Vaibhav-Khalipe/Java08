package com.prowings.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test6 {

	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<String>();
		name.add("Sunny");
		name.add("Kajal");
		name.add("Prabhas");
		name.add("Anushka");
		name.add("Mallika");
		
		List<String> sortedNames = name.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNames);
	}
}
