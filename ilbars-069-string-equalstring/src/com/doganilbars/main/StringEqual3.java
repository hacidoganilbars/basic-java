package com.doganilbars.main;

import java.util.Scanner;

public class StringEqual3 {
	public static void main(String[] args) {

		String str1;
		String str2;
		boolean flag = true;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a str1: ");
		str1 = scan.nextLine();
		System.out.print("Enter a str2: ");
		str2 = scan.nextLine();

		int len1 = str1.length();
		int len2 = str2.length();
		scan.close();

		if (len1 != len2) {
			System.out.println("Strings are unequal");
			return;
		}

		for (int i = 0; i < len1; i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				flag = false;
			}
		}
		
		if (flag == true) {
			System.out.println("Equal Strings");
		} else {
			System.out.println("Unequal strings");
		}
	}
}
