package com.doganilbars.main;

//delete first node in the linkedlist
public class LinkedList009Delete {

	public Node head;

	private static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// delete node at the beginning
	public void deleteBeg() {
		if (head == null) {
			return;
		}
		head = head.next;
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
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
		LinkedList009Delete ll = new LinkedList009Delete();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);

		System.out.println("Currently the linkedlist is: ");
		ll.display();

		ll.deleteBeg();
		ll.deleteBeg();
		System.out.println("After performing two deleteBeg() operation: ");
		ll.display();
	}
}