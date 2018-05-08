package com.doganilbars.main;

//convert  Binary to Octal
public class Convert010BinaryToHexadecimal {
	public static void main(String[] args) {
		String binary = "11010100001100010110";
		int octal = 0;
		int x = 1;
		while (binary.length() > 2) {
			int len = binary.length();
			String temp = binary.substring(len - 3, len);
			binary = binary.substring(0, len - 3);
			int val = process(temp);
			octal = (val * x) + octal;
			x = x * 10;
		}
		int val = process(binary);
		octal = (val * x) + octal;
		System.out.println("Octal: " + octal);// 3241426
	}

	private static int process(String temp) {
		int number = Integer.valueOf(temp);
		int x = 1;
		int octal = 0;
		while (number > 0) {
			int rem = number % 10;
			octal = octal + (rem * x);
			x = x * 2;
			number /= 10;
		}
		return octal;

	}
}
