package com.doganilbars.main;

import java.util.Scanner;

public class GreatestThreeNumbersTernaryOperator {
	public static void main(String[] args) {
		int number1, number2, number3, greater;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number1: ");
		number1 = scan.nextInt();
		System.out.print("Enter number2: ");
		number2 = scan.nextInt();
		System.out.print("Enter number3: ");
		number3 = scan.nextInt();

		greater = (number1 >= number2 ? (number1 >= number3 ? number1 : number3)
				: (number2 > number3 ? number2 : number3));
		System.out.println("The greatest number is " + greater);
		scan.close();
	}
}
