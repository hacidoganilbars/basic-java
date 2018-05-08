package com.doganilbars.main;

import java.util.Scanner;

public class SecondGreatestNumber {
	public static void main(String[] args) {

		int quantity, temp, max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of inputs: ");
		quantity = scan.nextInt();
		for (int i = 1; i <= quantity; i++) {
			System.out.print("Enter number " + i + ": ");
			temp = scan.nextInt();
			if (temp >= max) {
				secondMax = max;
				max = temp;
			} else if (temp >= secondMax) {
				secondMax = temp;
			}
		}
		System.out.println("The greatest number is: " + max);
		System.out.println("The second greatest number is: " + secondMax);
		scan.close();

	}

}
