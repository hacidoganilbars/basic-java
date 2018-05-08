package com.doganilbars.main;

import java.util.ArrayList;

//compare two arraylist
public class ArrList933 {
	public static void main(String[] args) {

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(2);
		al1.add(5);
		al1.add(3);
		al1.add(1);
		al1.add(4);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(4);
		al2.add(7);
		al2.add(8);
		al2.add(3);
		al2.add(10);
		ArrayList<String> al3 = new ArrayList<String>();
		for (int i : al1) {
			al3.add(al2.contains(i) ? "yes" : "no");
		}
		System.out.println(al3);
	}
}
