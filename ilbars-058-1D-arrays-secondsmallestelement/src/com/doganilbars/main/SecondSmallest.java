package com.doganilbars.main;

import java.util.Scanner;

public class SecondSmallest {
	public static void main(String[] args) {
		int arr[];
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = scan.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter arr[" + i + "]: ");
			arr[i] = scan.nextInt();
			if (arr[i] <= min) {
				secondMin = min;
				min = arr[i];
			} else if (secondMin >= arr[i]) {
				secondMin = arr[i];
			}
		}
		System.out.println("The smallest element in the array is: " + min);
		System.out.println("The Second smallest element in the array is: " + secondMin);
		scan.close();
	}
}
