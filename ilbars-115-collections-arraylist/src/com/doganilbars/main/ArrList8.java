package com.doganilbars.main;

import java.util.ArrayList;

//replace an element in the arrayList using set
public class ArrList8 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(40);

		al.set(0, 45);
		System.out.println(al);

	}
}
