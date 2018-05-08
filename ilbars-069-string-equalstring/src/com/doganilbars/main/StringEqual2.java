package com.doganilbars.main;

import java.util.Scanner;

public class StringEqual2 {
	public static void main(String[] args) {

		String str1;
		String str2;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a str1: ");
		str1 = scan.nextLine();
		System.out.print("Enter a str2: ");
		str2 = scan.nextLine();

		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Equal String");
		} else {
			System.out.println("Unequal string");
		}

		scan.close();
	}
}
