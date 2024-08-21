package com.prowings.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> marks= new ArrayList<Integer>();
		marks.add(0);
		marks.add(5);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		
		List<Integer> updatedMarks = marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updatedMarks);
	}
}
