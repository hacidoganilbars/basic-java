package com.doganilbars.main;

import java.util.Scanner;

//find smallest and second smallest digit in a number
public class SmallestAndSecondSmallest {
	public static void main(String[] args) {
		int number, min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number = scan.nextInt();
		int temp = number;
		while (number > 0) {
			int rem = number % 10;
			if (rem <= min) {
				secondMin = min;
				min = rem;
			} else if (rem <= secondMin) {
				secondMin = rem;
			}
			number = number / 10;
		}
		System.out.println("The smallest digit in " + temp + " is " + min);
		System.out.println("The second smallest digit in " + temp + " is " + secondMin);
		scan.close();
	}
}
