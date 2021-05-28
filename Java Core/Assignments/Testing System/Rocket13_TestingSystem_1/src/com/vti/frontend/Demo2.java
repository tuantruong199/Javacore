package com.vti.frontend;

import java.time.LocalDateTime;

import javax.sql.rowset.serial.SQLOutputImpl;

import com.vti.enity.Account;
import com.vti.enity.Department;
import com.vti.enity.Group;
import com.vti.enity.Positition;
import com.vti.enity.Positition.PosititionName;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dep1 = new Department(); /* TODO new Department() is ham khởi tạo rỗng */
		dep1.id = 1;
		dep1.name = "Sale";
		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Development";

		Positition pos1 = new Positition();
		pos1.id = 1;
		pos1.name = PosititionName.DEV;
		Positition pos2 = new Positition();
		pos2.id = 2;
		pos2.name = PosititionName.PM;
		Positition pos3 = new Positition();
		pos3.id = 3;
		pos3.name = PosititionName.SCRUM_MASTER;
		Positition pos4 = new Positition();
		pos4.id = 4;
		pos4.name = PosititionName.TEST;

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Testing System";
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Test";

		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "tuan@gmail.com";
		acc1.userName = "tuan";
		acc1.fullName = "truongtuan";
		acc1.departmentId = dep1;
		acc1.posititionId = pos1;
		acc1.createDate = LocalDateTime.of(2020, 3, 29, 01, 00, 00);
		Group[] groupAcc1 = { group1, group2 };
		acc1.groups = groupAcc1;

		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "abc@gmail.com";
		acc2.userName = "abc";
		acc2.fullName = "abc";
		acc2.departmentId = dep2;
		acc2.posititionId = pos2;
		acc2.createDate = LocalDateTime.now();
		Group[] groupAcc2 = { group1, group2 };
		acc2.groups = groupAcc2;


		// Question1
		System.out.println("Question 1:");
		if (acc2.departmentId == null) {
			System.out.println("Nhan vien chua co phong ban");
		} else {
			System.out.println("Phong ban cua nhan vien la :" + acc1.departmentId.name);
		}

		// Question2
		System.out.println("Question 2:");
		if (acc2.groups == null) {
			System.out.println("Nhan vien chua co group");
		} else {
			int countAccgroup;
			countAccgroup = acc2.groups.length;
			if (countAccgroup == 1 || countAccgroup == 2) {
				System.out.println("Group của nhân viên \r\n" + "này là Java Fresher, C# Fresher");
			}
			if (countAccgroup == 3) {
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			}
			if (countAccgroup == 4) {
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			}
		}
		// Question 3
		System.out.println(acc2.departmentId == null ? "Nhan vien chua co phong ban"
				: "Phong ban cua nhan vien " + acc2.departmentId.name);

		// QUestion5
		if (group1.accounts == null) {
			System.out.println("Nhom khong co thanh vien");
		}
		int countAcc = group1.accounts.length;
		switch (countAcc) {
		case 1:
			System.out.println("Nhom co 1 thanh vien");
			break;
		case 2:
			System.out.println("Nhom co 2 thanh vien");
			break;
		case 3:
			System.out.println("Nhom co 3 thanh vien");
			break;
		default:
			System.out.println("Nhom co nhieu thanh vien");
			break;
		}
		//Quetion6
		Account[] arrayAccount = {acc1,acc2};
		for(int i=0;i<arrayAccount.length;i++)
		{
			System.out.println("Thong tin nhan vien thu "+(i+1));
			System.out.println("Email :"+arrayAccount[i].email);
			System.out.println("Fullname :"+arrayAccount[i].fullName);
			System.out.println("Department :"+arrayAccount[i].departmentId.name);
		}
	}

}
