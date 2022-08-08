package com.exception.handling;
public class ArithmaticExceptionExample {

	public static void main(String[] args) {
		try {
			int a = 30, b = 0;
			int c = a / b;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("In finally blocked");
		}
	}

}
