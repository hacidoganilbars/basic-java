package com.doganilbars.main;

import java.util.LinkedHashSet;

//retain all
//kesi�ti�i ve normalde yazmayaca�� yeri yazd�r�r
public class LinkedHashSet005RetainAll {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);

		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>();
		lhs1.add(60);
		lhs1.add(70);
		lhs1.add(10);
		lhs1.add(80);
		lhs1.add(40);
		lhs1.add(100);

		lhs.retainAll(lhs1);
		System.out.println(lhs);

	}
}
