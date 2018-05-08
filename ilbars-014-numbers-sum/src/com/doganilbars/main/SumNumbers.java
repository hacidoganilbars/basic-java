package com.doganilbars.main;

import java.util.Scanner;

//find sum of two numbers
public class SumNumbers {
	public static void main(String[] args) {

		int number1, number2, sum;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter num1: ");
		number1 = scan.nextInt();

		System.out.print("Enter num2: ");
		number2 = scan.nextInt();

		sum = number1 + number2;
		System.out.println("The sum of: " + sum);
		scan.close();
	}
}
