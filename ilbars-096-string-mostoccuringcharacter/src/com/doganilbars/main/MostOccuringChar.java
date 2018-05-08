package com.doganilbars.main;

import java.util.Scanner;

public class MostOccuringChar {
	public static void main(String[] args) {

		String str;
		int max = Integer.MIN_VALUE;
		int index = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = scan.nextLine();

		char[] arr = new char[256];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				arr[str.charAt(i)]++;
			}
		}
		for (int i = 0; i < 256; i++) {
			if (arr[i] >= max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("The most occuring character in the string is: " + (char) index + ", " + max + " times");

		scan.close();

	}
}
