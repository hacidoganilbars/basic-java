package com.doganilbars.main;

import java.util.LinkedList;

//inkedlist to string

public class LinkedList023ToString1 {
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
		String str = ll.get(3).toString();
		System.out.println(str);
	}
}
