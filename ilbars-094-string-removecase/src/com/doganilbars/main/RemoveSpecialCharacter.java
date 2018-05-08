package com.doganilbars.main;

import java.util.Scanner;

public class RemoveSpecialCharacter {
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		str = scan.nextLine();
		String special = str.replaceAll("[a-z,A-Z,0-9]", "");
		str = str.replaceAll("[" + special + "]", "");
		System.out.println("After replacing: " + str);
		System.out.println("Removed special characters: " + special);
		scan.close();
	}

}
