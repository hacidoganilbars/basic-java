package com.doganilbars.main;

import java.util.LinkedList;

//add element at specific index

public class LinkedList010AddElementSpecificIndex {
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(23);
		ll.add(45);
		ll.add(10);
		ll.add(8);
		ll.add(80);

		System.out.println(ll);
		ll.add(3, 34);
		System.out.println(ll);
	}
}
