package com.doganilbars.main;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
	public static void main(String[] args) {

		String str;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = scan.nextLine();

		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		System.out.println("After sorting: " + new String(arr).trim());
		scan.close();

	}
}
