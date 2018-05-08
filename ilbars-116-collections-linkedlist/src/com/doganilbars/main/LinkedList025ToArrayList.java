package com.doganilbars.main;

import java.util.ArrayList;
import java.util.LinkedList;

//inkedlist to arraylist

public class LinkedList025ToArrayList {
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

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.addAll(ll);

		System.out.println(al);

	}
}
