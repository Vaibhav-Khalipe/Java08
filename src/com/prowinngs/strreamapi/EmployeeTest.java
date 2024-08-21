package com.prowinngs.strreamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EmployeeTest {

	public static void main(String[] args) {
		
		 List<Employee> employees = Arrays.asList(
		            new Employee(1, "John", 50000, "HR", 30),
		            new Employee(1, "Raj", 51000, "HM", 35),
		            new Employee(2, "Jane", 60000, "IT", 28),
		            new Employee(3, "Jack", 70000, "Finance", 35),
		            new Employee(4, "Jill", 55000, "Marketing", 25)
		        );
	//Minimum Salary	 
	//	Optional<Employee> min = employees.stream().min(Comparator.comparingDouble(Employee::getSalary));
	//	System.out.println(min);
		 
		 //Maximum Salary
		// Optional<Employee> max = employees.stream().max(Comparator.comparing(Employee::getSalary));
		// System.out.println(max);
		 
		 //Minimum Salary
		 Optional<Employee> min = employees.stream().min(Comparator.comparing(Employee::getSalary));
		 System.out.println(min);
	}
}
