package com.doganilbars.main;

import java.util.ArrayList;

//difference between set and add
public class ArrList9 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(40);

		al.set(0, 45);
		System.out.println(al);

		al.add(0, 90);
		System.out.println(al);

	}
}
