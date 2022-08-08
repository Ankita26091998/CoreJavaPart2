package com.oops.project;

import java.util.Scanner;

public class DigitFactorial {
	int factorial[];

	public void digitfactorial(int num) {
		String str = Integer.toString(num);
		factorial = new int[str.length()];
		if (num > 32767) {
			System.out.println("Number is too large");
		} else if (num < 0) {
			System.out.println("Number is too small");
		} else {
			int rem, i = 0;
			while (num > 0) {
				rem = num % 10;
				num /= 10;
				factorial[i] = fact(rem);
				i++;
			}

			for (i = str.length() - 1; i >= 0; i--) {
				System.out.println(factorial[i]);
			}
		}
	}

	public int fact(int rem) {
		int i, fact = 1;
		for (i = 1; i <= rem; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DigitFactorial d = new DigitFactorial();
		System.out.println("Enter a user input :");
		int num = sc.nextInt();
		d.digitfactorial(num);
		sc.close();
	}

}
