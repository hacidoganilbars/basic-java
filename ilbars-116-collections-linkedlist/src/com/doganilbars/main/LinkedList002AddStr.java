package com.doganilbars.main;

import java.util.LinkedList;

//create string linkedlist using java collections
//java koleksiyonlarýný kullanarak baðlantýlý liste oluþturmak
public class LinkedList002AddStr {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Hacý");
		ll.add("Doðan");
		ll.add("Ýlbars");
		ll.add("Java");
		ll.add("Developer");
		System.out.println("The linked list is: ");
		System.out.println(ll);

	}
}
