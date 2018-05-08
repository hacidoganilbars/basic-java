package com.doganilbars.main;

import java.util.Scanner;

//print all prime numbers within a number
public class AllPrimeNumbers {

	public static void main(String[] args) {

		int beg, end;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the begin value: ");
		beg = scan.nextInt();
		System.out.print("Enter the end value: ");
		end = scan.nextInt();

		for (int i = beg; i <= end; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}

	private static boolean isPrime(int number) {
		for (int i = 2; i < number/2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
