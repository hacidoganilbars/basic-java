package com.doganilbars.main;

//add data after some node
public class LinkedList006Add {

	public Node head;

	private static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void addAfter(Node prev_node, int new_data) {
		if (prev_node == null) {
			System.out.println("Previous node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		return;
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
		LinkedList006Add ll = new LinkedList006Add();
		ll.head = new Node(10);
		Node second = new Node(45);
		Node third = new Node(67);
		Node fourth = new Node(100);

		ll.head = second;
		second.next = third;
		third.next = fourth;

		System.out.println("Before Calling the method addAfter(), the linked list is: ");
		ll.display();

		ll.addAfter(second, 35);

		System.out.println("After calling the add after method the linkedlist now: ");
		ll.display();

	}
}