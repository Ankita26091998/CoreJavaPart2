package com.oops.project;

interface Honda {

	public void getDetails();

}

interface Audi {
	public void getDetails();
}

//multiple inheritance using interface
class CarFeature implements Honda, Audi {

	public void getDetails() {
		System.out.println("Inside CarFeature class");

	}

	public void getCarName() {
		System.out.println("Basic Car");
	}

}

//Hierarchical inheritance
class A extends CarFeature {
	String name = "XYZ";

	public void getCarName() {
		System.out.println("Inside class A " + name);
	}

}

//Hierarchical inheritance
class B extends CarFeature {
	String name = "ABC";

	public void getCarName() {
		System.out.println("Inside class B " + name);
	}
}

//Main class to execute all class
public class HybridInheritance {

	public static void main(String[] args) {
		CarFeature b = new CarFeature();
		b.getDetails();
		b.getCarName();
		A a = new A();
		a.getCarName();
		a.getDetails();
		B b1 = new B();
		b1.getCarName();
		b1.getDetails();

	}

}
