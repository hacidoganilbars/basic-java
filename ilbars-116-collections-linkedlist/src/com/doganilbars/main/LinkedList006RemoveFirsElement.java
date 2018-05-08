package com.doganilbars.main;

import java.util.LinkedList;

//rmove first element

public class LinkedList006RemoveFirsElement {
	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Hacý");
		ll.add("Doðan");
		ll.add("Ýlbars");
		ll.add("Java");
		ll.add("Developer");
		System.out.println("Currently the linkedlist is: ");
		System.out.println(ll);
		System.out.println("After removing th first element: ");
		ll.removeFirst();
		System.out.println(ll);
	}
}
