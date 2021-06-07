package com.vti.frontend;

import com.vti.ultis.FileUltis;
import com.vti.ultis.IOManager;
import com.vti.ultis.ScannerUltis;

public class Program4 {
	public static void main(String[] args) throws Exception {
		System.out.println("Nhập đường dẫn:");
		String pathFile= ScannerUltis.inputString();
		String content=IOManager.readFile(pathFile);
		System.out.println(content);
	}
}
