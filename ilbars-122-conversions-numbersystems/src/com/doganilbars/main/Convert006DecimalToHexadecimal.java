package com.doganilbars.main;

//convert decimal to hexadecimal
public class Convert006DecimalToHexadecimal {
	public static void main(String[] args) {

		int number = 23467;
		String hexaDecimal = "";
		while (number > 0) {
			int rem = number % 16;
			hexaDecimal = (process(rem)) + hexaDecimal;
			number = number / 16;
		}
		System.out.println("Hexadecimal value is: " + hexaDecimal);
	}

	private static String process(int number) {
		String temp = "";
		if (number >= 0 && number <= 9) {
			temp = temp + number;
		} else {
			temp = temp + (char) (number + 55);
		}
		return temp;
	}
}
