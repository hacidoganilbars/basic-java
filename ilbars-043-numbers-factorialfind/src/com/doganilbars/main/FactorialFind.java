package com.doganilbars.main;

import java.util.Scanner;

//find factorial of a number

public class FactorialFind {

	public static void main(String[] args) {

		int number;
		int result = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		for (int i = number; i >= 1; i--) {
			result = result * i;
		}
		System.out.println("The factorial of: " + number + " is " + result);
		scan.close();
	}
}
