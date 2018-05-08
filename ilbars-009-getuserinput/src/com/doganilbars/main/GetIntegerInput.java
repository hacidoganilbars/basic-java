package com.doganilbars.main;

import java.util.Scanner;

public class GetIntegerInput {
	public static void main(String[] args) {

		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		System.out.println("The input number is: " + number);
		scan.close();// necessary to avoid memory leaks
		// bellek sýzýntýlarýný önlemek için gerekli

	}

}
