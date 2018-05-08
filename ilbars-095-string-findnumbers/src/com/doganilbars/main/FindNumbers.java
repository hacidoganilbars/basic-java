package com.doganilbars.main;

import java.util.Scanner;

public class FindNumbers {
	public static void main(String[] args) {

		String str;
		int sum = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = scan.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				sum = sum + (str.charAt(i) - 48);
			}
		}
		System.out.println("The sum of all number in the digit is: " + sum);

		scan.close();

	}
}
