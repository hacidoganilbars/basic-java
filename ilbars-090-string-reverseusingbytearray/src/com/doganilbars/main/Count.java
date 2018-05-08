package com.doganilbars.main;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {

		String str;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		str = scan.nextLine();

		//store each character values(ASCII) in the string to a byte array
		byte[] temp = str.getBytes();

		//create temporary array
		byte result[] = new byte[str.length()];

		for (int i = 0; i < str.length(); i++) {
			result[i] = temp[str.length() - i - 1];
		}
		str = new String(result);
		System.out.println("After reversing, " + str);
		scan.close();

	}
}
