package com.oops.project;

public class ImplicitandExplicitTypeConversion {

	public static void main(String[] args) {
		System.out.println("Implicit/Widening type conversion:");
		byte b = 10;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		System.out.println("byte value: " + b);
		System.out.println("short value: " + s);
		System.out.println("int value: " + i);
		System.out.println("long value: " + l);
		System.out.println("float value: " + f);
		System.out.println("double value: " + d);

		System.out.println("Explicit/Narrowing type conversion:");
		double d1 = 23.45;
		float f1 = (float) d1;
		long l1 = (long) f1;
		int i1 = (int) l1;
		short s1 = (short) i1;
		byte b1 = (byte) s1;
		System.out.println("double value: " + d1);
		System.out.println("float value: " + f1);
		System.out.println("long value: " + l1);
		System.out.println("int value: " + i1);
		System.out.println("short value: " + s1);
		System.out.println("byte value: " + b1);
	}

}
