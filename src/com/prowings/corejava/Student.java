package com.prowings.corejava;


public class Student {

	private int id;
	private String name;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name ) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object obj)
	{
		String name1=this.name;
		int id1=this.id;
		
		Student s=(Student) obj;
		String name2=s.name;
		int id2=s.id;
		
		return (name1.equals(name2))&&(id1==id2);
	}
	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + id;
	    result = prime * result + ((name == null) ? 0 : name.hashCode());
	    return result;

	}
	
}
