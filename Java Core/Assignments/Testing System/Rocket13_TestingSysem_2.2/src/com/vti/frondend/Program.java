package com.vti.frondend;

import java.time.LocalDate;
import java.util.Scanner;

import com.vti.enity.Account;
import com.vti.enity.Department;
import com.vti.enity.Group;
import com.vti.enity.Position;
import com.vti.enity.Position.PositionName;

public class Program {
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
		
		//WHILE
		// Question 16
		Account[] array1= {acc1,acc2,acc3};
		int i=0;
		while (i<array1.length) {
			System.out.println("Thông tin nhân viên thứ "+(i+1));
			System.out.println("Email :"+array1[i].email);
			System.out.println("Full name :"+array1[i].fullName);
			System.out.println("Phòng ban :"+array1[i].department);
			i++;
		}
		
		Department[] arraydep = {dep1,dep2,dep3};
		int a=0;
		while (a<arraydep.length) {
			System.out.println("DepartmentId :"+arraydep[a].id+"/n DepartmentName :"+arraydep[a].name);
			i++;
		}
		Department[] arraydep1 = {dep1,dep2};
		while (a<arraydep1.length) {
			System.out.println("DepartmentId :"+arraydep[a].id+"/n DepartmentName :"+arraydep[a].name);
			i++;
		}
		Account[] array2= {acc1,acc3};
		while (i<array2.length) {
			System.out.println("Thông tin nhân viên thứ "+(i+1));
			System.out.println("Email :"+array1[i].email);
			System.out.println("Full name :"+array1[i].fullName);
			System.out.println("Phòng ban :"+array1[i].department);
			i++;
		}
		while (i<array1.length) {
			if (array1[i].id <4) {
				System.out.println("Thông tin nhân viên thứ "+(i+1));
				System.out.println("Email :"+array1[i].email);
				System.out.println("Full name :"+array1[i].fullName);
				System.out.println("Phòng ban :"+array1[i].department);
				i++;
			}
		}
		while (i<=20) {
			if (i%2==0) {
				System.out.println("So chan la :"+i);
				i++;
			}
		}
		
		//DO - WHILE
		//Question 17
		Account[] arrayaccount= {acc1,acc2,acc3};
		int z=0;
		do {
			System.out.println("Thông tin nhân viên thứ "+(i+1));
			System.out.println("Email :"+arrayaccount[z].email);
			System.out.println("Full name :"+arrayaccount[z].fullName);
			System.out.println("Phòng ban :"+arrayaccount[z].department);
			i++;
		} while (z<arrayaccount.length);
		
		//
		Department[] arraydep3 = {dep1,dep2,dep3};
		do {
			System.out.println("DepartmentId :"+arraydep3[z].id+"/n DepartmentName :"+arraydep3[z].name);
			i++;
		} while (z<arraydep3.length);
		
		//
		Department[] dep4 = {dep1,dep2};
		do {
			System.out.println("DepartmentId :"+dep4[z].id+"/n DepartmentName :"+dep4[z].name);
			i++;
		} while (z<arraydep3.length);
		
		//
		do {
			if (arrayaccount[z].id <4) {
				System.out.println("Thông tin nhân viên thứ "+(i+1));
				System.out.println("Email :"+arrayaccount[z].email);
				System.out.println("Full name :"+arrayaccount[z].fullName);
				System.out.println("Phòng ban :"+arrayaccount[z].department);
				i++;
			}
			
		} while (z<arrayaccount.length);
		
		//
		do {
			if (z%i==0) {
				System.out.println("So chan la :"+z);
			}
		} while (z<=20);
		
	}
}
