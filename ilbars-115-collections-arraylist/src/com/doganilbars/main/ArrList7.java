package com.doganilbars.main;

import java.util.ArrayList;

//arrayList to normal one demensional array
public class ArrList7 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(40);
		al.add(50);
		al.add(60);

		Integer[] myArray = al.toArray(new Integer[0]);

		for (int i : myArray) {
			System.out.print(i + " ");
		}
	}
}
