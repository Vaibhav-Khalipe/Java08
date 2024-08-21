package com.prowings.byfunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class EmployeeTest {

	
	public static void main(String[] args) {
		
		BiFunction<Integer, String, Employee> f=(eno,name)->new Employee(eno, name);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(f.apply(100, "Durga"));
		list.add(f.apply(200, "Ravi"));
		list.add(f.apply(300, "Shiva"));
		list.add(f.apply(400, "Pawan"));
		
		for(Employee e:list)
		{
			System.out.println("Employee Number is :"+e.getEno());
			System.out.println("Employee Namee is :"+e.getName());
             System.out.println("===================================");
			
		}
	}
}
