package com.exception.handling;

public class ArrayIndexOutOfBoundExceptionEx {

	public static void main(String[] args) {
		try {
			int arr[] = { 1, 2, 3, 4 };
			arr[9] = 9;
			System.out.println(arr[9]);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
