package com.prowings.predefinedfunctionalinterfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeePredicateExample {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(10000, "Vaibhav", true));
		list.add(new Employee(12000, "Vijay", true));
		list.add(new Employee(14000, "Akshay", true));
		list.add(new Employee(17000, "Ajay", true));
		list.add(new Employee(19000, "Raj", true));
		list.add(new Employee(20000, "John", true));

		Predicate<Employee> p1 = e -> e.salary > 12000;
		for (Employee e1 : list) {
			if (p1.test(e1)) {
				System.out.println(e1.name + " :" + e1.salary);
			}
		}
	}
}
