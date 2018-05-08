package com.doganilbars.main;

import java.util.ArrayList;

//Simple ArrayList add and display
public class ArrList {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		// to add elements in to the ArrayList
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		// to display the elements
		System.out.println("The arrayList element are: " + al);
	}
}
