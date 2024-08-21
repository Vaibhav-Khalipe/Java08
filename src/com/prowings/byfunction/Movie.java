package com.prowings.byfunction;

public class Movie {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + "]";
	}


	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String name) {
		super();
		this.name = name;
	}
	
	
	
	
}
