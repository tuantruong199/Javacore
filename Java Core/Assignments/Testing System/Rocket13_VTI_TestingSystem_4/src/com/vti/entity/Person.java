package com.vti.entity;

public abstract class Person {
	private String  name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person : Name=" + name ;
	}
	
	
}
