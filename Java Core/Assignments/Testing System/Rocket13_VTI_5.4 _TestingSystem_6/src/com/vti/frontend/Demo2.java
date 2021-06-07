package com.vti.frontend;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số thứ nhất :");
		int a = sc.nextInt();
		System.out.println("Nhập số thứ hai :");
		int b = sc.nextInt();
		try {
			System.out.println("Kết quả phép chia là :"+divide(a,b));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static float divide(int a , int b) throws Exception{
		try {
			return a / b;
		} catch (Exception e) {
			throw new Exception();
		}
		
	}

}
