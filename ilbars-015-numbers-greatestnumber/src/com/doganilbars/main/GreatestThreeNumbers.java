package com.doganilbars.main;

import java.util.Scanner;

public class GreatestThreeNumbers {

	public static void main(String[] args) {
		int number1, number2, number3;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number1: ");
		number1 = scan.nextInt();
		System.out.print("Enter number2: ");
		number2 = scan.nextInt();
		System.out.print("Enter number3: ");
		number3 = scan.nextInt();

		if (number1 >= number2 && number1 >= number3) {
			System.out.println(number1 + " is greater");
		} else if (number2 >= number1 && number2 >= number3) {
			System.out.println(number2 + " is greater");
		} else {
			System.out.println(number3 + "is greater");
		}
		scan.close();
	}
}
