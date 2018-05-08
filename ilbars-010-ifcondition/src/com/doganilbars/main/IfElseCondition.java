package com.doganilbars.main;

import java.util.Scanner;

public class IfElseCondition {
	public static void main(String[] args) {
		
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number: ");
		number = scan.nextInt();
		if (number > 0) {
			System.out.println("Positive Number");
		} else if (number < 0) {
			System.out.println("Negative Number");
		} else {
			System.out.println("Zero");
		}
		scan.close();
	}

}
