package com.doganilbars.main;

//find length of the linkedlist in recursive way
public class LinkedList013Length {

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

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
		return;
	}

	public int findLength(Node n) {
		if (n == null) {
			return 0;
		}
		return 1 + findLength(n.next);
	}

	public int getLength() {
		return findLength(head);
	}

	public static void main(String[] args) {
		LinkedList013Length ll = new LinkedList013Length();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		ll.push(60);

		System.out.println("The length of the linkedlist is: " + ll.getLength());

	}
}