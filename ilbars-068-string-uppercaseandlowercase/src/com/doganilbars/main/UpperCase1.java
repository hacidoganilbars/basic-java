package com.doganilbars.main;

import java.util.Scanner;

public class UpperCase1 {

	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		str = scan.nextLine();
		str = convert(str);
		System.out.println("After Convertin, " + str);
		scan.close();
	}

	private static String convert(String str) {
		char[] arr = new char[str.length()];
		arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 97 && arr[i] <= 122) {
				arr[i] = (char) (arr[i] - 32);
			}
		}
		str = new String(arr);
		return str;
	}

}
