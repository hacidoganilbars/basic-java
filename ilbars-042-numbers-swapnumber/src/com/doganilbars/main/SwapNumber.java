package com.doganilbars.main;

import java.util.Scanner;

//swap two numbers using temporary variable
public class SwapNumber {
	public static void main(String[] args) {
		int number1;
		int number2;
		int temporary;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number1: ");
		number1 = scan.nextInt();
		System.out.print("Enter number2: ");
		number2 = scan.nextInt();
		System.out.println("Currently the value of number1 is: " + number1 + " and number2 is: " + number2);

		// perform swap
		temporary = number1;
		number1 = number2;
		number2 = temporary;
		System.out.println("After swapping the value of number1 is: " + number1 + " and number2 is: " + number2);
		scan.close();
	}

}
