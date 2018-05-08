package com.doganilbars.main;

import java.util.Scanner;

//remove character from the given string until it becomes empty
//Boþ hale gelene kadar verilen dizeden karakteri kaldýr
public class Example015RemoveLetter3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str;
		int index;
		System.out.print("Enter a String: ");
		str = scan.nextLine();
		int len = str.length();
		while (len > 0) {
			System.out.println("Currently string is " + str);
			System.out.print("Enter the index to remove: ");
			index = scan.nextInt();
			str = removeIndex(str, index);
			len = str.length();
		}
		scan.close();
	}

	private static String removeIndex(String str, int index) {
		if (index > str.length() - 1 || index < 0) {
			System.out.println("Invalid index");
			return str;
		}
		String temp = "";
		for (int i = 0; i <= index - 1; i++) {
			temp = temp + str.charAt(i);
		}
		for (int i = index + 1; i <= str.length() - 1; i++) {
			temp = temp + str.charAt(i);
		}
		return temp;
	}
}