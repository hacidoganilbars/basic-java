package com.doganilbars.main;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {

		int[] arr;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int len = scan.nextInt();
		arr = new int[len];

		for (int i = 0; i < len; i++) {
			System.out.print("Enter arr[" + i + "]: ");
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < len / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[len - i - 1];
			arr[len - i - 1] = temp;
		}
		System.out.println("After reversing the array elements are: ");
		display(arr);
		scan.close();
	}

	private static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
