package com.doganilbars.main;

import java.util.Scanner;

//SESLÝ HARFLERÝ YAKALAR EKRANA BASAR
public class ListVowels {
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of string: ");
		str = scan.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i))) {
				System.out.print(str.charAt(i) + " ");
			}
		}
		scan.close();
	}

	private static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'ý' || ch == 'i' || ch == 'o' || ch == 'ö' || ch == 'u' || ch == 'ü'
				|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'Ý' || ch == 'O' || ch == 'Ö' || ch == 'U'
				|| ch == 'Ü') {
			return true;
		}
		return false;
	}

}
