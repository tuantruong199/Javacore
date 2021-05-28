package com.vti.enity;

public class cadres {
	private String name;
	private int age;
	private gender gender;
	public enum gender{
		MALE,FEMALE,UNKNOW
	}
	private String address;
	public cadres() {
		super();
		// TODO Auto-generated constructor stub
	}
	public cadres(String name, int age, com.vti.enity.cadres.gender gender, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public gender getGender() {
		return gender;
	}
	public void setGender(gender gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "staff [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}
	
}
