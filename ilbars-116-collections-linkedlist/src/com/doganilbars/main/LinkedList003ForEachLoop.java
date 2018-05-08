package com.doganilbars.main;

import java.util.LinkedList;

//Iterate through linkedlist using for each loop

public class LinkedList003ForEachLoop {
	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Hacý");
		ll.add("Doðan");
		ll.add("Ýlbars");
		ll.add("Java");
		ll.add("Developer");
		System.out.println("The linked list is: ");

		for (String str : ll) {
			System.out.println(str);
		}
	}
}
