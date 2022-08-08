package com.oops.project;

class Person {

	int age;
	String name, city;

	public Person(int a, String name, String city) {

		age = a;
		this.name = name;
		this.city = city;
	}

}

class Learner extends Person {
	String course = "Java FullStack Development";

	public Learner() {
		super(22, "Samrudhhi", "Amravati");
	}

	public void getDetails() {
		System.out.println("Learner Details: ");
		System.out.println("Learner's Name: " + name + ", Learner's Age: " + age + ", Learner's City: " + city
				+ ", Learner's selected course: " + course);

	}
}

public class TypePeople {
	public static void main(String[] args) {
		Learner l = new Learner();
		l.getDetails();
	}
}
