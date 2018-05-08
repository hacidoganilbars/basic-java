package com.doganilbars.main.in1;

import com.doganilbars.main.in1.Details;
import com.doganilbars.main.in1.Salary;

//Single level inheritance
public class Employee {
	public static void main(String[] args) {
		Salary salary = new Salary();
		salary.detailMethod();
		salary.salaryMethod();
	}
}

class Salary extends Details {
	public void salaryMethod() {
		System.out.println("Class Salary Calling salaryMethod()");
	}
}

class Details {
	public void detailMethod() {
		System.out.println("Class Details Calling detailMethod()");
	}
}