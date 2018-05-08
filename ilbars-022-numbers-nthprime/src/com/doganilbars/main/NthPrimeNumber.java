package com.doganilbars.main;

import java.util.Scanner;

//Find n'th prime number
public class NthPrimeNumber {

	public static void main(String[] args) {
		int n, count = 0, i = 2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		n = scan.nextInt();
		while (count <= n) {
			if (isPrime(i)) {
				count++;
				if (count == n) {
					System.out.println("The " + n + "'th prime number is " + i);
				}
			}
			i++;
		}
		scan.close();
	}

	private static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
