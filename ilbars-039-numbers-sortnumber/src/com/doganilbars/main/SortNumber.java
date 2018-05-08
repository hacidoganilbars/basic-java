package com.doganilbars.main;

import java.util.Scanner;

//sort the given number
public class SortNumber {

	public static void main(String[] args) {
		int number;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number = scan.nextInt();
		int arr[] = new int[10];
		while (number > 0) {
			int rem = number % 10;
			arr[rem]++;
			number = number / 10;
		}
		for (int i = 0; i <= 9; i++) {
			for (int j = 1; j <= arr[i]; j++) {
				result = (result * 10) + i;
			}
		}
		System.out.println("After sorting the number is " + result);
		scan.close();
	}
}
