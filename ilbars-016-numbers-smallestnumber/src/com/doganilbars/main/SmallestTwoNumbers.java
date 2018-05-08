package com.doganilbars.main;

import java.util.Scanner;

public class SmallestTwoNumbers {
	public static void main(String[] args) {

		int number1, number2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number1: ");
		number1 = scan.nextInt();
		System.out.print("Enter number2: ");
		number2 = scan.nextInt();

		if (number1 < number2) {
			System.out.println(number1 + " is smallest that " + number2);
		} else if (number1 > number2) {
			System.out.println(number2 + " is smallest that " + number1);
		} else {
			System.out.println("Borth are same");
		}
		scan.close();
	}

}
