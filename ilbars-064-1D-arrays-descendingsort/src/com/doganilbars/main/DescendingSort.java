package com.doganilbars.main;

import java.util.Scanner;

public class DescendingSort {
	public static void main(String[] args) {

		int arr[];
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		size = scan.nextInt();
		arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter arr[" + i + "]: ");
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("After sorting the array element are: ");
		display(arr);
		scan.close();
	}

	private static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
