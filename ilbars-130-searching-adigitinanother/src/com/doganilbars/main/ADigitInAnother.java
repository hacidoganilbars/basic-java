package com.doganilbars.main;

//search for a single digit number in another number
public class ADigitInAnother {

	public static void main(String[] args) {

		int number = 42374823;
		int key = 4;
		int place = 1;
		boolean flag = false;
		while (number > 0) {
			int rem = number % 10;
			if (key == rem) {
				System.out.println(key + " is found in " + place + "'s place");
				flag = true;
			}
			number = number / 10;
			place = place * 10;
		}
		if (flag == false) {
			System.out.println("Key Not Found");
		}

	}
}