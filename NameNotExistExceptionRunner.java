package com.exception.handling;

import java.util.Scanner;

class NameNotExistException extends Exception {

	public NameNotExistException(String s) {
		super(s);
	}

}

public class NameNotExistExceptionRunner {

	public static void main(String[] args) {
		String names[] = { "Ankita", "Shreya", "Nikita", "Joycy", "Radhika" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name1 = sc.nextLine();
		try {
			checkNameExist(name1, names);
		} catch (NameNotExistException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void checkNameExist(String name, String[] names) throws NameNotExistException {
		boolean flag = false;
		for (String str : names) {
			if (str.equalsIgnoreCase(name)) {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("Name exist in string array");

		} else {
			throw new NameNotExistException("Name Not Exist Exception");
		}
	}

}
