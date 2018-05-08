package com.doganilbars.main;

import java.util.Vector;

//vector add, remove and get size
public class SimpleVector1 {

	public static void main(String[] args) {

		Vector<Integer> vec = new Vector<Integer>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		vec.add(10);
		System.out.println("Before Removing: " + vec);
		// remove element at some index
		vec.remove(1);
		System.out.println("After Removing: " + vec);
		System.out.println("Currently size of the vector is: " + vec.size());

	}
}
