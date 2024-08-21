package com.prowings.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {

	
	public static void main(String[] args) {
		
		
		ArrayList<Employee> list= new ArrayList<Employee>();
		
		list.add(new Employee("Vijay", 10));
		list.add(new Employee("Ajay", 20));
		list.add(new Employee("Akshay", 30));
		list.add(new Employee("Vaibhav", 80));
		list.add(new Employee("John", 85));
		list.add(new Employee("Smith", 11));
		list.add(new Employee("David", 18));
		
	//	Comparator<Employee> c = (e1, e2) -> (e1.id < e2.id) ? -1 : (e1.id > e2.id) ? 1 : 0;

//		Comparator<Employee> c=(e1,e2)->(e1.id<e2.id)?-1:(e1.id>e2.id)?1:0;
//		list.sort(c);
//		
//		list.forEach(System.out::println);
		
		Comparator<Employee> c=(e1,e2)->(e1.name.compareTo(e2.name));
		list.sort(c);
		list.forEach(System.out::println);
		
	}
	
}
