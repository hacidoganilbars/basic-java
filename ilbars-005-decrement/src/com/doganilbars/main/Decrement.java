package com.doganilbars.main;

public class Decrement {
	public static void main(String[] args) {

		int number1 = 10, number2 = 20;
		number1--;
		System.out.println("Now number1: " + number1);
		System.out.println("Now number2: " + (number2--));
		/*
		 * System.out.println(number2); alttaki ile ayn� etkiyi yapar
		 *
		 * ancak alttaki number2 tekrar altta �a��r�lsayd� number2 de�eri 18 olurdu
		 */

		System.out.println("Nownumber2: " + (number2--));

	}

}
