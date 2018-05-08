package com.doganilbars.main;

import java.util.ArrayList;

//boolean contains(Object o)
public class ArrList912 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(40);

		System.out.println(al.contains(10));
		System.out.println(al.contains(50));

	}
}
