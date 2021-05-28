package com.vti.entity;

public class Account1 {
	private int id;
	private String email;
	private String firtName;
	private String lastName;
	private String fullName;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirtName() {
		return firtName;
	}
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Account1(int id, String email, String firtName, String lastName) {
		super();
		this.id = id;
		this.email = email;
		this.firtName = firtName;
		this.lastName = lastName;
		this.fullName = firtName+lastName;
	}
	public Account1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "[id=" + id + ", email=" + email + ", fullName=" + fullName + "]";
	}
	
}
