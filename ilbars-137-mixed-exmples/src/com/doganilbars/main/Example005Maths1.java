package com.doganilbars.main;

//subtract two numbers using+opertor
//art� operatoru kullanarak iki say�y� ��karmak

/*
 * Sadece art� operat�rleri kullan�larak ��karma i�lemi yapmak
 * 
 */
public class Example005Maths1 {
	public static void main(String[] args) {
		int x = 11;
		int y = 6;
		int res = 0;
		for (int i = y; i < x; i++) {
			res++;
		}
		System.out.println("The difference between " + x + " and " + y + " is " + res);

	}
}