package com.doganilbars.main;

import java.util.LinkedList;

//remove element at specified index

public class LinkedList008RemoveElementAtSpecificIndex {
	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Hacý");
		ll.add("Doðan");
		ll.add("Ýlbars");
		ll.add("Java");
		ll.add("Developer");
		System.out.println("Before Removing: ");
		System.out.println(ll);
		ll.remove(2);
		System.out.println("After Removing: ");
		System.out.println(ll);
	}
}
