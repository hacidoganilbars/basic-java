package com.doganilbars.main;

import java.util.Scanner;

public class CountRepeatedCharacter {
	public static void main(String[] args) {

		String str;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the value of string: ");
		str = scan.nextLine();
		
		int[] arr = new int[256];
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				continue;
			}
			arr[str.charAt(i)]++;
		}
		
		for (int i = 0; i < 256; i++) {
			if (arr[i] > 1) {
				System.out.println((char) (i) + " " + arr[i]);
			}
		}
		scan.close();
	}

}
