package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.User;
import com.vti.entity.VietnamesePhone;
import com.vti.entity.Waiter;

public class Excercise6 {
	private Scanner sc;

	public Excercise6() {
		sc = new Scanner(System.in);

	}

	public void question1() {
		VietnamesePhone listPhone = new VietnamesePhone();
		while (true) {
			System.out.println("==================================================");
			System.out.println("==================Mời nhập lựa chọn===============");
			System.out.println("==                1.Thêm liên lạc               ==");
			System.out.println("==                2.Xóa liên lạc                ==");
			System.out.println("==                3.Cập nhật liên lạc           ==");
			System.out.println("==                4.Tìm liên lạc                ==");
			System.out.println("==                5.Hiển thị liên lạc           ==");
			System.out.println("==================================================");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				System.out.println("Nhập tên :");
				String name = sc.next();
				System.out.println("Nhập số điện thoại");
				String phone = sc.next();
				listPhone.insertContact(name, phone);
				break;
			case 2:
				System.out.println("Nhập tên liên lạc muốn xóa :");
				sc = new Scanner(System.in);
				String deleteName = sc.nextLine();
				listPhone.removeContact(deleteName);
				break;
			case 3:
				System.out.println("Nhập tên liên lạc cập nhật:");
				String namePhone = sc.next();
				System.out.println("Nhập số điện thoại mới :");
				String phoneNew = sc.next();
				listPhone.updateContact(namePhone, phoneNew);
				break;
			case 4:
				System.out.println("Nhập tên liên lạc cần tìm");
				String searchPhone = sc.next();
				listPhone.searchContact(searchPhone);
				break;
			case 5:
				listPhone.showContact();
				break;
			default:
				System.out.println("Lựa chọn sai hãy chọn lại");
				break;
			}
		}
	}

	public void question2() {
		while (true) {
			System.out.println("==================================================");
			System.out.println("==================Mời nhập lựa chọn===============");
			System.out.println("==                1.Thêm Employee               ==");
			System.out.println("==                2.Thêm Manager                ==");
			System.out.println("==                3.Thêm Waiter                 ==");
			System.out.println("==                4.Thoát chương trình          ==");
			System.out.println("==================================================");
			int choose1 = sc.nextInt();
			switch (choose1) {
			case 1:
				System.out.println("Nhập tên employee :");
				String nameEmployee=sc.next();
				System.out.println("Nhập hệ số lương :");
				double salaryEm=sc.nextDouble();
				Employee em= new Employee(nameEmployee, salaryEm);
				em.displayInfor();
				break;
			case 2:
				System.out.println("Nhập tên employee :");
				String nameManager=sc.next();
				System.out.println("Nhập hệ số lương :");
				double salaryMa=sc.nextDouble();
				Manager ma= new Manager(nameManager, salaryMa);
				ma.displayInfor();
				break;
			case 3:
				System.out.println("Nhập tên employee :");
				String nameWaiter=sc.next();
				System.out.println("Nhập hệ số lương :");
				double salaryWaiter=sc.nextDouble();
				Waiter wa= new Waiter(nameWaiter, salaryWaiter);
				wa.displayInfor();
				break;
			case 4:
				return;
			default:System.out.println("Nhập sai lựa chọn hãy nhập lại");
				break;
			}
		}
	}
}
