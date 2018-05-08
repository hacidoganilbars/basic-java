package com.doganilbars.main;

import java.util.Scanner;

//count occurrence of exact digit in a number
public class CountDigit {
	public static void main(String[] args) {
		int number;
		int key;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		System.out.print("Enter the key to be found: ");
		key = scan.nextInt();
		while (number > 0) {
			int rem = number % 10;
			if (key == rem) {
				count++;
			}
			number /= 10;
		}
		System.out.println("The key " + key + " is found " + count + " times");
		scan.close();
	}
}
