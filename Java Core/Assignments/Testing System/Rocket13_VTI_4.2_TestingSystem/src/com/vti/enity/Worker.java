package com.vti.enity;

public class Worker extends Cadres{
	private int rank;

	public Worker(String name, int age, Gender gender, String address, int rank) {
		super(name, age, gender, address);
		this.rank = rank;
	}

	@Override
	public String toString() {
		return super.toString()+ "worker [rank=" + rank + "]";
	}
	
}
