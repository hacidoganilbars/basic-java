package com.doganilbars.main;

import java.util.Scanner;

//print all digits of the given number
public class DigitsOfNumber {
	public static void main(String[] args) {

		int number;
		Scanner scan = new Scanner(System.in);

		System.out.print("Ente a number: ");
		number = scan.nextInt();

		while (number > 0) {
			int rem = number % 10;
			System.out.println(rem);
			number = number / 10;
		}

		scan.close();
	}
}
