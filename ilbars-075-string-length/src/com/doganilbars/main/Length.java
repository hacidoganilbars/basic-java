package com.doganilbars.main;

import java.util.Scanner;

public class Length {
	public static void main(String[] args) {

		String str;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = scan.nextLine();
		int len = str.length();
		System.out.println("The length of the string: " + len);
		scan.close();
	}

}
