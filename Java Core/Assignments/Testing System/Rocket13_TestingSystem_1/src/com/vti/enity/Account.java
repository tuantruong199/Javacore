package com.vti.enity;

import java.time.LocalDateTime;

public class Account {
	public int id;
	public String email;
	public String userName;
	public String fullName;
	public Department departmentId;
	public Positition posititionId;
	public LocalDateTime createDate;
	public Group[] groups;
}
