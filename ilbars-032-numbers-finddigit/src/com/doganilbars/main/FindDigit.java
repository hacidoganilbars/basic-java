package com.doganilbars.main;

import java.util.Scanner;

public class FindDigit {
	public static void main(String[] args) {

		int number, key;
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		System.out.print("Enter the digit to be searched: ");
		key = scan.nextInt();
		while (number > 0) {
			int rem = number % 10;
			if (rem == key) {
				System.out.println("Yes, the " + key + " exists in this number");
				flag = false;
				break;//key may found more than once, so break this loop on first occurance of key
			}
			number = number / 10;
		}
		if (flag == true) {
			System.out.println(key + " not found");
		}
		scan.close();
	}
}
