package com.vti.backend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.vti.entity.Journal;
import com.vti.entity.book;
import com.vti.entity.document;
import com.vti.entity.newspaper;

public class Excercise5 {
	private int id=0;
	private Scanner sc;
	ArrayList<document> arraydoc;
	
	public Excercise5() {
		sc= new Scanner(System.in);
		arraydoc= new ArrayList<document>();
	}

	public void question4() {
		System.out.println("================================================================");
		System.out.println("==================Nhập lựa chọn của bạn :=======================");
		System.out.println("== 1.Thêm tài liệu");
		System.out.println("== 2.Xoá tài liệu theo mã tài liệu.");
		System.out.println("== 3.Hiện thị thông tin về tài liệu.");
		System.out.println("== 4.Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
		System.out.println("== 5.Thoát khỏi chương trình.");
		System.out.println("================================================================");
		int choose=sc.nextInt();
		switch (choose) {
		case 1:
			creatdocument();
			break;
		case 2:
			deletedocument();
			break;
		case 3:
			showdocument();
			break;
		case 4:
			searchdocument();
			break;
		case 5:
			return;
		default:System.out.println("Hãy nhập đúng lựa chọn :");
			break;
		}
	}

	private void searchdocument() {
		System.out.println("================================================================");
		System.out.println("==================Nhập lựa chọn của bạn :=======================");
		System.out.println("== 1.Tìm theo sách");
		System.out.println("== 2.Tìm theo báo.");
		System.out.println("== 3.Tìm theo tạp chí.");
		System.out.println("================================================================");
		int choose2=sc.nextInt();
		switch (choose2) {
		case 1:
			for (document document : arraydoc) {
				if(document instanceof book) {
					System.out.println(document);
				}
			}
			break;
		case 2:
			for (document document : arraydoc) {
				if(document instanceof newspaper) {
					System.out.println(document);
				}
			}
			break;
		case 3:
			for (document document : arraydoc) {
				if(document instanceof Journal) {
					System.out.println(document);
				}
			}
			break;
		default:
			break;
		}
	}

	private void showdocument() {
		for (document document : arraydoc) {
			System.out.println(document);
		}
		
	}

	private void deletedocument() {
		System.out.println("Nhập id cần xóa :");
		int numId= sc.nextInt();
		Iterator<document> iterator= arraydoc.iterator();
		if (iterator.hasNext()) {
			document doc= (document) iterator.next();
			if (doc.getId() == numId) {
				arraydoc.remove(doc);
			}
		}
		
	}

	private void creatdocument() {
		System.out.println("================================================================");
		System.out.println("==================Nhập lựa chọn của bạn :=======================");
		System.out.println("== 1.Thêm sách");
		System.out.println("== 2.Thêm báo.");
		System.out.println("== 3.Thêm tạp chí.");
		System.out.println("================================================================");
		int choose1=sc.nextInt();
		switch (choose1) {
		case 1:
			id++;
			System.out.println("Nhập tên nhà xuất bản :");
			String publisherBook =sc.next();
			System.out.println("Nhập số bản phát hành :");
			int releaseBook =sc.nextInt();
			System.out.println("Nhập tên tác giả :");
			String author =sc.next();
			System.out.println("Nhập số trang :");
			int page = sc.nextInt();
			document book= new com.vti.entity.book(id, publisherBook, releaseBook, author, page);
			arraydoc.add(book);
			break;
		case 2:
			id++;
			System.out.println("Nhập tên nhà xuất bản :");
			String publisherPaper =sc.next();
			System.out.println("Nhập số bản phát hành :");
			int releasePaper =sc.nextInt();
			System.out.println("Nhập ngày phát hành :");
			int day = sc.nextInt();
			document newspaper= new com.vti.entity.newspaper(id,publisherPaper, releasePaper,day);
			arraydoc.add(newspaper);
			break;
		case 3:
			id++;
			System.out.println("Nhập tên nhà xuất bản :");
			String publisherJourmal =sc.next();
			System.out.println("Nhập số bản phát hành :");
			int releaseJourmal =sc.nextInt();
			System.out.println("Nhập số phát hành :");
			int issueNumber =sc.nextInt();
			System.out.println("Nhập tháng phát hành :");
			int month = sc.nextInt();
			document Jourmal= new Journal(id, publisherJourmal,releaseJourmal, issueNumber, month);
			arraydoc.add(Jourmal);
			break;
		default:System.out.println("Nhập sai lựa chọn hãy nhập lại");
			break;
		}
	}
}
