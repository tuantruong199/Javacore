package com.vti.backend;

import java.time.LocalDate;

import com.vti.enity.Account;
import com.vti.enity.Group;

public class Excercise6 {
	public void question1() {
		for (int i = 0; i < 10; i++) {
			if(i%2==0) {
				System.out.println("Số chẵn nguyên dương nhỏ hơn 10:"+i);
			}
		}

	}
	public void question2() {
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "daonq1";
		acc1.userName = "daonq1";
		acc1.fullName = "Dao Nguyen 1";
		acc1.createDate = LocalDate.now();
		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "daonq2";
		acc2.userName = "daonq2";
		acc2.fullName = "Dao Nguyen 2";
		acc2.createDate = LocalDate.of(2021, 03, 17);
		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "daonq3";
		acc3.userName = "daonq3";
		acc3.fullName = "Dao Nguyen 3";
		acc3.createDate = LocalDate.now();
		
		Account[] arrayaccount = {acc1,acc2,acc3};
		System.out.println("Thông tin account :");
		for (Account account : arrayaccount) {
			System.out.println("ID :"+account.id);
			System.out.println("Email :"+account.email);
			System.out.println("username :"+account.userName);
			System.out.println("Fullname :"+account.fullName);
			System.out.println("Createdate :"+account.createDate);
			
		}
	}
	public void question3() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Số nguyên dương nhỏ hơn 10:"+i);
		}
		
	}
}
