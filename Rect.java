package com.oops.project;

class PolyGonImpl implements PolyGon {
	@Override
	public void getName() {
		System.out.println("Polygon is rectangle");
	}

	@Override
	public void getArea() {
		System.out.println("Area of rectangle is: " + (length * breadth));

	}

}

class SquareImpl implements PolyGon {
	@Override
	public void getName() {
		System.out.println("Polygon is square");
	}

	@Override
	public void getArea() {
		System.out.println("Area of square is: " + (length * length));

	}

}

public class Rect {
	public static void main(String[] args) {
		PolyGonImpl p = new PolyGonImpl();
		p.getName();
		p.getArea();
		SquareImpl p1 = new SquareImpl();
		p1.getName();
		p1.getArea();
	}

}
