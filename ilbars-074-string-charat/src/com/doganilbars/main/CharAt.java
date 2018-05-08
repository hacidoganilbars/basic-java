package com.doganilbars.main;

import java.util.Scanner;

public class CharAt {
	public static void main(String[] args) {

		String str;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = scan.nextLine();
		for (int i = 0; i < str.length(); i++) {
			System.out.println("Char at " + i + ": " + str.charAt(i));
		}
		scan.close();
	}

}
