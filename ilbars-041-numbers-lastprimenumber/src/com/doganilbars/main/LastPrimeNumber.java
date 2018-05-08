package com.doganilbars.main;

import java.util.Scanner;

//print last prime number within a number 'N'
public class LastPrimeNumber {
	public static void main(String[] args) {
		int N;
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the limt: ");
		N = scan.nextInt();
		for (int i = N; i > 1; i--) {
			if (isPrime(i)) {
				System.out.println("The Largest fibonacci within " + N + " is " + i);
				break;
			}
		}
		scan.close();

	}

	private static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
