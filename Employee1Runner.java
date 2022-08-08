package com.oops.project;

class Employee1 {
	int salary = 20000;
	String empTitle = "Employee";

	public Employee1(int salary, String empTitle) {
		this.salary = salary;
		this.empTitle = empTitle;
		System.out.println("Employee1 parameterized Constructor");

	}

	Employee1() {
		System.out.println("Employee1 Constructor");

	}

	void displaySalary() {
		System.out.println("Original Salary is: " + salary);
	}
}

class PerEmployee extends Employee1 {
	int totalInc;
	// 10% Increment
	float inc = 0.1f;

	public PerEmployee() {
		// to call superClass parameterized Constructor
		super(30000, "ss");
		System.out.println("PerEmployee Constructor");
	}

	String empTitle = "Manager";

	void displaySalary() {
		// to call superClass method
		super.displaySalary();
		totalInc = (int) (salary + salary * inc);
		System.out.println("Incremented Salary is: " + totalInc);
		// to call superClass variable
		System.out.println("Employee Name: " + super.empTitle);

	}

}

class TempEmployee extends Employee1 {
	int totalInc;
	// 15% Increment
	float inc = 0.15f;
	String empTitle = "Developer";

	void displaySalary() {
		// to call superClass method
		super.displaySalary();
		totalInc = (int) (salary + salary * inc);
		System.out.println("Incremented Salary is: " + totalInc);
		System.out.println("Employee Name: " + empTitle);

	}

}

public class Employee1Runner {

	public static void main(String[] args) {
		PerEmployee p = new PerEmployee();
		p.displaySalary();
		TempEmployee t = new TempEmployee();
		t.displaySalary();
	}

}
