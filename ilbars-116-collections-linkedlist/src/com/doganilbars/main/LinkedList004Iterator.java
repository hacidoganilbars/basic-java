package com.doganilbars.main;

import java.util.Iterator;
import java.util.LinkedList;

//Iterate through linkedlist using for each loop

public class LinkedList004Iterator {
	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Hacý");
		ll.add("Doðan");
		ll.add("Ýlbars");
		ll.add("Java");
		ll.add("Developer");
		System.out.println("The linked list is: ");

		// yineleyici
		Iterator<String> it = ll.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
