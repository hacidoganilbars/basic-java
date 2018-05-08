package com.doganilbars.main;

import java.util.Scanner;

//find factorial of a number using recursion
public class FactorialRecursion {
	public static void main(String[] args) {
		int number;
		int result = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		result = findRecursion(number);
		System.out.println("The Factorial of " + number + " is " + result);
		scan.close();
	}

	private static int findRecursion(int number) {
		if (number == 1) {
			return 1;
		}
		return (number * findRecursion(number - 1));
	}
}
