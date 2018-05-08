package com.doganilbars.main;

import java.util.ArrayList;
import java.util.Scanner;

//add at end, remove and display operation in arrayList using scanner
public class ArrList4 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		int choice = 0;

		do {
			System.out.println("1.Add\n2.Remove\n3.Display\n4.Exit");
			System.out.print("Enter choice: ");
			choice = scan.nextInt();
			if (choice == 1) {
				add(al);
			} else if (choice == 2) {
				remove(al);
			} else if (choice == 3) {
				System.out.println(al);
			} else if (choice == 4) {
				break;
			} else {
				System.out.println("invalid choice");
			}
		} while (choice != 4);
		scan.close();
	}

	private static void add(ArrayList<Integer> al) {
		int data = 0;
		do {
			System.out.print("Enter data(-1 to exit): ");
			data = scan.nextInt();
			if (data != -1) {
				al.add(data);
			}
		} while (data != -1);
		System.out.println();
	}

	private static void remove(ArrayList<Integer> al) {
		int index = 0;
		System.out.print("Enter the index to remove the data: ");
		index = scan.nextInt();
		al.remove(index);
		System.out.println();
	}
}
