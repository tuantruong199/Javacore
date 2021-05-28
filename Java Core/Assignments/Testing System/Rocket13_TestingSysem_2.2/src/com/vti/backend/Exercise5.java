package com.vti.backend;

import java.time.LocalDate;
import java.util.Scanner;

import com.vti.enity.Account;
import com.vti.enity.Group;
import com.vti.enity.Position;
import com.vti.enity.Position.PositionName;

public class Exercise5 {
	Scanner sc = new Scanner(System.in);
	public void question5() {
		System.out.println("Mời nhập id người dùng :");
		int id = sc.nextInt();
		System.out.println("Mời nhập username :");
		sc = new Scanner(System.in);
		String username = sc.nextLine();
		System.out.println("Mời nhập fullname :");
		String fullname1 = sc.nextLine();
		System.out.println("Mời nhập số position 1.DEV 2.TEST 3.ScrumMaster 4.PM");
		int position = sc.nextInt();
		PositionName nameposition = null;
		switch (position) {
		case 1:
			nameposition = Position.PositionName.Dev;
			break;
		case 2:
			nameposition = Position.PositionName.Test;
			break;
		case 3:
			nameposition = Position.PositionName.Scrum_Master;
			break;
		case 4:
			nameposition = Position.PositionName.PM;
			break;
		}
		System.out.println("Thông tin account vừa nhập :");
		System.out.println("Id :" + id);
		System.out.println("Username :" + username);
		System.out.println("Fullname :" + fullname1);
		System.out.println("Postition :" + nameposition);
	}
	public void question6() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập id :");
		int id= sc.nextInt();
		System.out.println("Nhập departmentName :");
		sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Thông tin Department vừa tạo :");
		System.out.println("Id :"+id);
		System.out.println("DepartmentName :"+name);
	}
	public void question9() {
		Scanner sc = new Scanner(System.in);
		// Tạo Group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Testing_System";
		group1.createDate = LocalDate.of(2021, 1, 1);
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Development";
		group2.createDate = LocalDate.of(2020, 2, 1);
		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Sale";
		group3.createDate = LocalDate.of(2019, 9, 23);
		// Tạo Account
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
		Account[] accArray = { acc1, acc2, acc3 };
		Group[] groupArray = { group1, group2, group3 };
		System.out.println("Danh sách User đang có trên hệ thống: ");
		for (int i = 0; i < accArray.length; i++) {
			System.out.println(accArray[i].userName);
		}
		System.out.println("Nhập vào UserName của account: ");
		String userName = sc.next();
		System.out.println("Danh sách Group đang có trên hệ thống: ");
		for (int i = 0; i < accArray.length; i++) {
			System.out.println(groupArray[i].name);
		}
		System.out.println("Nhập vào tên Group cần thêm: ");
		String groupName = sc.next();
		int indexGroup = -1;
		for (int i = 0; i < groupArray.length; i++) {
			if (groupArray[i].name.equals(groupName)) {
				indexGroup = i;
			}
		}
		int indexAccount = -1;
		for (int j = 0; j < accArray.length; j++) {
			if (accArray[j].userName.equals(userName)) {
				indexAccount = j;
			}
		}
		if (indexAccount < 0 || indexGroup < 0) {
			System.out.println("Kiểm tra lại thông tin bạn nhập, không có Account hoặc group này trên hệ thống");
		} else {
			for (int j = 0; j < accArray.length; j++) {
				if (accArray[j].userName.equals(userName)) {
					Group[] gpAdd = { groupArray[indexGroup] };
					accArray[j].groups = gpAdd;
					System.out.println("Bạn vừa Add group: " + accArray[indexAccount].groups[0].name + " cho Account: "
							+ accArray[indexAccount].userName);
				}
			}
		}
	}

	public void question10() {
		System.out.println("Question 8: Viết chương trình thực hiện theo flow");
				Scanner sc = new Scanner(System.in);
				int choose;
				while (true) {
				System.out.println("Mời bạn chọn chức năng: 1. Tạo Account, 2. Tạo Department, 3.Add Group vào Account");
				choose = sc.nextInt();
				if (choose == 1 || choose == 2 || choose == 3) {
				switch (choose) {
				case 1:
				question5();
				break;
				case 2:
				question6();
				break;
				case 3:
				question9();
				break; }
				System.out.println("Bạn có muốn tiếp tục không, hãy chọn Menu, Chọn 0 để thoát chương trình!");
				int ak = sc.nextInt();
				if (ak == 0) {
				System.out.println("Bye!!!");
				return;
				} 
				} else {
				System.out.println("Nhập lại: ");
				} } 
	}
}
