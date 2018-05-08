package com.doganilbars.main;

//push operation, insert data at the beginning of the linked list
public class LinkedList005Push {

	public Node head;

	private static class Node {
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

	public void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList005Push ll = new LinkedList005Push();
		ll.push(10);
		ll.push(90);
		ll.push(67);
		ll.push(78);
		ll.push(12);

		System.out.println("The nodes in the linkedlists are: ");
		ll.display();

	}
}