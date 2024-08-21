package com.prowings.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test8 {

	public static void main(String[] args) {
		
		ArrayList<String> names= new ArrayList<String>();
		names.add("A");
		names.add("AA");
		names.add("AAA");
		names.add("AAAA");
		names.add("AAAAA");
		names.add("AAAAAA");
		System.out.println(names);
		Comparator<String> c= (s1,s2)->
		{
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2)
				return 1;
			else if(l1>l2)
				return -1;
			else
				return s1.compareTo(s2);
		};
		
		List<String> sortedLenght = names.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sortedLenght);
	}
}
