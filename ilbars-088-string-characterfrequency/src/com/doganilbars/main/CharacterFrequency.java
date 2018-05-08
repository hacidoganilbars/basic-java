package com.doganilbars.main;

import java.util.Scanner;

public class CharacterFrequency {
	public static void main(String[] args) {

		String str;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		str = scan.nextLine();
		int arr[] = new int[256];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
		}
		System.out.println("The frequency of characters: ");
		for (int i = 0; i < 256; i++) {
			if (arr[i] > 0) {
				System.out.println((char) i + ": " + arr[i]);
			}
		}
		scan.close();

	}
}
