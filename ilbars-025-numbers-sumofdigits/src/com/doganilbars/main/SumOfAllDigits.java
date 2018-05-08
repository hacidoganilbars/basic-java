package com.doganilbars.main;

import java.util.Scanner;

//find sum of all digits in the number
public class SumOfAllDigits {
	public static void main(String[] args) {
		int number;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		int temp = number;
		while (number > 0) {
			int rem = number % 10;
			// sum = sum + rem;
			sum+=rem;
			number = number / 10;
		}
		System.out.println("The sum of all digits of " + temp + " is " + sum);
		scan.close();
	}

}
