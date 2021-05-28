package com.vti.enity;

public class Staff extends Cadres{
	private String work;

	public Staff(String name, int age, Gender gender, String address, String work) {
		super(name, age, gender, address);
		this.work = work;
	}

	@Override
	public String toString() {
		return super.toString()+ "Staff [work=" + work + "]";
	}
	
}
