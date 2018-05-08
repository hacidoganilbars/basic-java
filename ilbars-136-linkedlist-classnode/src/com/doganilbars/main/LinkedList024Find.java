package com.doganilbars.main;

//function to find number of times the given integer occurs in the list
public class LinkedList024Find {

	public Node head;

	private static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// count occurances of a number
	public void count(int data) {
		int count = 0;
		Node n = head;
		while (n != null) {
			if (n.data == data) {
				count++;
			}
			n = n.next;
		}
		System.out.println(data + " occurs " + count + " times");

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
		LinkedList024Find ll = new LinkedList024Find();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(10);
		ll.push(60);
		ll.push(10);

		System.out.println("The linkedlist is: ");
		ll.display();

		ll.count(10);
	}
}