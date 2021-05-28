package com.vti.frondend;

import java.util.Scanner;

import com.vti.enity.Account;
import com.vti.enity.Position;
import com.vti.enity.Position.PositionName;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Nhap so thu nhat :");
		int num1 =scan.nextInt();
		System.out.println("Nhap so thu 2 :");
		int num2 =scan.nextInt();
		System.out.println("Nhap so thu 3 :");
		int num3 =scan.nextInt();
		System.out.println(num1+" "+num2+" "+num3);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào thông tin account cân tạo: ");
		Account acc = new Account();
		System.out.println("Nhập ID: ");
		acc.id = sc.nextInt();
		System.out.println("Nhập email: ");
		acc.email = sc.next();
		System.out.println("Nhập userName: ");
		acc.userName = sc.next();
		System.out.println("Nhập fullName: ");
		acc.fullName = sc.next();

		System.out
				.println("Nhập position (Nhập các số từ 1 đến 4 tương ứng với: 1.Dev, 2.Test, 3.Scrum_Master, 4.PM): ");

		int posNum = sc.nextInt();

		switch (posNum) {
		case 1:
			Position pos1 = new Position();
			pos1.name = PositionName.Dev;

			acc.position = pos1;
			break;
		case 2:
			Position pos2 = new Position();
			pos2.name = PositionName.Test;
			acc.position = pos2;
			break;
		case 3:
			Position pos3 = new Position();
			pos3.name = PositionName.Scrum_Master;
			acc.position = pos3;
			break;
		case 4:
			Position pos4 = new Position();
			pos4.name = PositionName.PM;
			acc.position = pos4;
			break;
		}

		System.out.println("Thông tin Acc vừa nhập, ID: " + acc.id + " Email: " + acc.email + " UserName: "
				+ acc.userName + " FullName: " + acc.fullName + " Position: " + acc.position.name);
	}

}
