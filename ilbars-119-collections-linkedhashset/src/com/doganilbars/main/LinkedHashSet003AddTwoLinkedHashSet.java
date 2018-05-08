package com.doganilbars.main;

import java.util.LinkedHashSet;

//add two LinkedHashSet
public class LinkedHashSet003AddTwoLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(30);
		lhs.add(50);

		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>();
		lhs1.add(10);
		lhs1.add(20);
		lhs1.add(30);
		lhs1.add(40);
		lhs1.add(30);
		lhs1.add(50);

		lhs.addAll(lhs1);
		System.out.println(lhs);

	}
}
