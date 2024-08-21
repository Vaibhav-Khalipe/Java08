package com.prowings.functions;

import java.util.function.Consumer;
import java.util.function.Function;

public class TestStudent2 {

	public static void main(String[] args) {

		Function<Student, String> f = s -> {
			int marks = s.marks;
			String grade = "";

			if (marks >= 80)
				System.out.println("A Grade ");
			else if (marks >= 70)
				System.out.println("B Grade");
			else if (marks >= 50)
				System.out.println("C Grade");
			return grade;

		};

		Student[] s = { new Student("Durga", 100), new Student("Sunny", 65), new Student("Bunny", 55),
				new Student("Chinny", 45), new Student("Vinny", 25) };
//
//		for (Student s1 : s) {
//			System.out.println("Student Name is :" + s1.name);
//			System.out.println("Student Marks is :" + s1.marks);
//			System.out.println("Grade is :" + f.apply(s1));
//
//			System.out.println("===============================");
//		}

		Consumer<Student> c = s2 -> {

			System.out.println("Student Name is :" + s2.name);
			System.out.println("Student Marks is :" + s2.marks);
			System.out.println("Grade is :" + f.apply(s2));
			System.out.println("==========================");

		};
		
		for(Student s2:s)
		{
			c.accept(s2);
		}

	}
}
