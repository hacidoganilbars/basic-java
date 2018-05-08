package com.doganilbars.main;

//get N'th node of the linkedlist
public class LinkedList021GetNthNode {

	public Node head;

	private static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// to display th n'th node of the linked list
	public void nthNode(int x) {
		Node n = head;
		int count = 0;
		while (n != null) {
			if (count == x) {
				System.out.println("The data in the " + x + " th node of the list is " + n.data);
				return;
			}
			count++;
			n = n.next;
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
		LinkedList021GetNthNode ll = new LinkedList021GetNthNode();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		ll.push(60);

		System.out.println("Currently the linkedlist is: ");
		ll.display();

		ll.nthNode(3);
	}
}