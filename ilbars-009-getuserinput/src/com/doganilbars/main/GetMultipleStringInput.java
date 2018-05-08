package com.doganilbars.main;

import java.util.Scanner;

public class GetMultipleStringInput {
	public static void main(String[] args) {

		String str1, str2, str3;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter str1: ");
		str1 = scan.nextLine();
		System.out.print("Enter str2: ");
		str2 = scan.nextLine();
		System.out.print("Enter str3: ");
		str3 = scan.nextLine();
		System.out.println("str1 is: " + str1);
		System.out.println("str2 is: " + str2);
		System.out.println("str3 is: " + str3);
		System.out.println("str1 str2 str3: " + str1 + " " + str2 + " " + str3);

		scan.close();

	}
}
