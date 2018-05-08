package com.doganilbars.main;

import java.util.Scanner;

//sort the given number, without using data structures
public class SortNumber1 {
	public static void main(String[] args) {
		
		int number;
		int temp;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		
		temp = number;
		
		for (int i = 0; i <= 9; i++) {
			number = temp;
			while (number > 0) {
				int rem = number % 10;
				if (rem == i) {
					result = (result * 10) + rem;
				}
				number = number / 10;
			}
		}
		System.out.println("After sorting the number is " + result);
		scan.close();
	}
}
