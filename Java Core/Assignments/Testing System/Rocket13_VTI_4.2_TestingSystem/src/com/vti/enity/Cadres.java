package com.vti.enity;

public class Cadres {
	private String name;
	private int age;
	private Gender gender;
	private String address;
	public enum Gender{
		MALE,FEMALE,UNKNOW
	}
	public Cadres(String name, int age, Gender gender, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	@Override
	public String toString() {
		return "cadres [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
