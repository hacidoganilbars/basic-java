package com.doganilbars.main;

import java.util.Scanner;

//print last fibonacci number wihin a number 'N'
public class LastFibonacci {

	public static void main(String[] args) {

		int num;
		int fibo = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		num = scan.nextInt();
		int x = 0;
		int y = 1;
		while (true) {
			if (x > num) {
				break;
			}
			fibo = x;
			int temp = x;
			x = y;
			y = y + temp;
		}
		System.out.println("The largest fibonacci within " + num + " is " + fibo);
		scan.close();
	}
}
