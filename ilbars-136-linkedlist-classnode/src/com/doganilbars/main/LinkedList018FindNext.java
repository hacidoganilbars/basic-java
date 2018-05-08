package com.doganilbars.main;

//find next node data for a give node
public class LinkedList018FindNext {

	public Node head;

	private static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// method to find the next node data for a given node
	public void findNext(Node node) {
		if (node == null) {
			return;
		}
		Node curr = head;
		Node next = curr.next;
		while (next != null) {
			if (node == curr) {
				System.out.println("The data in current node is " + curr.data);
				System.out.println("The data in next node is " + next.data);
				return;
			}
			curr = next;
			next = next.next;
			if (next == null) {
				System.out.println("The next node data is null or not present");
			}

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
		LinkedList018FindNext ll = new LinkedList018FindNext();
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

		ll.findNext(fourth);

	}
}