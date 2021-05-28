package com.vti.enity;

public class staff extends cadres{
	private String Work;

	public staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public staff(String name, int age, com.vti.enity.cadres.gender gender, String address) {
		super(name, age, gender, address);
	}

	public staff(String work) {
		super();
		Work = work;
	}

	public String getWork() {
		return Work;
	}

	public void setWork(String work) {
		Work = work;
	}
	
}
