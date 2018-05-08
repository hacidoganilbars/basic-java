package com.doganilbars.main;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		int arr[];
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = scan.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter arr[" + i + "]: ");
			arr[i] = scan.nextInt();
			if (arr[i] >= max) {
				secondMax = max;
				max = arr[i];
			} else if (secondMax >= arr[i]) {
				secondMax = arr[i];
			}
		}
		System.out.println("The largest element in the array is" + max);
		System.out.println("The Second largest element in the array is: " + secondMax);
		scan.close();
	}
}
