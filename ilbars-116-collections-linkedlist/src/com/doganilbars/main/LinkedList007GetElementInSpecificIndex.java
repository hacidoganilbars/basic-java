package com.doganilbars.main;

import java.util.LinkedList;

//get element in specific index

public class LinkedList007GetElementInSpecificIndex {
	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Hacý");
		ll.add("Doðan");
		ll.add("Ýlbars");
		ll.add("Java");
		ll.add("Developer");
		System.out.println(ll.get(2));
	}
}
