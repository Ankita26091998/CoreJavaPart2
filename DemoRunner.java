package com.oops.project;

class Shape {
	void getArea() {
	}
}

class Circle extends Shape {
	void getArea() {
		double r = 5;
		double area1 = 3.14 * r * r;
		System.out.println("In Circle class: " + "Area of circle is: " + area1);
	}
}

class Rectangle extends Shape {
	void getArea() {
		int l = 9;
		int b = 10;
		int area2 = l * b;
		System.out.println("In Rectangle class: " + "Area of rectangle is: " + area2);
	}
}

class Triangle extends Shape {
	void getArea() {
		int b = 3, h = 4;
		double area3 = 0.5 * (b * h);
		System.out.println("In Triangle class: " + "Area of triangle is: " + area3);
	}
}

public class DemoRunner {

	public static void main(String[] args) {
		Circle a1 = new Circle();
		a1.getArea();
		Rectangle a2 = new Rectangle();
		a2.getArea();
		Triangle a3 = new Triangle();
		a3.getArea();
	}

}
