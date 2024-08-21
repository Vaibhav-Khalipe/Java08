package com.prowings.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(0);
		marks.add(5);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		marks.add(30);
		System.out.println(marks);
		
		List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
	}
}
