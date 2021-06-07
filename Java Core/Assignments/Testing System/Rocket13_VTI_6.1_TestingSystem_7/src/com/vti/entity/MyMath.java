package com.vti.entity;

public class MyMath {
	public static int max(int a,int b) {
		int max=0;
		if (a<b) {
			max=b;
		}
		return max;
	}
	public static int min(int a,int b) {
		int min=0;
		if (a<b) {
			min=a;
		}
		return min;
	}
	public static int sum(int a,int b) {
		return a+b;
	}
}
