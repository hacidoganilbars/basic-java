package com.doganilbars.main;

import java.util.ArrayList;

//check whether an arraylist is empty or not
public class ArrList936 {
	public static void main(String[] args) {

		ArrayList<Integer> al1 = new ArrayList<Integer>(10);
		System.out.println(al1.isEmpty());
		al1.add(2);
		System.out.println(al1.isEmpty());

	}
}
