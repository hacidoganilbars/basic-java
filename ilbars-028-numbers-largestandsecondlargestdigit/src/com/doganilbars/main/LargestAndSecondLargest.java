package com.doganilbars.main;

import java.util.Scanner;

//find largest and second largest digit in a number
public class LargestAndSecondLargest {
	public static void main(String[] args) {

		int number, max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number = scan.nextInt();
		int temp = number;
		while (number > 0) {
			int rem = number % 10;
			if (rem >= max) {
				secondMax = max;
				max = rem;
			} else if (rem >= secondMax) {
				secondMax = rem;
			}
			number = number / 10;
		}
		System.out.println("The largest digit in " + temp + " is " + max);
		System.out.println("The second largest digit in " + temp + " is " + secondMax);
		scan.close();
	}
}
