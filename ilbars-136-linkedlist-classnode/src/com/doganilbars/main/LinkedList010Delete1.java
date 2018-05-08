package com.doganilbars.main;

//delete last node in the linkedlist
public class LinkedList010Delete1 {

	public Node head;

	private static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// to delete last
	public void deleteLast() {
		if (head == null) {
			return;
		}
		Node pre;
		Node curr;
		pre = head;
		curr = pre.next;
		while (curr.next != null) {
			pre = curr;
			curr = curr.next;
		}
		pre.next = null;
		curr = null;
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
		LinkedList010Delete1 ll = new LinkedList010Delete1();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		ll.push(60);

		System.out.println("Currently the linkedlist is: ");
		ll.display();

		ll.deleteLast();
		ll.deleteLast();
		ll.deleteLast();
		System.out.println("After performing two deleteLast() operation: ");
		ll.display();
	}
}