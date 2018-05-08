package com.doganilbars.main;

import java.util.Scanner;

//find number of odd and even digits in the given number
public class OddAndEven {

	public static void main(String[] args) {
		int number, odd = 0, even = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		while (number > 0) {
			int rem = number % 10;
			if (rem % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			// number = number / 10;
			number /= 10;
		}
		System.out.println("Number of even digits = " + even + ", odd digits = " + odd);
		scan.close();
	}
}
