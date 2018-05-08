package com.doganilbars.main;

//convert decimal to octal 
public class Convert004DecimalToOctal {
	public static void main(String[] args) {

		int number = 3545;
		String octal = "";
		while (number > 0) {
			int rem = (int) number % 8;
			octal = rem + octal;
			// number=number/8;
			number /= 8;
		}
		System.out.println("Octal Value is: " + octal);

	}
}
