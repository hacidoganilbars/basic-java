package com.doganilbars.main;

import java.util.Scanner;

public class Concatenate2 {
	public static void main(String[] args) {

		String str1;
		String str2;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first string: ");
		str1 = scan.nextLine();
		System.out.print("Enter second string: ");
		str2 = scan.nextLine();

		StringBuilder sb = new StringBuilder();
		sb.append(str1);
		sb.append(str2);
		String str3 = sb.toString();
		System.out.println("After combining two strings: " + str3);

		scan.close();

	}

}
