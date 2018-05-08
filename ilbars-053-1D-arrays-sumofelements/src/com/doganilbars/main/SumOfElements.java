package com.doganilbars.main;

import java.util.Scanner;

public class SumOfElements {
	public static void main(String[] args) {
		int n;
		int arr[];
		int sum = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		n = scan.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter array[" + i + "]: ");
			arr[i] = scan.nextInt();
			// sum = sum + arr[i];
			sum += arr[i];
		}
		System.out.println("The sum of all elements in the array is: " + sum);
		scan.close();
	}

}
