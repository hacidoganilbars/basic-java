package com.doganilbars.main;

//subtract two numbers using +operator

public class Example009Maths5 {
	public static void main(String[] args) {
		int x = -6;
		int y = 11;
		if (y > x) {
			int temp = x;
			x = y;
			y = temp;
		}
		int res = 0;
		for (int i = y; i < x; i++) {
			res++;
		}
		System.out.println("The difference between " + x + " and " + y + " is " + res);
	}
}