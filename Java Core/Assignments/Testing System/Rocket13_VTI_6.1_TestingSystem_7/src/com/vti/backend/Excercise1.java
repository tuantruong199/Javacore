package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.MyMath;
import com.vti.entity.PrimaryStudent;
import com.vti.entity.SecondaryStudent;
import com.vti.entity.Student;

public class Excercise1 {
	public void question1() {
		Scanner sc= new Scanner(System.in);
		Student student1 = new Student("");
		Student student2 = new Student("");
		Student student3 = new Student("");
		ArrayList<Student> students= new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("Chuyển sinh viên về đại học công nghệ :");
		for (Student student : students) {
			student.college="đại học công nghệ";
			System.out.println(student);
		}
		System.out.println("Số tiền trong quỹ :"+(Student.moneyGroup+=300));
		System.out.println(" Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan :");
		System.out.println("Số tiền trong quỹ :"+(Student.moneyGroup-=50));
		System.out.println(" Student thứ 2 lấy 20k đi mua bánh mì");
		System.out.println("Số tiền trong quỹ :"+(Student.moneyGroup-=20));
		System.out.println("Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm :");
		System.out.println("Số tiền trong quỹ :"+(Student.moneyGroup-=150));
		System.out.println(" cả nhóm mỗi người lại đóng quỹ mỗi người 50k :");
		System.out.println("Số tiền trong quỹ :"+(Student.moneyGroup+=150));
		System.out.println("Queston 4:");
		System.out.println("Nhập tên trường đại học thay đổi :");
		Student st= new Student();
		System.out.println("College là:"+st.college);
		System.out.println("Nhập tên trường muốn thay đổi :");
		String name=sc.next();
		System.out.println("Thay đổi college :"+name);
		st.setCollege(name);
		System.out.println("College là :"+st.getCollege());
	}
	public void question2() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập số thứ nhất :");
		int a=sc.nextInt();
		System.out.println("Nhập số thứ hai :");
		int b=sc.nextInt();
		System.out.println("Max :"+MyMath.max(a, b));
		System.out.println("Min :"+MyMath.min(a, b));
		System.out.println("Sum :"+MyMath.sum(a, b));
	}
	public void queston5() {
		System.out.println("Dùng for khởi tạo sinh viên :");
		for (int i = 0; i <3; i++) {
			System.out.println("Sinh viên "+(i+1));
			Student st = new Student();
		}
		System.out.println("Sử dụng hàm khởi tạo để tạo sinh viên :");
		Student st2 = new Student();
		Student st3 = new Student();
		System.out.println("Số sinh viên là:"+Student.COUNT);
	}
	public void question6() {
		System.out.println("Tạo sinh viên PrimaryStudent");
		PrimaryStudent Pst1= new PrimaryStudent();
		PrimaryStudent Pst2= new PrimaryStudent();
		System.out.println("Tạo sinh viên SecondStudent");
		SecondaryStudent Sst1= new SecondaryStudent();
		SecondaryStudent Sst2= new SecondaryStudent();
		SecondaryStudent Sst3= new SecondaryStudent();
		SecondaryStudent Sst4= new SecondaryStudent();
		System.out.println("Số sinh viên :"+Student.COUNT);
		System.out.println("PrimaryStudent :"+PrimaryStudent.COUNTPri);
		System.out.println("SecondaryStudent :"+SecondaryStudent.COUNTSec);
	}
	
}
