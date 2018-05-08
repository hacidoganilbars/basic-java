package com.doganilbars.main;

//find whether a node exist in a linkedlist or not
public class LinkedList016FindNode {

	public Node head;

	private static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void findNode(Node node) {
		Node n = head;
		boolean flag = false;
		while (n != null) {
			if (node == n) {
				System.out.println("Yes node is in the linked list");
				flag = true;
			}
			n = n.next;
		}
		if (flag == false) {
			System.out.println("No, the node is not in the linkedlist");
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
		LinkedList016FindNode ll = new LinkedList016FindNode();
		ll.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth = new Node(50);
		Node sixth = new Node(60);

		ll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		ll.findNode(second);
		ll.findNode(sixth);
	}
}