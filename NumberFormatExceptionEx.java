package com.exception.handling;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		try {
			String str = "abc";
			int a = Integer.parseInt(str);
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
