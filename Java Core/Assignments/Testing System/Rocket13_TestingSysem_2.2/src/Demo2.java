import java.sql.Date;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

import javax.xml.crypto.Data;

import com.vti.enity.Account;

public class Demo2 {

	public static void main(String[] args) {
		// Question 1:
		Random rd = new Random();
		int n = rd.nextInt();
		System.out.println(n);
		// Question 2:
		float a = rd.nextFloat();
		System.out.println(a);
		// Question 3
		String[] name = { "A", "B", "C", "F" };
		int random = rd.nextInt(name.length);
		System.out.println("Tên của hs :" + name[random]);
		//Question 4:
		int minday = (int) LocalDate.of(1995,7,24).toEpochDay();
		int maxday = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		long randomInt = minday +rd.nextInt(maxday-minday);
		LocalDate randomDate = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDate);
		//question 5:
		int day1 = (int) LocalDate.now().toEpochDay();
		int day2 = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		long random1 = minday +rd.nextInt(maxday-minday);
		LocalDate randomDate1 = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDate);
	}
}
