package com.doganilbars.main;

import java.util.Scanner;

//Yaz�lan yaz�da B�y�k harfleri kald�r�r
public class RemoveUppercase1 {
	public static void main(String[] args) {

		String str;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = scan.nextLine();
		str = str.replaceAll("[A-Z]", "");
		System.out.println("After replacing: " + str);
		scan.close();

	}
}
