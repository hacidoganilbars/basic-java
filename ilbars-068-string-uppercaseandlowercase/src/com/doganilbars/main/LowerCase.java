package com.doganilbars.main;

import java.util.Scanner;

public class LowerCase {

	public static void main(String[] args) {

		String str;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = scan.nextLine();

		System.out.println("After converting it to lowercase: " + str.toLowerCase());

		scan.close();

	}

}
