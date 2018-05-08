package com.doganilbars.main;

//delete a given node in the linked list
public class LinkedList011Delete2 {

	public Node head;

	private static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// delete a given node in the linkedlist
	public void deleteNode(Node node) {
		if (head == null) {
			return;
		}
		if (head == node) {
			head = head.next;
			return;
		}
		Node prev_node = head;
		Node n = prev_node.next;
		while (n != null) {
			if (n == node) {
				prev_node.next = n.next;
				n.next = null;
				return;
			}
			prev_node = n;
			n = n.next;
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
		LinkedList011Delete2 ll = new LinkedList011Delete2();
		ll.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth = new Node(50);

		ll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		System.out.println("Currently the linked list looks like: ");
		ll.display();

		ll.deleteNode(second);
		System.out.println("After deleting second node");
		ll.display();

		ll.deleteNode(fifth);
		System.out.println("After deleting fifth node");
		ll.display();

	}
}