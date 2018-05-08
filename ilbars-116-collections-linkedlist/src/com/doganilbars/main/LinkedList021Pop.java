package com.doganilbars.main;

import java.util.LinkedList;

//pop in linkedlist

public class LinkedList021Pop {
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.push(19);
		ll.push(32);
		ll.push(75);
		ll.push(2);
		ll.push(15);
		ll.push(81);
		ll.push(80);

		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
	}
}
