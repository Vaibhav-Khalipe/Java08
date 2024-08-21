package com.prowings.streamapi;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Test10 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		
		System.out.println(l);
		Consumer<Integer> c=i->
		{
			System.out.println("THe Square of Number is :"+(i*i));
		};
		
	//	l.stream().forEach(System.out::println);
		
		l.stream().forEach(c);
	}
}
