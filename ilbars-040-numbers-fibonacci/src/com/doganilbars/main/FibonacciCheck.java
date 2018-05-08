package com.doganilbars.main;

import java.util.Scanner;

//check whether the input number is fibonacci or not
public class FibonacciCheck {
	public static void main(String[] args) {
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		if (isFibonacci(number)) {
			System.out.println("It is fibonacci number");
		} else {
			System.out.println("It is not a fibonacci number");
		}
		scan.close();
	}

	private static boolean isFibonacci(int number) {
		int x = 0;
		int y = 1;
		while (x <= number) {
			if (x == number) {
				return true;
			}
			int temp = x;
			x = y;
			y = y + temp;
		}
		return false;
	}
}
