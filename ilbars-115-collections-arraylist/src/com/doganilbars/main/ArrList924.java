package com.doganilbars.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//comparator in ArrayList
public class ArrList924 {
	public static void main(String[] args) {

		ArrayList<Employee1> emp = new ArrayList<Employee1>();
		emp.add(new Employee1(7, "Hacý"));
		emp.add(new Employee1(6, "Doðan"));
		emp.add(new Employee1(4, "Tuðba"));
		emp.add(new Employee1(2, "Emine"));
		emp.add(new Employee1(1, "Ayþe"));
		emp.add(new Employee1(3, "Musa"));
		emp.add(new Employee1(5, "Sýrrý"));
		System.out.println("Before sorting: ");
		display(emp);
		Collections.sort(emp, new IdCompare());
		System.out.println("Sorting based on id: ");
		display(emp);
		Collections.sort(emp, new NameCompare());
		System.out.println("Sorting based on name: ");
		display(emp);

	}

	private static void display(ArrayList<Employee1> emp) {
		for (Employee1 e : emp) {
			System.out.println(e);
		}
		System.out.println();
	}
}

class Employee1 {
	int id;
	String name;

	public Employee1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "id: " + id + " name: " + name;
	}
}

class IdCompare implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		if (e1.id < e2.id) {
			return -1;
		} else if (e1.id > e2.id) {
			return 1;
		} else {
			return 0;
		}
	}

}

class NameCompare implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		return e1.name.compareTo(e2.name);
	}

}