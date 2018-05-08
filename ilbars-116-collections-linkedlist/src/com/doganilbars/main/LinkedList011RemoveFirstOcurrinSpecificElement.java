package com.doganilbars.main;

import java.util.LinkedList;

//remove first occurring specific element

public class LinkedList011RemoveFirstOcurrinSpecificElement {
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(23);
		ll.add(80);
		ll.add(45);
		ll.add(23);
		ll.add(8);
		ll.add(23);

		System.out.println(ll);
		ll.removeFirstOccurrence(Integer.valueOf(23));
		System.out.println(ll);
	}
}
