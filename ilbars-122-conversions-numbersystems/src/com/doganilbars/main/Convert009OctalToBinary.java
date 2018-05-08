package com.doganilbars.main;

//convert  Octal to Binary
public class Convert009OctalToBinary {
	public static void main(String[] args) {
		int octal = 3241446;
		String binary = "";
		while (octal > 0) {
			String val = process(octal % 10);
			binary = val + binary;
			octal /= 10;
		}
		System.out.println("Binary: " + binary);// 011010100001100100110
	}

	private static String process(int number) {
		String temp = "";
		String just = "000";
		while (number > 0) {
			int rem = number % 2;
			temp = rem + temp;
			number /= 2;
		}
		temp = just + temp;
		int len = temp.length();
		temp = temp.substring(len - 3, len);
		return temp;
	}
}
