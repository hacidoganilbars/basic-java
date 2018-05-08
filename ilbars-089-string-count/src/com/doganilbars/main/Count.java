package com.doganilbars.main;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {

		String str;
		int vowels = 0;
		int consonants = 0;
		int spaces = 0;
		int number = 0;
		int other = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		str = scan.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				number++;
			} else if (ch == ' ') {
				spaces++;
			} else if (ch == 'a' || ch == 'e' || ch == 'ý' || ch == 'i' || ch == 'o' || ch == 'ö' || ch == 'u'
					|| ch == 'ü' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'Ý' || ch == 'O' || ch == 'Ö'
					|| ch == 'U' || ch == 'Ü') {
				vowels++;
			} else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				consonants++;
			} else {
				other++;
			}
		}
		System.out.println("vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("Numbers: " + number);
		System.out.println("Spaces: " + spaces);
		System.out.println("Other characters: " + other);

		scan.close();

	}
}
