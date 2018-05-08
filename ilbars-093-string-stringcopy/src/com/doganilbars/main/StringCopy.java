package com.doganilbars.main;

import java.util.Scanner;

public class StringCopy {
	public static void main(String[] args) {

		String str1;
		String str2;
		String str3;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first string: ");
		str1 = scan.nextLine();
		str2 = new String(str1);
		str3 = str2;

		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);

		scan.close();

	}

}
