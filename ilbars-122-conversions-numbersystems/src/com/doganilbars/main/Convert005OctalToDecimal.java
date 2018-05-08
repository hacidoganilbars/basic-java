package com.doganilbars.main;

//convert decimal to octal 
public class Convert005OctalToDecimal {
	public static void main(String[] args) {

		int number = 6731;
		int decimal = 0;
		int x = 1;
		while (number > 0) {
			int rem = number % 10;
			decimal = decimal + (rem * x);
			number /= 10;
			x = x * 8;
		}
		System.out.println("Decimal Value: " + decimal);// 3545

	}
}
