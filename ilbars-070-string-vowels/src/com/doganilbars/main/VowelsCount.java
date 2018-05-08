
package com.doganilbars.main;

import java.util.Scanner;

public class VowelsCount {
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of string: ");
		str = scan.nextLine();
		int arr[] = new int[256];
		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i))) {
				arr[str.charAt(i)]++;
			}
		}

		for (int i = 0; i < 256; i++) {
			if (arr[i] != 0) {
				System.out.println((char) i + ": " + arr[i]);
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
