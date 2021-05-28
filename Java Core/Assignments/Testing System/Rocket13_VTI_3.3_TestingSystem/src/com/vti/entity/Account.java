package com.vti.entity;

import java.time.LocalDate;


public class Account {
	public int id;
	public String email;
	public String userName;
	public String fullName;
	public Department department;
	public Position position;
	public LocalDate createDate;
	public Group[] groups;
	public Account(int id, String email, String userName, String fullName, Department department, Position position,
			LocalDate createDate, Group[] groups) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.department = department;
		this.position = position;
		this.createDate = createDate;
		this.groups = groups;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
