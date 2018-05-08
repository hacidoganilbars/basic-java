package com.doganilbars.main;

//swap two nodes in the linkedlist without swapping data
public class LinkedList020Swap1 {

	public Node head;

	private static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// to swap two nodes in the linkedlist
	public void swapNodes(Node x, Node y) {
		int tem = x.data;
		x.data = y.data;
		y.data = tem;
		
		//check whether two nodes are valid and unequal
		if (x == null || y == null || x == y) {
			System.out.println("Invalid");
			return;
		}
		//find previous nodes for given x and y nodes
		Node xPrev = findPrevious(x);
		Node yPrev = findPrevious(y);

		if (x == head) {
			head = y;
			Node temp = y.next;
			y.next = x.next;
			x.next = temp;
			yPrev.next = x;
			return;
		} else if (y == head) {
			head = x;
			Node temp = x.next;
			x.next = y.next;
			y.next = temp;
			xPrev.next = y;
			return;
		} else {
			Node temp = x.next;
			xPrev.next = y;
			yPrev.next = x;
			x.next = y.next;
			y.next = temp;
			return;
		}
	}

	// method to find the previous node for a given node
	public Node findPrevious(Node node) {

		Node prev_node = head;
		Node n = prev_node.next;
		while (n != null) {
			if (n == node) {
				return prev_node;
			}
			prev_node = n;
			n = n.next;
		}
		return null;
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
		LinkedList020Swap1 ll = new LinkedList020Swap1();
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
		fifth.next = sixth;

		System.out.println("The elements in the likedlist are");
		ll.display();

		ll.swapNodes(ll.head, fifth);
		System.out.println("After swapping");
		ll.display();

	}
}