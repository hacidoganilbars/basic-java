package com.doganilbars.main;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		int number, rev = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		int temp = number;
		while (number > 0) {
			int rem = number % 10;
			rev = (rev * 10) + rem;
			number = number / 10;
		}
		if (temp == rev) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
		scan.close();
	}

}
