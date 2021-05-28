package com.vti.frondend;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import com.vti.enity.Account;
import com.vti.enity.Department;
import com.vti.enity.Group;
import com.vti.enity.Position;
import com.vti.enity.Position.PositionName;

public class Demo5 {
	public static void main(String[] args) {
		// Tạo Department
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Marketing";
		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Sale";
		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "BOD";
		// Tạo Position
		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.Dev;
		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = PositionName.PM;
		Position pos3 = new Position();
		pos3.id = 3;
		pos3.name = PositionName.Scrum_Master;
		// Tạo Group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Testing System";
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Development";
		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Sale";
		// Tạo Account
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "daonq1";
		acc1.userName = "daonq1";
		acc1.fullName = "Dao Nguyen 1";
		acc1.department = dep1;
		acc1.position = pos1;
		acc1.createDate = LocalDate.now();
		Group[] groupAcc1 = { group1, group2 };
		acc1.groups = groupAcc1;
		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "daonq2";
		acc2.userName = "daonq2";
		acc2.fullName = "Dao Nguyen 2";
		acc2.department = dep2;
		acc2.position = pos2;
		acc2.createDate = LocalDate.of(2021, 03, 17);
		acc2.groups = new Group[] { group3, group2 };
		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "daonq3";
		acc3.userName = "daonq3";
		acc3.fullName = "Dao Nguyen 3";
		acc3.department = dep3;
		acc3.position = pos3;
		acc3.createDate = LocalDate.now();
		// Exercise 2
		// Question 1:Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in
		// ra số nguyên đó
		int num = 5;
		System.out.printf("Number :" + num);

		// Question 2:Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out
		// printf để in ra số nguyên đó thành định dạng như sau: 100,000,000
		int a = 100000000;
		System.out.printf(Locale.US, "\n%,d%n", a);

		// Question 3:Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để
		// in ra số thực đó chỉ bao gồm 4 số đằng sau
		float b;
		b = 5.567098f;
		System.out.printf(Locale.US, "\n%.4f%n", b);

		// Question 4:Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó
		// theo định
		// dạng như sau:
		// Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
		// Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.

		System.out.println("Question 4:");
		String s = "Trương Văn Tuấn";
		System.out.println("Tên tôi là :" + s + " và tôi độc thân");

		// Question 5:Lấy thời gian bây giờ và in ra theo định dạng sau:
		// 24/04/2020 11h:16p:20s
		System.out.println("Question 5:");
		Calendar c = Calendar.getInstance();
		System.out.println(
				"//" + c.get(Calendar.DAY_OF_MONTH) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR) + " "
						+ c.get(Calendar.HOUR) + "h:" + c.get(Calendar.MINUTE) + "p:" + c.get(Calendar.SECOND) + "s");

		// Question 6:In ra thông tin account (như Question 8 phần FOREACH) theo định
		// dạng
		// table (giống trong Database)
		System.out.println("Question 6:");
		Account[] arrayAccount1 = { acc1, acc2, acc3 };
		for (Account account : arrayAccount1) {
			System.out.println("-----------Email-----------Fullname-----------Department-----------");
			System.out.println("-            -                -                   -               -");
			System.out.println("-            -                -                   -               -");
			System.out.println("-----------" + account.email + "---------" + account.fullName + "-----------"
					+ account.department.name+"--------");
		}

		// Exercise 4 (Optional): Random Number
		// Question 1:
		// In ngẫu nhiên ra 1 số nguyên
		System.out.println("Question 1:");
		Random random = new Random();
		int a1 = random.nextInt();
		System.out.println(a1);
		// Question 2:In ngẫu nhiên ra 1 số thực
		System.out.println("Question 2:");
		float c1 = random.nextFloat();
		System.out.println(c1);
		// Question 3:
		String[] name = { "A", "B", "C", "D" };
		int na = random.nextInt(name.length);
		System.out.println("Question 3:");
		System.out.println("Name random :" + name[na]);

		// Question 4:Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày
		// 20-12-1995
		int daymin = (int) LocalDate.of(1995, 07, 24).toEpochDay();
		int daymax = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		int day = daymin + random.nextInt(daymax - daymin);
		LocalDate datetime = LocalDate.ofEpochDay(day);
		System.out.println("Question 4");
		System.out.println("Day random:" + datetime);

		// Question 5:Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
		int daymax1 = (int) LocalDate.now().toEpochDay();
		int daymin1 = (int) LocalDate.of(2020, 5, 26).toEpochDay();
		long day1 = daymin1 + random.nextInt(daymax1 - daymin1);
		LocalDate datetime1 = LocalDate.ofEpochDay(day1);
		System.out.println("Question 5");
		System.out.println("Day random :" + datetime1);

		// Question 6:
		int daymax2 = (int) LocalDate.now().toEpochDay();
		int daymin2 = (int) LocalDate.of(1964, 9, 06).toEpochDay();
		long day2 = daymin2 + random.nextInt(daymax2 - daymin2);
		LocalDate datetime2 = LocalDate.ofEpochDay(day2);
		System.out.println("Question 6");
		System.out.println("Day random :" + datetime2);

		// Question 7:
		int number = random.nextInt(999 - 100 + 1) + 100;
		System.out.println(number);
		// Exercise 5: Input from console
		// Question 1:
		System.out.println("Question 1:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số dương thứ nhất :");
		int numint1 = sc.nextInt();
		System.out.println("Nhập số dương thứ hai :");
		int numint2 = sc.nextInt();
		System.out.println("Nhập số dương thứ ba :");
		int numint3 = sc.nextInt();
		System.out.println("Bạn vừa nhập vào ba số nguyên là :" + numint1 + numint2 + numint3);
		// Question 2:
		System.out.println("Question 2:");
		System.out.println("Nhập số thực thứ nhất :");
		float numFloat1 = sc.nextFloat();
		System.out.println("Nhập số thực thứ hai :");
		float numFloat2 = sc.nextFloat();
		System.out.println("Bạn vừa nhập vào hai số thực là :" + numFloat1 + numFloat2);
		// Question 3:
		System.out.println("Question 3:");
		System.out.println("Nhập họ và tên :");
		sc = new Scanner(System.in);
		String fullname = sc.nextLine();
		System.out.println("Học và tên của bạn là :" + fullname);
		// Question 4:
		System.out.println("Question 4:");
		System.out.println("Mời nhập năm sinh :");
		int year = sc.nextInt();
		System.out.println("Mời nhập tháng sinh :");
		int month = sc.nextInt();
		System.out.println("Mời nhập ngày sinh :");
		int daybirth = sc.nextInt();
		LocalDate birthday = (LocalDate) LocalDate.of(year, month, daybirth);
		System.out.println("Ngày sinh của bạn :" + birthday);

		// Question 8:
		System.out.println("Question 8:");
		System.out.println("===================================================");
		System.out.println("========Mời bạn nhập chức năng muốn sử dụng========");
		System.out.println("1.Tạo account");
		System.out.println("2.Tạo department");
		System.out.println("===================================================");
		int choose = sc.nextInt();
		switch (choose) {
		case 1:
			System.out.println("Mời bạn nhập id:");
			int id1 = sc.nextInt();
			System.out.println("Mời bạn nhập username :");
			String username1 = sc.next();
			System.out.println("Mời bạn nhập fullname");
			String fullname2 = sc.next();
			System.out.println("Mời bạn nhập position : 1.Dev 2.Test 3.ScrumMaster 4.PM");
			int numpotiion = sc.nextInt();
			PositionName namepos = null;
			switch (numpotiion) {
			case 1:
				namepos = Position.PositionName.Dev;
				break;

			case 2:
				namepos = Position.PositionName.Test;
				break;
			case 3:
				namepos = Position.PositionName.Scrum_Master;
				break;
			case 4:
				namepos = Position.PositionName.PM;
				break;
			}
			System.out.println("Thoong tin account vừa tạo :");
			System.out.println("Id: " + id1);
			System.out.println("Username :" + username1);
			System.out.println("Fullname :" + fullname2);
			System.out.println("Positition :" + namepos);
			break;
		case 2:
			System.out.println("Nhập id :");
			int iddep = sc.nextInt();
			System.out.println("Nhập departmentName :");
			sc = new Scanner(System.in);
			String namedep = sc.nextLine();
			System.out.println("Thông tin Department vừa tạo :");
			System.out.println("Id :" + iddep);
			System.out.println("DepartmentName :" + namedep);
			break;
		default:
			System.out.println("Mời nhập lại lựa chọn :");
			break;
		}
	}
	public void question7() {
		// Question 7:
		Scanner sc1= new Scanner(System.in);
				System.out.println("Question 7:");
				while (true) {
					System.out.println("Hãy nhập vào 1 số chẵn: ");
					int a = sc1.nextInt();
					if (a % 2 == 0) {
					System.out.println("Bạm vừa nhập vào:" + a);
					return;
					} else {
					System.out.println("Nhập sai, đây không phải là số chẵn");
					} 
					}
	}
}
