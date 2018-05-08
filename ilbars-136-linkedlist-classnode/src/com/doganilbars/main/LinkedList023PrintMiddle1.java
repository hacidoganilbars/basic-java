package com.doganilbars.main;

//print middle element of the linkedlist
public class LinkedList023PrintMiddle1 {

	public Node head;

	private static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// method to delete a linkedlist
	public void deleteList() {
		head = null;
		return;

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
		LinkedList023PrintMiddle1 ll = new LinkedList023PrintMiddle1();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		ll.push(60);

		System.out.println("The linkedlist is: ");
		ll.display();

		ll.deleteList();
		System.out.println("After deleting the linkedlist is");
		ll.display();
	}
}