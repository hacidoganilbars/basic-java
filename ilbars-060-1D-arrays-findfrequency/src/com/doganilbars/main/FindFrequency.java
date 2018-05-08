package com.doganilbars.main;

import java.util.Scanner;

public class FindFrequency {
	public static void main(String[] args) {

		int arr[];
		int count[];
		int max = Integer.MIN_VALUE;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = scan.nextInt();
		
		arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter arr[" + i + "]: ");
			arr[i] = scan.nextInt();
			if (arr[i] >= max) {
				max = arr[i];
			}
		}
		
		count = new int[max + 1];
		
		for (int i = 0; i < size; i++) {
			count[arr[i]]++;
		}
		
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				System.out.println(i + ": " + count[i] + " times");
			}
		}
		scan.close();
	}
}
