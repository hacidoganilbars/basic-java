package com.doganilbars.main;

//find previous node data for a give node
public class LinkedList017FindPrevious {

	public Node head;

	private static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// method to find the previous node data
	public void findPrevious(Node node) {
		if (node == head || node == null) {
			System.out.println("No previous node");
			return;
		}
		Node prev = head;
		Node curr = prev.next;
		while (curr != null) {
			if (curr == node) {
				System.out.println("The data in current node is " + curr.data);
				System.out.println("The data in previous node is " + prev.data);
			}
			prev = curr;
			curr = curr.next;

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
		LinkedList017FindPrevious ll = new LinkedList017FindPrevious();
		ll.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth = new Node(50);

		ll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		System.out.println("The linked list elements are");
		ll.display();

		ll.findPrevious(fourth);

	}
}