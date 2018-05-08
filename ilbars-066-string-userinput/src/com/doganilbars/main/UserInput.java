package com.doganilbars.main;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {

		String str;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = scan.nextLine();

		System.out.println("The input string is: " + str);
		scan.close();

	}

}
