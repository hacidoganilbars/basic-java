package com.doganilbars.main;

import java.util.LinkedList;

//peek (just returns first element but wont remove)

public class LinkedList016ReturnFirstElement2 {
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(23);
		ll.add(80);
		ll.add(45);
		ll.add(23);
		ll.add(8);
		ll.add(23);

		System.out.println(ll.peekFirst());

		System.out.println(ll);
	}
}
