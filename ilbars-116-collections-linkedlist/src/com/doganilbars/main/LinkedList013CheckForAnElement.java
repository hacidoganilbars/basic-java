package com.doganilbars.main;

import java.util.LinkedList;

//check for an element

public class LinkedList013CheckForAnElement {
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(23);
		ll.add(80);
		ll.add(45);
		ll.add(23);
		ll.add(8);
		ll.add(23);

		System.out.println(ll.contains(Integer.valueOf(8)));

		System.out.println(ll.contains(Integer.valueOf(71)));
	}
}
