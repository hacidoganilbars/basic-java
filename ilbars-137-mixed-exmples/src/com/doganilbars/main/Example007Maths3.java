package com.doganilbars.main;

//Multiply two numbers using+operator

public class Example007Maths3 {
	public static void main(String[] args) {
		int x = 11;
		int y = 7;
		int res = 0;
		for (int i = 1; i <= y; i++) {
			res = res + x;
		}
		System.out.println("The product of " + x + " and " + y + " is " + res);

	}
}