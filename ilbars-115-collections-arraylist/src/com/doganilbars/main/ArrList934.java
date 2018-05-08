package com.doganilbars.main;

import java.util.ArrayList;
import java.util.Collections;

//swap two elements in arraylist
public class ArrList934 {
	public static void main(String[] args) {

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(2);
		al1.add(5);
		al1.add(3);
		al1.add(1);
		al1.add(4);
		System.out.println("Before swapping: ");
		System.out.println(al1);
		Collections.swap(al1, 0, 3);
		System.out.println("After swapping: ");
		System.out.println(al1);
	}
}
