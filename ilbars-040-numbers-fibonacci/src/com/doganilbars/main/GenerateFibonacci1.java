package com.doganilbars.main;

import java.util.Scanner;

//generate fibonacci series wthin some range
public class GenerateFibonacci1 {
	public static void main(String[] args) {
		int beg;
		int end;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the beginning: ");
		beg = scan.nextInt();
		System.out.print("Enter the beginning: ");
		end = scan.nextInt();
		int x = 0;
		int y = 1;
		while (x <= end) {
			int temp = x;
			x = y;
			y = temp + y;
			if (x >= beg && x <= end) {
				System.out.println(x + " ");
			}
		}
		scan.close();
	}

}
