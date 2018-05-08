package com.doganilbars.main;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number between 1 to 4: ");
		number = scan.nextInt();
		switch (number) {
		case 1:
			System.out.println("Entered number is one");
			break;
		case 2:
			System.out.println("Entered number is two");
			break;
		case 3:
			System.out.println("Entered number is three");
			break;
		case 4:
			System.out.println("Entered number is four");
			break;
		default:
			System.out.println("invalid input");
			break;
		}
		scan.close();
	}

}
