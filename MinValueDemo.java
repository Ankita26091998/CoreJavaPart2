package com.oops.project;

class MinValueDemo1 {
	public static int minFunction(int n1, int n2) {
		int min = 0;
		if (n1 > n2) {
			min = n2;
		} else {
			min = n1;
		}
		return min;
	}

	public static double minFunction(double n3, double n4) {
		double min = 0.0;
		if (n3 > n4) {
			min = n4;
		} else {
			min = n3;
		}
		return min;
	}
}

public class MinValueDemo {
	public static void main(String[] args) {
		int n1 = 15, n2 = 17;
		double n3 = 94.5, n4 = 68.3;
		int result1 = MinValueDemo1.minFunction(n1, n2);
		double result2 = MinValueDemo1.minFunction(n3, n4);
		System.out.println("Result1 is:" + result1);
		System.out.println("Result2 is:" + result2);

	}
}
