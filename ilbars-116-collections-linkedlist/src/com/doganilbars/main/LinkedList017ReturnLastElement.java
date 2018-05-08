package com.doganilbars.main;

import java.util.LinkedList;

//peek (just returns last element but wont remove)

public class LinkedList017ReturnLastElement {
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(23);
		ll.add(80);
		ll.add(45);
		ll.add(23);
		ll.add(8);
		ll.add(66);

		System.out.println(ll.peekLast());

		System.out.println(ll);
	}
}
