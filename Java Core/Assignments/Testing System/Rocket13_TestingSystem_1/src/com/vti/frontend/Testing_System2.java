package com.vti.frontend;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

import com.vti.enity.Account;
import com.vti.enity.Answer;
import com.vti.enity.CategoryQuestion;
import com.vti.enity.Department;
import com.vti.enity.Exam;
import com.vti.enity.Group;
import com.vti.enity.GroupAccount;
import com.vti.enity.Positition;
import com.vti.enity.Question;
import com.vti.enity.TypeQuestion;
import com.vti.enity.Positition.PosititionName;
import com.vti.enity.TypeQuestion.typeName;

public class Testing_System2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dep1 = new Department(); /* TODO new Department() is ham khởi tạo rỗng */
		dep1.id =1;
		dep1.name = "Sale";
		Department dep2 = new Department();
		dep2.id=2;
		dep2.name="Services";
		Department dep3 = new Department();
		dep3.id=3;
		dep3.name="Training";
		
		Positition pos1= new Positition();
		pos1.id=1;
		pos1.name = PosititionName.DEV;
		Positition pos2 = new Positition();
		pos2.id= 2;
		pos2.name = PosititionName.PM;
		Positition pos3 = new Positition();
		pos3.id = 3;
		pos3.name= PosititionName.SCRUM_MASTER;
		Positition pos4 = new Positition();
		pos4.id = 4;
		pos4.name= PosititionName.TEST;
		
		
		Account acc1 = new Account();
		acc1.id=1;
		acc1.email="tuan@gmail.com";
		acc1.userName ="tuan";
		acc1.fullName ="truongtuan";
		acc1.departmentId = dep1;
		acc1.posititionId=pos1;
		acc1.createDate = LocalDateTime.of(2020,3,29, 01,00,00);
		
		
		Account acc2 = new Account();
		acc2.id=2;
		acc2.email="abc@gmail.com";
		acc2.userName ="abc";
		acc2.fullName ="abc";
		acc2.departmentId = dep2;
		acc2.posititionId=pos2;
		acc2.createDate = LocalDateTime.now();
		
		
		Account acc3 = new Account();
		acc3.id =3;
		acc3.email ="tdz@gmail.com";
		acc3.userName ="tdz01";
		acc3.fullName ="tdz001";
		acc3.departmentId=dep3;
		acc3.posititionId = pos4;
		acc3.createDate = LocalDateTime.of(2021, 03, 19 , 00,00,00);
		
		
		Group group1 = new Group();
		group1.id=1;
		group1.name ="Chat with love";
		group1.creator = acc1;
		group1.createDate= LocalDateTime.now();
		Group group2 = new Group();
		group2.id=2;
		group2.name ="Management";
		group2.creator = acc1;
		group2.createDate= LocalDateTime.now();
		Group group3 = new Group();
		group3.id = 3;
		group3.name ="Vi Ti Ai";
		group3.creator = acc2;
		group3.createDate= LocalDateTime.now();
		
		Group[] groupAcc1 = {group1,group2};
		acc1.groups = groupAcc1;
		Group[] groupAcc2 = {group1,group2};
		acc2.groups = groupAcc2;
		Group[] groupAcc3 = {group3};
		acc3.groups =groupAcc3;
		
		GroupAccount grAcc1 = new GroupAccount();
		Account[] accounts = { acc1, acc2 };
		group1.accounts = accounts;
		grAcc1.joinDate = LocalDateTime.now();
		
		TypeQuestion type1 = new TypeQuestion();
		type1.id = 1;
		type1.name =typeName.ESSAY;
		TypeQuestion type2 = new TypeQuestion();
		type2.id = 2;
		type2.name =typeName.MULTIPLE_CHOICE;
		
		CategoryQuestion cate1 = new CategoryQuestion();
		cate1.id = 1;
		cate1.name ="Java";
		CategoryQuestion cate2 = new CategoryQuestion();
		cate2.id = 2;
		cate2.name ="SQL";
		CategoryQuestion cate3 = new CategoryQuestion();
		cate3.id = 3;
		cate3.name ="Net";
		
		Question ques1 = new Question();
		ques1.id = 1;
		ques1.content ="Question Java";
		ques1.category = cate1;
		ques1.type = type1;
		ques1.creator = acc1;
		ques1.createDate = LocalDate.now();
		Question ques2 = new Question();
		ques2.id = 2;
		ques2.content ="Question Sql";
		ques2.category = cate1;
		ques2.type = type1;
		ques2.creator = acc1;
		ques2.createDate = LocalDate.now();
		Question ques3 = new Question();
		ques3.id = 3;
		ques3.content ="Question NET";
		ques3.category = cate1;
		ques3.type = type2;
		ques3.creator = acc2;
		ques3.createDate = LocalDate.now();
		
		Answer ans1 = new Answer();
		ans1.id=1;
		ans1.content ="Answer Java";
		ans1.question=ques1;
		ans1.isCorrect =true;
		Answer ans2 = new Answer();
		ans2.id=2;
		ans2.content ="Answer SQL";
		ans2.question=ques2;
		ans2.isCorrect =true;
		Answer ans3 = new Answer();
		ans3.id=3;
		ans3.content ="Answer NET";
		ans3.question=ques3;
		ans3.isCorrect =true;
		
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code ="VTI 1";
		exam1.title ="Exam 1";
		exam1.category=cate1;
		exam1.duration= 60;
		exam1.creator =acc1;
		exam1.createDate= LocalDateTime.now();
		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code ="VTI 2";
		exam2.title ="Exam 3";
		exam2.category=cate2;
		exam2.duration= 60;
		exam2.creator =acc1;
		exam2.createDate= LocalDateTime.now();
		Exam exam3 = new Exam();
		exam3.id = 1;
		exam3.code ="VTI 3";
		exam3.title ="Exam 3";
		exam3.category=cate2;
		exam3.duration= 60;
		exam3.creator =acc1;
		exam3.createDate= LocalDateTime.now();


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
		// Question 4
		System.out.println(acc2.posititionId == pos1 ? "Đây là Developer"
				: "Người này không phải là Developer");
		
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
		int account2 = acc2.groups.length;
		switch (account2) {
		case 1:
			System.out.println("Group của nhân viên \r\n" + "này là Java Fresher, C# Fresher");
			break;
		case 2:
			System.out.println("Group của nhân viên \r\n" + "này là Java Fresher, C# Fresher");
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		case 4:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
		default:System.out.println("Nhan vien chua co group");
			break;
		}
		//Question 7
		int posi =acc2.posititionId.id;
		switch (posi) {
		case 1:
			System.out.println("Đây là Developer");
			break;
		default:System.out.println("Người này không phải là Developer");
			break;
		}
		
		//Question 8:
		Account[] arrayAccount1= {acc1,acc2,acc3};
		for (Account account : arrayAccount1) {
			System.out.println("Email :"+account.email+"\nFullname :"+account.fullName+"\n Department :"+account.departmentId);
		}
		// Question 9:
		Department[] arraydepartment={dep1,dep2,dep3};
		for (Department department : arraydepartment) {
			System.out.println("DepartmentID :"+department.id+"\n Name :"+department.name);
		}
		// Question 10:
		Account[] arrayAccount = {acc1,acc2};
		for(int i=0;i<arrayAccount.length;i++)
		{
			System.out.println("Thong tin nhan vien thu "+(i+1));
			System.out.println("Email :"+arrayAccount[i].email);
			System.out.println("Fullname :"+arrayAccount[i].fullName);
			System.out.println("Department :"+arrayAccount[i].departmentId.name);
		}
		//Question 11:
		for (int i = 0; i < arraydepartment.length; i++) {
			System.out.println("DepartmentID :"+arraydepartment[i].id+"\n Name :"+arraydepartment[i].name);
		}
		//Question 12
		Department[] arraydep = {dep1,dep2};
		for (int i = 0; i < arraydep.length; i++) {
			System.out.println("DepartmentID :"+arraydepartment[i].id+"\n Name :"+arraydepartment[i].name);
		}
		//Question 13:
		for (int i= 0;i<arrayAccount1.length;i++) {
			if (arrayAccount1.length == 1) {
				continue;
			}
			else {
				System.out.println("Email1 :"+arrayAccount1[i].email+"\nFullname :"+arrayAccount1[i].fullName+"\n Department :"+arrayAccount1[i].departmentId);
			}
		}
		// Question 14:
		for (int i= 0;i<arrayAccount1.length;i++)
		{
			if(arrayAccount1.length <4)
			{
				System.out.println("Email1 :"+arrayAccount1[i].email+"\nFullname :"+arrayAccount1[i].fullName+"\n Department :"+arrayAccount1[i].departmentId);
			}
		}
		// Question 15
		for(int i=0 ;i<=20;i++)
		{
			if (i%2==0) {
				System.out.println("So chan la :"+i);			}
		}
		
		
	}

}
