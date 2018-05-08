package com.doganilbars.main;

import java.util.ArrayList;

//call by reference ArrayList
public class ArrList3 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		add(al);
		System.out.println(al);
	}

	private static void add(ArrayList<Integer> al) {
		al.add(10);
	}
}
