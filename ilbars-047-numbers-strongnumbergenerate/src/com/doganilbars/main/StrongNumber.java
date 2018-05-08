package com.doganilbars.main;

import java.util.Scanner;
//Generate  strong number within some limit

/*
 * A number is called strong number
 * if sum of factorial of its
 * digit is equal to number itself
 * 
 */

//sayýnýn rakamlarýnun faktoriyelleri toplamý sayýya eþitse strong sayýdýr
public class StrongNumber {

	public static void main(String[] args) {
		int limit;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		limit = scan.nextInt();
		for (int i = 0; i <= limit; i++) {
			if (isStrongNumber(i)) {
				System.out.println(i + ", ");
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
