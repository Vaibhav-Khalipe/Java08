package com.prowinngs.strreamapi;

public class Employee {
	private int id;
    private String name;
    private double salary;
    private String department;
    private int age;

    public Employee(int id, String name, double salary, String department, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.age = age;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary + 
               ", Department: " + department + ", Age: " + age;
    }
}
