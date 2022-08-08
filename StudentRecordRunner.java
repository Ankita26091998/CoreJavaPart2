package com.oops.project;

class StudentRecord implements CollegeData, HostelData {

	public void hostelDetail() {
		System.out.println("In hostelDetail method");
	}

	@Override
	public void studentRecord() {
		System.out.println("In studentRecord method");

	}

	@Override
	public void collegeDetail() {
		System.out.println("In collegeDetail method");

	}

	@Override
	public void studentData() {
		System.out.println("In studentData method");

	}
}

public class StudentRecordRunner {

	public static void main(String[] args) {
		StudentRecord s = new StudentRecord();
		s.hostelDetail();
		s.studentRecord();
		s.collegeDetail();
		s.studentData();
	}

}
