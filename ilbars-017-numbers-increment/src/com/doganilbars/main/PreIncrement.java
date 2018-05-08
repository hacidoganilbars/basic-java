package com.doganilbars.main;

import java.util.Scanner;

public class PreIncrement {
	public static void main(String[] args) {
		int a, b, c, d, e;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any integer a: ");
		a = scan.nextInt();
		b = ++a;
		System.out.println("Result after Pre Increment a: " + a);
		System.out.println("Result after Pre Increment b: " + b);
		c = a++;
		System.out.println("Result after Pre Increment a: " + a);
		System.out.println("Result after Post Increment c: " + c);
		d = --a;
		System.out.println("Result after Pre Increment a: " + a);
		System.out.println("Result after Pre Increment d: " + d);
		e = a--;
		System.out.println("Result after Pre Increment a: " + a);
		System.out.println("Result after Post Increment e: " + e);

		scan.close();
	}

}
