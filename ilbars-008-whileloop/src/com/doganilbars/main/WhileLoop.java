package com.doganilbars.main;

public class WhileLoop {
	public static void main(String[] args) {

		int number1 = 1;
		int number2 = 1;

		/*
		 * e�er number2++ de�i�kenini ekrana yazd�rmadan �nce yazsayd�k 2'den ba�lar
		 * 11'e kadar ekrana yazd�r�rd�
		 */
		while (number1 <= 10) {
			System.out.print(number1 + " ");
			number1++;
		}

		System.out.println();

		/*
		 * e�er ++number2 de�i�kenini ekrana yazd�rmadan �nce yazsayd�k 2'den ba�lar
		 * 11'e kadar ekrana yazd�r�rd�
		 */
		while (number2 <= 10) {
			System.out.print(number2 + " ");
			++number2;
		}

	}
}
