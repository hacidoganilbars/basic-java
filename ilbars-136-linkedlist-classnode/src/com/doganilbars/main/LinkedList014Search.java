package com.doganilbars.main;

//search for an element in linkedlist
public class LinkedList014Search {

	public Node head;

	private static class Node {
		@SuppressWarnings("unused")
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

	// search for an element in the linkedlist
	public void search(int data) {
		int index = 0;
		boolean flag = false;
		Node n = head;
		while (n != null) {
			if (n.data == data) {
				flag = true;
				System.out.println("Yes, " + data + " is in index " + index);
			}
			index++;
			n = n.next;
		}
		if (flag == false) {
			System.out.println("No, " + data + " is not in the list");
		}

	}

	public static void main(String[] args) {
		LinkedList014Search ll = new LinkedList014Search();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		ll.push(60);

		ll.search(10);
		ll.search(60);
		ll.search(1453);

	}
}