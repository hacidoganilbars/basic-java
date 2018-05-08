package com.doganilbars.main;

//Convert binary to decimal 2likten 10luk sisteme
public class Convert003BinaryToDecimal {
	public static void main(String[] args) {

		double binaryNumber = 10011110000d;
		int x = 1;
		double decimalNumber = 0;

		while (binaryNumber > 0) {
			int rem = (int) (binaryNumber % 10);
			decimalNumber = decimalNumber + (rem * x);
			x = x * 2;
			binaryNumber = binaryNumber / 10;
		}
		System.out.println("Decimal Value is: " + decimalNumber);// 1264.0

	}
}
