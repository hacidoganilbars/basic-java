package com.doganilbars.main;

import java.util.ArrayList;

//remove specified element from string arraylist
public class ArrList928 {
	public static void main(String[] args) {

		ArrayList<String> obj1 = new ArrayList<String>();
		obj1.add("Hacý");
		obj1.add("Doðan");
		obj1.add("Ýlbars");
		obj1.add("Java");
		obj1.add("Developer");
		obj1.add("Spring");
		obj1.add("Hibernate");
		obj1.add("Android");
		obj1.add("JPA");

		System.out.println(obj1);
		obj1.remove("Android");
		System.out.println(obj1);
	}
}
