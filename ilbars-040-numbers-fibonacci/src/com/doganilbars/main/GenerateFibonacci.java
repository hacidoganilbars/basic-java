package com.doganilbars.main;

import java.util.Scanner;

//generate fibonacci series upto some limit
public class GenerateFibonacci {
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		n = scan.nextInt();
		int x = 0;
		int y = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(x + " ");
			int temp = x;
			x = y;
			y = temp + y;
		}
		scan.close();
	}
}
