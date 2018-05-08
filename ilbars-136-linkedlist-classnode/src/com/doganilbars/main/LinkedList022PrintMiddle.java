package com.doganilbars.main;

//print middle element of the linkedlist
public class LinkedList022PrintMiddle {

	public Node head;

	private static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void printMiddle() {

		Node n = head;
		int count = 0;
		while (n != null) {
			count++;
			n = n.next;
		}
		int middleIndex = 1;
		if (count > 2) {
			middleIndex = count / 2;
		}
		n = head;
		count = 0;
		while (n != null) {
			if (count == middleIndex) {
				System.out.println("The data in the index " + middleIndex + " is " + n.data);
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
		LinkedList022PrintMiddle ll = new LinkedList022PrintMiddle();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		ll.push(60);

		System.out.println("Currently the linkedlist is: ");
		ll.display();

		ll.printMiddle();
	}
}