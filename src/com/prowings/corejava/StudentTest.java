package com.prowings.corejava;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(100, "Sushant");
		Student s2 = new Student(100, "Sushant");
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
