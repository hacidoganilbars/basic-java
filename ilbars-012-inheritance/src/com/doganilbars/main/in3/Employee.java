package com.doganilbars.main.in3;

//Hierarchical inheritance
public class Employee {

	public static void main(String[] args) {
		Salary salary = new Salary();
		salary.salary();
		salary.data();
		// salary.detail();//throws error
	}
}

class Salary extends Database {
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
		System.out.println("Class Database calling data() method");
	}
}
