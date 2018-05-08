package com.doganilbars.main;

//Convert decimal to binary
public class Convert002DecimalToBinary1 {
	public static void main(String[] args) {

		int decimalNumber = 1264;
		String str = "";
		while (decimalNumber > 0) {
			int rem = decimalNumber % 2;
			str = rem + str;
			// decimalNumber = decimalNumber / 2;
			decimalNumber /= 2;
		}
		System.out.println("Binary value is: " + str);// 10011110000
	}
}
