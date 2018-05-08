package com.doganilbars.main;

import java.util.Scanner;

public class SecondSmallestNumber {

	public static void main(String[] args) {

		int quantity, temp, min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of inputs: ");
		quantity = scan.nextInt();
		for (int i = 1; i <= quantity; i++) {
			System.out.print("Enter number " + i + ": ");
			temp = scan.nextInt();
			if (temp <= min) {
				secondMin = min;
				min = temp;
			} else if (temp <= secondMin) {
				secondMin = temp;
			}
		}
		System.out.println("The Smallest number is: " + min);
		System.out.println("The second smallest number is: " + secondMin);
		scan.close();

	}

}
