package com.prowings.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test1 {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		l.add(90);
		l.add(100);
		
		Comparator<Integer> c=(I1,I2)->(I1<I2)?1:(I1>I2)?-1:0;
		Collections.sort(l,c);
		System.out.println(l);
		l.stream().forEach(System.out::println);
	}
}
