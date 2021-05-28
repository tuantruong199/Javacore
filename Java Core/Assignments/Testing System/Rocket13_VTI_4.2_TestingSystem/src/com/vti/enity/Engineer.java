package com.vti.enity;

public class Engineer extends Cadres {
	private String training_industry;

	public Engineer(String name, int age, Gender gender, String address, String training_industry) {
		super(name, age, gender, address);
		this.training_industry = training_industry;
	}

	@Override
	public String toString() {
		return super.toString()+ "Engineer [training_industry=" + training_industry + "]";
	}

}
