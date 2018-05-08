package com.doganilbars.main;

//convert  hexadecimal to decimal
public class Convert007HexaDecimalToDecimal {
	public static void main(String[] args) {
		String hexaDecimal = "5BAB";
		int decimal = 0;
		int x = 1;
		for (int i = hexaDecimal.length() - 1; i >= 0; i--) {
			int temp = process(hexaDecimal.charAt(i));
			decimal = decimal + (temp * x);
			x = x * 16;
		}
		System.out.println("Decimal Value is: " + decimal);// 23467
	}

	private static int process(char ch) {
		int number = 0;
		if (ch >= 65 && ch <= 70) {
			number = (int) ch - 55;
		} else {
			number = (int) ch - 48;
		}
		return number;
	}
}
