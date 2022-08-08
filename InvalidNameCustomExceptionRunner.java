package com.exception.handling;

import java.util.Scanner;

class InvalidNameException extends Exception {

	public InvalidNameException(String s) {
		super(s);
	}

}

public class InvalidNameCustomExceptionRunner {

	public static void main(String[] args) {
		InvalidNameCustomExceptionRunner obj = new InvalidNameCustomExceptionRunner();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your FirstName: ");
		String firstName = sc.nextLine();
		System.out.println("Enter your LastName: ");
		String lastName = sc.nextLine();
		try {
			obj.printFullName(firstName, lastName);
		} catch (InvalidNameException e) {
			System.err.println(e.getMessage());
		}
	}

	public void printFullName(String firstName, String lastName) throws InvalidNameException {
		if (firstName.isEmpty() || lastName.isEmpty()) {
			throw new InvalidNameException("Invalid Name Exception");
		} else {
			System.out.println("FirstName: " + firstName + ", LastName: " + lastName);

		}
	}

}
