package com.doganilbars.main;

import java.util.LinkedList;

//create string linkedlist using java collections
//java koleksiyonlar�n� kullanarak ba�lant�l� liste olu�turmak
public class LinkedList002AddStr {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Hac�");
		ll.add("Do�an");
		ll.add("�lbars");
		ll.add("Java");
		ll.add("Developer");
		System.out.println("The linked list is: ");
		System.out.println(ll);

	}
}
