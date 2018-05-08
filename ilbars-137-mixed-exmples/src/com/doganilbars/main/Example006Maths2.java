package com.doganilbars.main;

//Multiply two numbers using+operator
//+ operatörünü kullanarak iki sayýyý çarpmak

public class Example006Maths2 {
	public static void main(String[] args) {
		int x = 11;
		int y = 7;
		int res = 1;
		for (int i = 1; i <=y; i++) {
			res=i*x;
		}
		System.out.println("The product of " + x + " and " + y + " is " + res);

	}
}