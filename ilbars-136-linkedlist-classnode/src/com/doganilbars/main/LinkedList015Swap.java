package com.doganilbars.main;

//swap two data in the linkedlist without swapping the node
public class LinkedList015Swap {

	public Node head;

	private static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void swap(Node x, Node y) {
		int temp = x.data;
		x.data = y.data;
		y.data = temp;
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
		LinkedList015Swap ll = new LinkedList015Swap();
		ll.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth = new Node(50);

		ll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		System.out.println("Currently the linkedlist is ");
		ll.display();

		ll.swap(second, fourth);

		System.out.println("After swapping the linkedlist is");
		ll.display();
	}
}