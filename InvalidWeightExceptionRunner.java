package com.exception.handling;

import java.util.Scanner;

class InvalidWeightException extends Exception {

	public InvalidWeightException(String s) {
		super(s);
	}

}

public class InvalidWeightExceptionRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product weight: ");
		double weight = sc.nextDouble();
		try {
			checkWeight(weight);
		} catch (InvalidWeightException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void checkWeight(double weight) throws InvalidWeightException {
		if (weight < 100) {
			throw new InvalidWeightException("Invalid Product Weight Exception");
		} else {
			System.out.println("Valid weight: " + weight);
		}
	}

}
