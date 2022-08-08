package com.exception.handling;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println("Length of string: " + str.length());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
