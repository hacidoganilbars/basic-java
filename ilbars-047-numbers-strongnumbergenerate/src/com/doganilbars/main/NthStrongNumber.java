package com.doganilbars.main;

import java.util.Scanner;
//Generate  strong number within some limit

/*
 * A number is called strong number
 * if sum of factorial of its
 * digit is equal to number itself
 * 
 */

//sayının rakamlarınun faktoriyelleri toplamı sayıya eşitse strong sayıdır
public class NthStrongNumber {

	public static void main(String[] args) {
		int limit;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter how many strong number to print: ");
		limit = scan.nextInt();
		for (int i = 0;; i++) {
			if (count == limit) {
				break;
			}
			if (isStrongNumber(i)) {
				count++;
				System.out.print(i + ", ");

			}

		}
		scan.close();
	}

	private static boolean isStrongNumber(int number) {
		int sum = 0;
		int temp = number;
		while (number > 0) {
			int rem = number % 10;
			sum = sum + fact(rem);
			number = number / 10;
		}
		if (sum == temp) {
			return true;
		} else {
			return false;
		}
	}

	public static int fact(int number) {
		int res = 1;
		for (int i = number; i >= 1; i--) {
			res = res * i;
		}
		return res;
	}

}
