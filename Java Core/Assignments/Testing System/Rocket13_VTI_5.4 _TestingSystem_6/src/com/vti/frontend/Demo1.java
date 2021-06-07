package com.vti.frontend;

public class Demo1 {
	public static void main(String[] args) {
		try {
			float result = divide(7, 0);
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("cannot divide 0");
		}
		System.out.println("divide completed!");
	}

	private static float divide(int a, int b) {
		return a / b;
	}
}
