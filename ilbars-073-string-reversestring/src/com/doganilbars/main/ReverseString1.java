package com.doganilbars.main;

import java.util.Scanner;

public class ReverseString1 {
	public static void main(String[] args) {

		String str;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the value of string: ");
		str = scan.nextLine();

		String reverse = new StringBuilder(str).reverse().toString();
		System.out.println("After reversing, " + reverse);
		scan.close();

	}

}
