package com.prowings.streamapi;

import java.util.ArrayList;
import java.util.Optional;

public class Test9 {

	public static void main(String[] args) {
		
	ArrayList<Integer> numbers=new ArrayList<Integer>();
	numbers.add(0);
	numbers.add(5);
	numbers.add(10);
	numbers.add(15);
	numbers.add(20);
	numbers.add(25);
	numbers.add(30);
	numbers.add(35);
	
	Integer minNumber = numbers.stream().min((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(minNumber);
	
	Integer maxNumber = numbers.stream().max((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(maxNumber);
	}
}
