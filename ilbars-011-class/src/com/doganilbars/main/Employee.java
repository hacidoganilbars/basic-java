package com.doganilbars.main;

//===========(chield)========(parent)========
public class Employee extends Another {
	int salary;

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.salary = 1000;
		obj.name = "Hacý Doðan Ýlbars";
		System.out.println("Name: " + obj.name);
		System.out.println("Salary: " + obj.salary);
	}
}

class Another {
	String name;
}