package com.doganilbars.main;

import java.util.Scanner;

//separate odd and even digits of a number, preserving space
public class SeparateOddAndEven {
	public static void main(String[] args) {
		int number;
		int odd = 0;
		int even = 0;
		int i = 1;
		int j = 1;
		int result;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();

		while (number > 0) {
			int rem = number % 10;
			if (rem % 2 == 0 || rem == 0) {
				even = (rem * i) + even;
				i = i * 10;
			} else {
				odd = (rem * j) + odd;
				j = j * 10;
			}
			number = number / 10;
		}
		result = (even * j) + odd;
		System.out.println("After separating odd and even number, the number is: " + result);
		scan.close();
	}

}
