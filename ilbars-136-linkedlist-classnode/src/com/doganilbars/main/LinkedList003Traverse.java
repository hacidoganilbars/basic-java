package com.doganilbars.main;

//traverse through the linkedlist and display elements in it
public class LinkedList003Traverse {

	public Node head;

	private static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList003Traverse ll = new LinkedList003Traverse();
		ll.head = new Node(10);
		Node second = new Node(25);
		Node third = new Node(34);
		Node fourth = new Node(46);
		Node fifth = new Node(87);

		ll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		System.out.println("The elements of the linkedlist are ");
		ll.display();
	}
}