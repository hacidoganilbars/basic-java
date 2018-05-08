package com.doganilbars.main;

import java.util.Scanner;

public class ReverseUsingStringBuilder {
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		str = scan.nextLine();

		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		str = new String(sb);
		System.out.println("After converting, " + str);
		scan.close();
	}

}
