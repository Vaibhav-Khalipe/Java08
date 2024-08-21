package com.prowings.streamapi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test11 {

	public static void main(String[] args) {
		

		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		System.out.println(l);
		
		Integer[] i = l.stream().toArray(Integer[]::new);
//		for(Integer i1:i)
//		{
//			System.out.println(i1);
//		}
		
		Stream.of(i).forEach(System.out::println);
	}
}
