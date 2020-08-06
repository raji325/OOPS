package com.capgemini.oops;

public class Testc {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sid = "234";
		s1.clgname = "sri indu";
		s1.course = "ECE";
		s1.percentage = 73.8;
		s1.backlogs = 0;
		s1.study();
		s1.exam();
		printStudentDetails(s1);

		Person p1 = new Person();
		p1.name = "chitti";
		p1.color = "white";
		p1.height = 5.1;
		p1.age = 21;
		p1.weight = 58;
		p1.walk();
		p1.sleep();
		printPersonDetails(p1);
	}

	static void printPersonDetails(Person p) {
		System.out.println("Person name " + p.name);
		System.out.println("Person color " + p.color);
		System.out.println("Person height " + p.height);
		System.out.println("Person age " + p.age);
		System.out.println("Person weight " + p.weight);
	}

	static void printStudentDetails(Student s) {
		System.out.println("Student sid" + s.sid);
		System.out.println("Student clgname" + s.clgname);
		System.out.println("Student course" + s.course);
		System.out.println("Student percentage" + s.percentage);
		System.out.println("Student backlog" + s.backlogs);

	}
}
