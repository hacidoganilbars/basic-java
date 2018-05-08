package com.doganilbars.main;

//delete node at the given position
public class LinkedList012Delete3 {

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

	// method to delete node at the given position
	public void deletePos(int position) {

		int count = 1;
		Node prev = head;
		Node n = prev.next;
		if (position == 1) {
			head = head.next;
			return;
		}
		while (n != null) {
			count++;
			if (count == position) {
				prev.next = n.next;
				return;
			}
			prev = n;
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
		LinkedList012Delete3 ll = new LinkedList012Delete3();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		ll.push(60);

		System.out.println("Currently the linkedlist is: ");
		ll.display();

		ll.deletePos(3);
		System.out.println("After deleting the 3rd position node");
		ll.display();

		ll.deletePos(5);
		System.out.println("After deleting the 5th position node");
		ll.display();

		ll.deletePos(1);
		System.out.println("After deleting the 1st position node");
		ll.display();
	}
}