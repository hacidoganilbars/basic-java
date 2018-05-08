package com.doganilbars.main;

//divide two numbers using + opertor
//+ operatörü kullanarak iki sayýyý böl

public class Example008Maths4 {
	public static void main(String[] args) {
		int x = 44;
		int y = 7;
		int res = -1;
		for (int i = 1; i <= x; i += y) {
			res++;
		}
		System.out.println("The product of " + x + " and " + y + " is " + res);

	}
}