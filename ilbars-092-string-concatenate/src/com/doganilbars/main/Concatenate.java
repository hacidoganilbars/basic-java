package com.doganilbars.main;

import java.util.Scanner;

public class Concatenate {
	public static void main(String[] args) {

		String str1;
		String str2;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first string: ");
		str1 = scan.nextLine();
		System.out.print("Enter second string: ");
		str2 = scan.nextLine();

		String str3 = str1 + str2;
		System.out.println("After combining two strings: " + str3);

		scan.close();

	}

}
