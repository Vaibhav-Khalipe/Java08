package com.prowinngs.strreamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EmployeeTest4 {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(   //70,60,55,51,50
	            new Employee(1, "John", 50000, "HR", 30),
	            new Employee(1, "Raj", 51000, "HM", 35),
	            new Employee(2, "Jane", 60000, "IT", 28),
	            new Employee(3, "Jack", 70000, "Finance", 35),
	            new Employee(4, "Jill", 55000, "Marketing", 25)
	        );
		
		//Optional<Employee> min = employees.stream().min(Comparator.comparing(Employee::getSalary));
		//System.out.println(min);
		
		//Optional<Employee> max = employees.stream().max(Comparator.comparing(Employee::getSalary));
		//System.out.println(max);
		
		 employees.stream().sorted((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary()));
	}
}
