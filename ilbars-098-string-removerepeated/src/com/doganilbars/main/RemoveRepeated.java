package com.doganilbars.main;

import java.util.Scanner;

public class RemoveRepeated {
	public static void main(String[] args) {

		String str;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = scan.nextLine();

		int arr[] = new int[256];

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				arr[str.charAt(i)]++;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 0) {
				if (arr[str.charAt(i)] != 0) {
					System.out.print(str.charAt(i));
					arr[str.charAt(i)] = 0;
				}
			} else {
				System.out.print(str.charAt(i));
			}
		}
		scan.close();

	}
}
