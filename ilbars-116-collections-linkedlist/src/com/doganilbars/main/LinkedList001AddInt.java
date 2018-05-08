package com.doganilbars.main;

import java.util.LinkedList;

//create linkedlist using java collections
//java koleksiyonlarýný kullanarak baðlantýlý liste oluþturmak
public class LinkedList001AddInt {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(15);
		ll.add(8);
		System.out.println("The linked list is: ");
		System.out.println(ll);

	}
}
