package com.vti.frontend;

import com.vti.ultis.FileUltis;
import com.vti.ultis.ScannerUltis;

public class Program3 {
	public static void main(String[] args) throws Exception {
		System.out.println("Nhập đường dẫn");
		String path=ScannerUltis.inputString();
		String name=ScannerUltis.inputString();
		String[] file = FileUltis.getAllFileName(path);
		for (String string : file) {
			System.out.println(string);
		}
	}
}
