package com.doganilbars.main;

import java.util.LinkedHashSet;

//LinkedHashSet
public class LinkedHashSet001Demo {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(10);
		lhs.add(40);
		lhs.add(50);
		System.out.println("here linkedhash set maintains order, but it doesnt support duplicates: ");
		System.out.println(lhs);

	}
}
