package com.doganilbars.main;

import java.util.ArrayList;

//remove specified element
public class ArrList927 {
	public static void main(String[] args) {

		ArrayList<Integer> obj1 = new ArrayList<Integer>();
		obj1.add(6);
		obj1.add(4);
		obj1.add(8);
		obj1.add(3);
		obj1.add(9);
		obj1.add(1);

		System.out.println(obj1);
		obj1.remove(Integer.valueOf(8));
		System.out.println(obj1);
	}
}
