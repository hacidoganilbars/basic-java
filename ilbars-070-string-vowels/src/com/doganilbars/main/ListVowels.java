package com.doganilbars.main;

import java.util.Scanner;

//SESL� HARFLER� YAKALAR EKRANA BASAR
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
		if (ch == 'a' || ch == 'e' || ch == '�' || ch == 'i' || ch == 'o' || ch == '�' || ch == 'u' || ch == '�'
				|| ch == 'A' || ch == 'E' || ch == 'I' || ch == '�' || ch == 'O' || ch == '�' || ch == 'U'
				|| ch == '�') {
			return true;
		}
		return false;
	}

}
