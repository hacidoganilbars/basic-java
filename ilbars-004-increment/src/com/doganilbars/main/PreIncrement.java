package com.doganilbars.main;

public class PreIncrement {

	public static void main(String[] args) {

		int number1 = 10, number2 = 20;
		int number3 = 5, number4 = 7;

		// number1 1 artar 11 olur
		++number1;
		System.out.println("Now number1: " + number1);
		// number2 1 artar 21 olur
		System.out.println("Now number2 " + (++number2));// first the number2 gets incremented
		// number3 artmaz 5 kalır
		System.out.println("Now number3: " + (number3++));
		// number4 değeri 1 artar 8 olur
		number4++;
		System.out.println("Now number4: " + (number4));
		// number3 şimdi 1 artar 6 olur
		System.out.println("New value number3: " + number3);

	}

}
