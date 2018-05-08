package com.doganilbars.main;

import java.util.Scanner;

public class DigitCount {
	public static void main(String[] args) {

		int number;
		int array[] = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		while (number > 0) {
			int rem = number % 10;
			array[rem]++;
			number /= 10;
		}
		for (int i = 0; i <= 9; i++) {
			if (array[i] > 0) {
				System.out.println(i + ": " + array[i] + " times");
			}
		}
		scan.close();
	}

}
