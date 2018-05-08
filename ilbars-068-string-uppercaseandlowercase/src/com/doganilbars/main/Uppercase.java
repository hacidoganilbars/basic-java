package com.doganilbars.main;

import java.util.Scanner;

public class Uppercase {
	public static void main(String[] args) {

		String str;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = scan.nextLine();

		System.out.println("After converting it to uppercase " + str.toUpperCase());

		scan.close();
	}

}
