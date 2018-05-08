package com.doganilbars.main;

import java.util.ArrayList;

//add two array list using append
public class ArrList926 {
	public static void main(String[] args) {

		ArrayList<Integer> obj1 = new ArrayList<Integer>();
		obj1.add(6);
		obj1.add(4);
		obj1.add(8);
		obj1.add(3);
		obj1.add(9);
		obj1.add(1);
		ArrayList<Integer> obj2 = new ArrayList<Integer>();
		obj2.add(23);
		obj2.add(65);
		obj2.add(8);
		obj2.add(88);
		obj2.add(343);

		System.out.println("Currently arraylist 1 is: ");
		System.out.println(obj1);
		System.out.println("Currently arraylist 2 is: ");
		System.out.println(obj2);
		obj1.addAll(obj2);
		System.out.println("Now the arrayList 1 is: ");
		System.out.println(obj1);
		System.out.println("Now the arrayList 2 is: ");
		System.out.println(obj2);

	}
}
