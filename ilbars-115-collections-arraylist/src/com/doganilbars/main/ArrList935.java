package com.doganilbars.main;

import java.util.ArrayList;

//make arraylist empty
public class ArrList935 {
	public static void main(String[] args) {

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(2);
		al1.add(5);
		al1.add(3);
		al1.add(1);
		al1.add(4);
		System.out.println("Before swapping: ");
		System.out.println(al1);
		al1.clear();
		System.out.println(al1);
	}
}
