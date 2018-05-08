package com.doganilbars.main;

import java.util.Scanner;

public class GetStringInput {
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		str = scan.nextLine();
		System.out.println("The Input String str is: " + str);
		scan.close();
	}

}
