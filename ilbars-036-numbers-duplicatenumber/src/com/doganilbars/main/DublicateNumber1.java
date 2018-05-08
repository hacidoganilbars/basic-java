package com.doganilbars.main;

import java.util.Scanner;

//separate odd and even digits of a number
public class DublicateNumber1 {
	public static void main(String[] args) {

		int number;
		int odd = 0;
		int even = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		number = scan.nextInt();

		while (number > 0) {
			int rem = number % 10;
			if (rem % 2 == 0) {
				even = (even * 10) + rem;
			} else {
				odd = (odd * 10) + rem;
			}
			number = number / 10;
		}
		System.out.println(even + "" + odd);
		scan.close();
	}
}
