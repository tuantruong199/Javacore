package com.vti.entity;

public abstract class Student extends Person{
	private int id;

	public Student(String name, int id) {
		super(name);
		this.id = id;
	}

	@Override
	public String toString() {
		return super.toString()+ ", id=" + id ;
	}
	
	
}
