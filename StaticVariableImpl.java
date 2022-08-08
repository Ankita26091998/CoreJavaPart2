package com.oops.project;

class Student2 {
	int rollNo;
	String name;
	static String course = "Java Backend Development";
	static int count = 0;
	final String city = "Abc";

	public Student2(int rollNo, String name) {
		super();
//		city = "Abcd";
		this.rollNo = rollNo;
		this.name = name;
		count++;
		System.out.println("Number of objects: " + count);
	}

	public void getDetails() {
		System.out.println(
				"Student Name: " + name + ", Student rollNo: " + rollNo + ", Student's selected course: " + course);

	}
}

public class StaticVariableImpl {

	public static void main(String[] args) {
		Student2 s1 = new Student2(201, "Nikita");
		s1.getDetails();
		Student2 s2 = new Student2(202, "Ayushi");
		s2.getDetails();
		Student2 s3 = new Student2(203, "Ankita");
		s3.getDetails();
//		System.out.println("Number of objects: " + Student2.count);
	}

}
