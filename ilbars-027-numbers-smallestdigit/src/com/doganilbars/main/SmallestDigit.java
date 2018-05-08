package com.doganilbars.main;

import java.util.Scanner;

public class SmallestDigit {
	public static void main(String[] args) {

		int number, min = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number = scan.nextInt();
		int temp = number;
		while (number > 0) {
			int rem = number % 10;
			if (rem <= min) {
				min = rem;
			}
			number = number / 10;
		}
		System.out.println("The smallest digit in " + temp + " is " + min);
		scan.close();
	}
}
