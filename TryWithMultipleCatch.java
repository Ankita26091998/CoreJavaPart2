package com.exception.handling;

public class TryWithMultipleCatch {

	public static void main(String[] args) {
		try {

//			int arr[] = { 1, 2, 3, 4 };
//			arr[9] = 9 / 3;
			String str = null;
			System.out.println("Length of string: " + str.length());

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);

		} catch (NullPointerException e) {
			System.out.println(e);

		} catch (ArithmeticException e) {
			System.out.println(e);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("In finally blocked");

		}

	}

}
