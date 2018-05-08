package com.doganilbars.main;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		String str;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the value of string: ");
		str = scan.nextLine();

		char[] arr = str.toCharArray();
		int y = str.length() - 1;

		for (int i = 0; i < str.length() / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[y];
			arr[y] = temp;
			y--;
		}
		str = new String(arr);
		System.out.println("After Converting, " + str);
		scan.close();
	}

}
