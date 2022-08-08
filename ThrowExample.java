package com.exception.handling;

import java.util.Scanner;

public class ThrowExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		try {
			validate(age);
		} catch (InvalidAgeException e) {
			System.out.println("Exception occured: " + e);
		}
	}

	static void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Not valid");
		} else {
			System.out.println("You are eligible for voting");
		}

	}

}
