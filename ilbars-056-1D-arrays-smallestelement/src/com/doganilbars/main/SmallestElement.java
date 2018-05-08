package com.doganilbars.main;

import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {

		int[] arr;
		int min = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = scan.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter array[" + i + "]: ");
			arr[i] = scan.nextInt();
			if (arr[i] <= min) {
				min = arr[i];
			}
		}
		System.out.println("The largest element in the array is " + min);
		scan.close();
	}
}
