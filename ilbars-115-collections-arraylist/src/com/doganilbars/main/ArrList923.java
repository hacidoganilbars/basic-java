package com.doganilbars.main;

import java.util.ArrayList;
import java.util.Collections;

//comparable in ArrayList
public class ArrList923 {
	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(7, "Hac�"));
		emp.add(new Employee(6, "Do�an"));
		emp.add(new Employee(4, "Tu�ba"));
		emp.add(new Employee(2, "Emine"));
		emp.add(new Employee(1, "Ay�e"));
		emp.add(new Employee(3, "Musa"));
		emp.add(new Employee(5, "S�rr�"));
		System.out.println("Before sorting: ");
		display(emp);
		Collections.sort(emp);
		display(emp);

	}

	private static void display(ArrayList<Employee> emp) {
		for (Employee e : emp) {
			System.out.println(e);
		}
		System.out.println();
	}
}

class Employee implements Comparable<Object> {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "id: " + id + " name: " + name;
	}

	public int compareTo(Object o1) {
		Employee e1 = (Employee) o1;
		if (this.id < e1.id) {
			return -1;
		} else if (this.id > e1.id) {
			return 1;
		} else {
			return 0;
		}

	}

}