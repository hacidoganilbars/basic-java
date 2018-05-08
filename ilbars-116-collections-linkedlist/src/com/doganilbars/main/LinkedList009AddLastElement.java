package com.doganilbars.main;

import java.util.LinkedList;

//add element at end of the linkedlist

public class LinkedList009AddLastElement {
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(23);
		ll.add(45);
		ll.add(10);
		ll.add(8);
		ll.add(80);
		
		System.out.println(ll);
		ll.addLast(34);
		System.out.println(ll);
	}
}
