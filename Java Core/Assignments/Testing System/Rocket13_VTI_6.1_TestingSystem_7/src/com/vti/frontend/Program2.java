package com.vti.frontend;

import java.io.File;

import com.vti.ultis.ScannerUltis;

public class Program2 {
	public static void main(String[] args) {
		System.out.println("Nhập đường dẫn :");
		String parthFile=ScannerUltis.inputString();
		File file= new File(parthFile);
		System.out.println(file.exists());
	}
}
