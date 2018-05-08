package com.doganilbars.main;

import java.util.Scanner;

//find the N'th fibonacci number
public class NthFibonacci {
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		n = scan.nextInt();
		System.out.println("The " + n + " th fibonacci number is " + (getFibonacci(n)));
		scan.close();
	}

	private static int getFibonacci(int n) {
		int count = 1;
		int x = 0;
		int y = 1;
		while (count <= n) {
			if (count == n) {
				return x;
			}
			int temp = x;
			x = y;
			y = y + temp;
			count++;
		}
		return 0;
	}

}
