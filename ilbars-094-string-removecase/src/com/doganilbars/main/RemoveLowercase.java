package com.doganilbars.main;

import java.util.Scanner;

//Yazýlan yazýda Küçük harfleri kaldýrýr
public class RemoveLowercase {
	public static void main(String[] args) {

		String str;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = scan.nextLine();
		str = str.replaceAll("[a-z]", "");
		System.out.println("After replacing: " + str);
		scan.close();

	}
}
