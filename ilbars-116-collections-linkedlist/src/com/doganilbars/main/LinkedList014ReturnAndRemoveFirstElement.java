package com.doganilbars.main;

import java.util.LinkedList;

//poll in linkedlist returns and removes first element

public class LinkedList014ReturnAndRemoveFirstElement {
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(23);
		ll.add(80);
		ll.add(45);
		ll.add(23);
		ll.add(8);
		ll.add(23);

		System.out.println(ll.poll());

		System.out.println(ll);
	}
}
