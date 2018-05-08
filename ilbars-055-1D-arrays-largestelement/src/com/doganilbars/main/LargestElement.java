package com.doganilbars.main;

import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {

		int arr[];
		int max = Integer.MIN_VALUE;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = scan.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter arr[" + i + "]: ");
			arr[i] = scan.nextInt();
			if (arr[i] >= max) {
				max = arr[i];
			}
		}
		System.out.println("The largest element in the array is: " + max);
		scan.close();
	}
}
