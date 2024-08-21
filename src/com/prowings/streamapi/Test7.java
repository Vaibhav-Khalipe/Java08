package com.prowings.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test7 {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Sunny");
		names.add("Kajal");
		names.add("Prabhas");
		names.add("Anushka");
		names.add("Mallika");
		
		List<String> sortedNames = names.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(sortedNames);
	}
}
