package com.vti.entity;

import com.vti.ultis.ScannerUltis;

public class Student {
	private int id;
	private String name;
	public static  String college ="Đại học bách khoa";
	public static int COUNT =0;
	public static int moneyGroup;
	public Student(String name) {
		super();
		this.id = ++COUNT;
		if (Student.COUNT>7) {
			System.err.println("Không thể thêm nhiều hơn");
		}
		else {
		System.out.println("Nhập tên sinh viên :");
		this.name = ScannerUltis.inputString();
		}
	}
	public static String getCollege() {
		return college;
	}
	public static void setCollege(String college) {
		Student.college = college;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college"+college+"]";
	}
	public Student() {
		super();
		COUNT++;
	}
	
}
