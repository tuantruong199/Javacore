package com.vti.frontend;

import java.util.ArrayList;

import com.vti.entity.Account1;

public class Demo3 {
public static void main(String[] args) {
	Account1 acc1 = new Account1(1, "abc@gmail.com", "abc", "xyz");
	// System.out.println(acc1.id+" "+acc1.email+" "+acc1.fullName);
	Account1 acc2= new Account1();
	acc2.setId(2);
	acc2.setEmail("dsadb@dashd.com");
	acc2.setFirtName("anhanh");
	acc2.setLastName("bddd");
	acc2.setFullName("anhanh bddd");
	// System.out.println(acc2.id+" "+acc2.email+" "+acc2.fullName);
	//System.out.println("Thong tin account 1 :"+acc1.toString());
	//System.out.println("Thong tin account 2:"+acc2.toString());
	System.out.println("Su dung array :");
	Account1[] arrays = new Account1[3];
	arrays[0]=acc1;
	arrays[1]=acc2;
	System.out.println(arrays.toString());
	System.out.println("Su dung ArrayList");
	ArrayList<Account1> arraylistAccount = new ArrayList<Account1>();
	arraylistAccount.add(acc1);
	arraylistAccount.add(acc2);
	for (Account1 account1 : arraylistAccount) {
		System.out.println(account1.toString());
	}
}
}
