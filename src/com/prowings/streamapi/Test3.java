package com.prowings.streamapi;

import java.util.ArrayList;

public class Test3 {

	
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
		long noOfFailedStudents=marks.stream().filter(m->m>=15).count();
		System.out.println("Nmber of Failed Students is :" +noOfFailedStudents);
	}
}
