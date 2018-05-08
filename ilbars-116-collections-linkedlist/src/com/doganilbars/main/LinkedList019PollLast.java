package com.doganilbars.main;

import java.util.LinkedList;

//pollLast returns last element and remove last element

public class LinkedList019PollLast {
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(23);
		ll.add(80);
		ll.add(45);
		ll.add(23);
		ll.add(8);
		ll.add(66);

		System.out.println(ll.pollLast());

		System.out.println(ll);
	}
}
