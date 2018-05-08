package com.doganilbars.main;

import java.util.LinkedList;

//find size of the linkedlist

public class LinkedList005SizeOf {
	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Hacý");
		ll.add("Doðan");
		ll.add("Ýlbars");
		ll.add("Java");
		ll.add("Developer");

		System.out.println("Size is: " + ll.size());
	}
}
