package com.doganilbars.main;

import java.util.Scanner;

//reverse the given number
public class ReverseNumber {
	public static void main(String[] args) {
		int number, rev = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		while (number > 0) {
			int rem = number % 10;
			rev = (rev * 10) + rem;
			number = number / 10;
		}
		System.out.println("The reverse is " + rev);
		scan.close();
	}
}
