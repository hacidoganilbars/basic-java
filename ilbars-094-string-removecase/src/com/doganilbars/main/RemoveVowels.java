package com.doganilbars.main;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		
		String str;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		str = scan.nextLine();
		
		str = str.replaceAll("[aeýioöuüAEIÝOÖUÜ]", "");
		System.out.println("After replacing: " + str);
		scan.close();
	}
}
