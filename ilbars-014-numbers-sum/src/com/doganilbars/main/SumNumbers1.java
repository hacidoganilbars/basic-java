package com.doganilbars.main;

import java.util.Scanner;

public class SumNumbers1 {
	public static void main(String[] args) {

		int number, temp, sum = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the total number of input: ");
		number = scan.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.print("Enter input " + i + ": ");
			temp = scan.nextInt();
			// sum = sum + temp;
			sum += temp;
		}

		System.out.println("The sum of all input numbers is: " + sum);
		scan.close();

	}

}
