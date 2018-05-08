package com.doganilbars.main;

import java.util.Scanner;

//swap two numbers without using temporary variable
public class SwapNumber1 {
	public static void main(String[] args) {

		int number1;
		int number2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number1: ");
		number1 = scan.nextInt();
		System.out.print("Enter number2: ");
		number2 = scan.nextInt();

		System.out.println("Currently the value of number1 is " + number1 + " and number2 is " + number2);

		// perform swapping
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;

		System.out.println("After swapping the value of number1 is: " + number1 + " and number2 is " + number2);
		scan.close();

	}

}
