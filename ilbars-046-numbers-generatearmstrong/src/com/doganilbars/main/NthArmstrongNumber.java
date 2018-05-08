package com.doganilbars.main;

import java.util.Scanner;

//Find n'th armstrong number
public class NthArmstrongNumber {

	public static void main(String[] args) {
		int N;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		N = scan.nextInt();
		for (int i = 0;; i++) {
			if (isArmstrong(i)) {
				count++;
			}
			if (count == N) {
				System.out.println("The " + N + "th armstrong number is " + i);
				break;
			}
		}
		scan.close();
	}

	// check whether the number passed within this method is armstrong number or not
	private static boolean isArmstrong(int number) {
		int temp = number;
		int len = findLength(number);
		int result = 0;
		while (number > 0) {
			int rem = number % 10;
			result = (int) (result + Math.pow(rem, len));
			number = number / 10;
		}
		if (result == temp) {
			return true;
		} else {
			return false;
		}
	}

	// method to find the length of the number
	private static int findLength(int number) {
		int len = 0;
		while (number > 0) {
			len++;
			number = number / 10;
		}
		return len;
	}
}
