package com.doganilbars.main;

//convert  Binary to Octal
public class Convert008BinaryToOctal {
	public static void main(String[] args) {
		int binary = 101001;
		String octal = "";
		while (binary > 0) {
			int val = process(binary % 1000);
			octal = val + octal;
			binary = binary / 1000;
		}
		System.out.println("Octal value: " + octal);// 51
	}

	private static int process(int number) {
		int res = 0;
		int x = 1;
		while (number > 0) {
			int rem = number % 10;
			res = res + (rem * x);
			x = x * 2;
			number /= 10;
		}
		return res;
	}
}
