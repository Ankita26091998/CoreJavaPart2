package com.oops.project;

abstract class MyCalculation {
	public abstract void calculate(double num);
}

class Square extends MyCalculation {

	@Override
	public void calculate(double num) {
		double square = num * num;
		System.out.println("Square of number: " + square);
	}

}

class SquareRoot extends MyCalculation {

	@Override
	public void calculate(double num) {
		double squareRoot = Math.sqrt(num);
		System.out.println("Squareroot of number: " + squareRoot);

	}

}

public class AbstractionClassDemo {

	public static void main(String[] args) {
		// referance //creating object of Square
		MyCalculation m1 = new Square();
		m1.calculate(12);
		// referance //creating object of SquareRoot
		MyCalculation m2 = new SquareRoot();
		m2.calculate(36);
	}

}
