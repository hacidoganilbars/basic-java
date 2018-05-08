package com.doganilbars.main;

import java.util.Scanner;

public class RemoveNumbers {
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the strig: ");
		str = scan.nextLine();
		str = str.replaceAll("[0-9]", "");
		System.out.println("After replacing: " + str);
		scan.close();
	}
}
