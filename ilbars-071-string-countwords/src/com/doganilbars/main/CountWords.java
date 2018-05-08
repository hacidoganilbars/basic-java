package com.doganilbars.main;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {

		String str;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of string: ");
		str = scan.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("Number of words: " + (count + 1));
		scan.close();
	}

}
