package com.doganilbars.main;

import java.util.Scanner;

//find number of digits in the given number
public class NumberOfDigits {
	public static void main(String[] args) {
		int number, len = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		while (number > 0) {
			len = len + 1;
			number = number / 10;
		}
		System.out.println("The number of digits in the number is: " + len);
		scan.close();

	}

}
