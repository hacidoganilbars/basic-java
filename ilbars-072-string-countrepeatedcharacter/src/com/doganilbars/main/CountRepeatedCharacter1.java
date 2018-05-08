package com.doganilbars.main;

import java.util.Scanner;

public class CountRepeatedCharacter1 {
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
		for (int i = 65; i <=90; i++) {
			arr[i]=arr[i]+arr[i+32];
			arr[i+32]=0;
		}
		
		for (int i = 0; i < 256; i++) {
			if (arr[i] > 1) {
				System.out.println((char) (i) + ": " + arr[i]);
			}
		}
		scan.close();
	}

}
