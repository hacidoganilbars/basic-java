package com.doganilbars.main;

import java.util.Scanner;

//get user input and add node at front of linkedlist
public class LinkedList008Get {

	public Node head;

	private static class Node {
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

	public void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList008Get ll = new LinkedList008Get();
		Scanner scan = new Scanner(System.in);
		int data;
		int count = 1;
		while (true) {
			System.out.print("Enter -1 to stop end. Enter node " + (count++) + ": ");
			data = scan.nextInt();
			if (data == -1) {
				break;
			}
			ll.push(data);
		}
		System.out.println("The linkedlist elements are: ");
		ll.display();
		scan.close();
	}
}