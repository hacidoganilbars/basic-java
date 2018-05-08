package com.doganilbars.main;

import java.util.LinkedList;

//pollFirts returns first element and remove first element

public class LinkedList018PollFirst {
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(23);
		ll.add(80);
		ll.add(45);
		ll.add(23);
		ll.add(8);
		ll.add(66);

		System.out.println(ll.pollFirst());

		System.out.println(ll);
	}
}
