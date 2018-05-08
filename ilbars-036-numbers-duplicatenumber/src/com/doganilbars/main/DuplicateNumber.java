package com.doganilbars.main;

import java.util.Scanner;

//find whether duplicate exist in a number
public class DuplicateNumber {
	public static void main(String[] args) {
		int number;
		int arr[] = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		while (number > 0) {
			int rem = number % 10;
			arr[rem]++;
			number = number / 10;
		}
		for (int i = 0; i <= 9; i++) {
			if (arr[i] > 1) {
				System.out.println(i + ": " + arr[i] + " times");
			}
		}
		scan.close();
	}
}
