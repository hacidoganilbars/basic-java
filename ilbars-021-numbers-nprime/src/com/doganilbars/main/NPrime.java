package com.doganilbars.main;

import java.util.Scanner;

//Generate n prime numbers
public class NPrime {
	public static void main(String[] args) {

		int quantity, count = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of n: ");
		quantity = scan.nextInt();
		int i = 2;
		while (count <= quantity) {
			if (isPrime(i)) {
				count++;
				System.out.print(i + " ");
			}
			i++;
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
