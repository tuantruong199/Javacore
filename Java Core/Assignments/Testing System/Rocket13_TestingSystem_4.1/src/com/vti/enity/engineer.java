package com.vti.enity;

public class engineer extends cadres{
	private String Training_industry;

	public engineer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public engineer(String name, int age, com.vti.enity.cadres.gender gender, String address) {
		super(name, age, gender, address);
		// TODO Auto-generated constructor stub
	}

	public engineer(String training_industry) {
		super();
		Training_industry = training_industry;
	}

	public String getTraining_industry() {
		return Training_industry;
	}

	public void setTraining_industry(String training_industry) {
		Training_industry = training_industry;
	}
	
}
