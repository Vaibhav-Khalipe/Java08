package com.prowings.functions;

import java.util.function.Function;
import java.util.function.Predicate;

public class TestStudent {

	public static void main(String[] args) {

	//	Predicate<Student> p=s->s.marks>=60;
		
		
		Function<Student, String> f = s -> {
			int marks = s.marks;
			String grade = "";

			if (marks >= 80)
				System.out.println("A Grade");
			if (marks >= 60)
				System.out.println("B Grade");
			if (marks >= 50)
				System.out.println(40);
			System.out.println("C Grade");
			return grade;
		};

		Student[] s = { new Student("Durga", 100), new Student("Sunny", 65), new Student("Bunny", 55),
				new Student("Chinny", 45), new Student("Vinny", 25) };

		for (Student s1 : s) {
			//This Commented Statement is for Predicate Statement
			// if(p.test(s1))
			System.out.println("Student Name is :" + s1.name);
			System.out.println("Student Marks is :" + s1.marks);
			System.out.println("Student Grade is :" + f.apply(s1));
			System.out.println("===================================================");
		}
	}
}
