package com.vti.entity;

public abstract class User {
	private String name;
	double salaryRatio;
	protected void name() {
	}
	public User(String name, double salaryRatio) {
		super();
		this.name = name;
		this.salaryRatio = salaryRatio;
	}
	public abstract double calculatePay();
	public void  displayInfor() {
		System.out.println("Tên  :"+name);
		System.out.println("Hệ số lương :"+salaryRatio);
		System.out.println("Tiền lương :"+calculatePay());
	}
}
