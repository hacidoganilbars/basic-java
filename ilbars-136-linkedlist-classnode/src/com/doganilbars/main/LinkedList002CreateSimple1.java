package com.doganilbars.main;

//Create a simple linked list with 3 nodes
public class LinkedList002CreateSimple1 {

	public Node head;

	private static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		LinkedList002CreateSimple1 ll = new LinkedList002CreateSimple1();
		ll.head = new Node(10);
		Node second = new Node(24);
		Node third = new Node(35);

		ll.head.next = second;
		second.next = third;

		System.out.println("The first element: " + ll.head.data + " and its node: " + ll.head.next.data);
		System.out.println("The second node: " + second.data + " and its next node: " + second.next.data);
		System.out.println("The third node: " + third.data);
	}
}