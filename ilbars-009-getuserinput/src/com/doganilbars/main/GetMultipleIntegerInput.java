package com.doganilbars.main;

import java.util.Scanner;

public class GetMultipleIntegerInput {
	public static void main(String[] args) {
		int number1, number2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Number1: ");
		number1 = scan.nextInt();
		System.out.print("Number2: ");
		number2 = scan.nextInt();
		System.out.println();
		System.out.println("The Input number1 is: " + number1);
		System.out.println("The Input number2 is: " + number2);
		System.out.println();
		System.out.println("number1 + number2= " + (number1 + number2));
		System.out.println("number1 - number2= " + (number1 - number2));
		System.out.println("number1 * number2= " + (number1 + number2));
		System.out.println("number1 / number2= " + (number1 / number2));
		System.out.println("number1 % number2= " + (number1 / number2));
		scan.close();
	}

}
