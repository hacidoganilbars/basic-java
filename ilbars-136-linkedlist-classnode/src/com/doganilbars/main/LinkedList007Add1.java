package com.doganilbars.main;

//add data after some node
public class LinkedList007Add1 {

	public Node head;

	private static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// method to add data at the end
	public void append(int new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
			head = new_node;
			return;
		}
		new_node.next = null;
		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		n.next = new_node;
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
		LinkedList007Add1 ll = new LinkedList007Add1();
		ll.append(20);
		ll.append(30);
		ll.append(123);
		ll.append(56);
		ll.append(8);
		ll.append(91);
		ll.append(100);
		ll.append(31);
		System.out.println("Current linked list is: ");
		ll.display();
	}
}