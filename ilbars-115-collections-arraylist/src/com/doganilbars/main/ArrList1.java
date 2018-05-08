package com.doganilbars.main;

import java.util.ArrayList;

//Simple ArrayList add, remove
public class ArrList1 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		// to add elements in to the ArrayList
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		// arraylist
		System.out.println(al);

		// to remove 2nd element value=20
		al.remove(1);
		System.out.println(al);

	}
}
