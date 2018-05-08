package com.doganilbars.main;

import java.util.Scanner;

public class PrimalityCheck {

	public static void main(String[] args) {
		int number;
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = false;
			}
		}
		if (flag == true) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not a prime number");
		}
		scan.close();
	}

}
