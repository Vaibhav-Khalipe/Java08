package com.prowings.byfunction;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class Employee1ConsumerTest {

	
	public static void main(String[] args) {
		
		BiConsumer<Employee1, Double> c=(e,d)->e.salary=e.salary+d;
		
		ArrayList<Employee1> list= new ArrayList<Employee1>();
		list.add(new Employee1("Durga", 1000));
		list.add(new Employee1("Sunny", 2000));
		list.add(new Employee1("Bunny", 3000));
		list.add(new Employee1("Chinny", 4000));
		
		for(Employee1 e:list)
		{
			c.accept(e, (double) 500);
		}
		
		for(Employee1 e:list)
		{
			System.out.println("Employee Name is :"+e.name);
			System.out.println("Employee Salary is :"+e.salary);
			System.out.println("**************************************************");
		}
	}
}
