package com.doganilbars.main;

import java.util.ArrayList;

//get in arraylist
public class ArrList911 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(40);

		System.out.println(al.get(1));
		int x = al.get(2);
		System.out.println(x);

	}
}
