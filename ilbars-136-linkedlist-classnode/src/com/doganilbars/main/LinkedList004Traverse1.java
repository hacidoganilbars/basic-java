package com.doganilbars.main;

//Traverse through the linkedlist and find the length of the linked list
public class LinkedList004Traverse1 {

	public Node head;

	private static class Node {
		@SuppressWarnings("unused")
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public int findLength() {
		Node n = head;
		int length = 0;
		while (n != null) {
			length++;
			n = n.next;
		}
		return length;

	}

	public static void main(String[] args) {
		LinkedList004Traverse1 ll = new LinkedList004Traverse1();
		ll.head = new Node(10);
		Node second = new Node(34);
		Node third = new Node(55);
		Node fourth = new Node(23);
		Node fifth = new Node(32);

		ll.head.next = second;
		second.next = third;
		third.next = fifth;
		fifth.next = fourth;// here fourth is the last node

		System.out.println("The length of the linked list is " + ll.findLength());

	}
}