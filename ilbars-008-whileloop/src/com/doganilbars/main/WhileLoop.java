package com.doganilbars.main;

public class WhileLoop {
	public static void main(String[] args) {

		int number1 = 1;
		int number2 = 1;

		/*
		 * eðer number2++ deðiþkenini ekrana yazdýrmadan önce yazsaydýk 2'den baþlar
		 * 11'e kadar ekrana yazdýrýrdý
		 */
		while (number1 <= 10) {
			System.out.print(number1 + " ");
			number1++;
		}

		System.out.println();

		/*
		 * eðer ++number2 deðiþkenini ekrana yazdýrmadan önce yazsaydýk 2'den baþlar
		 * 11'e kadar ekrana yazdýrýrdý
		 */
		while (number2 <= 10) {
			System.out.print(number2 + " ");
			++number2;
		}

	}
}
