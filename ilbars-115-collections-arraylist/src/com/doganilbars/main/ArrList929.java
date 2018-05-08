package com.doganilbars.main;

import java.util.ArrayList;

//remove element at specified index
public class ArrList929 {
	public static void main(String[] args) {

		ArrayList<Integer> obj1 = new ArrayList<Integer>();
		obj1.add(35);
		obj1.add(45);
		obj1.add(51);
		obj1.add(37);
		obj1.add(8);
		obj1.add(45);

		System.out.println(obj1);
		obj1.remove(3);
		System.out.println(obj1);
	}
}
