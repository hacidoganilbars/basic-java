package com.doganilbars.main.in2;

//Multi Level Inheritance
public class Employee {
	public static void main(String[] args) {

		Salary salary = new Salary();
		salary.detail();
		salary.salary();
		salary.data();
	}
}

class Salary extends Details {
	public void salary() {
		System.out.println("Class Salary calling salary() method");
	}
}

class Details extends Database {
	public void detail() {
		System.out.println("Class Details calling detail() method");
	}
}

class Database {
	public void data() {
		System.out.println("class Database Calling data() method");
	}
}
