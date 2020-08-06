package com.capgemini.oops;

public class Student extends Person {
	String sid;
	String clgname;
	String course;
	double percentage;
	long backlogs;

	void study() {
		System.out.println(" you can study");
	}
	void exam() {
		System.out.println("you can write exams");
	}

}
