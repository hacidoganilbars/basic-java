package com.doganilbars.main;

//convert  Binary to Octal
public class Convert011BinaryToOctal {
	public static void main(String[] args) {
		String binary = "11010100001100010110";
		String hexaDecimal = "";
		for (int i = 0; i < binary.length(); i++) {
			int len = binary.length();
			String temp = process(binary.substring(len - 4, len));
			hexaDecimal = temp + hexaDecimal;
			binary = binary.substring(0, len - 4);
		}
		System.out.println("Hexedecimal: " + hexaDecimal);// 4316
	}

	private static String process(String str) {
		int number = Integer.valueOf(str);
		int res = 0;
		int x = 1;
		while (number > 0) {

			res = res + ((number % 10) * x);
			x = x * 2;
			number /= 10;
		}
		String val = "";
		if (res >= 0 && res <= 9) {
			val = val + res;
		} else {
			val = val + (char) (res + 55);
		}
		return val;
	}
}
