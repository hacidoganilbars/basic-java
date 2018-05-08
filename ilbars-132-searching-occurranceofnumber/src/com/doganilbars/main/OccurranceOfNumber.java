package com.doganilbars.main;

//find total number of ocurrance of a number in another number
//occurrance=meydana gelmesinden sonra
public class OccurranceOfNumber {

	public static void main(String[] args) {
		int number = 16416491;
		int key = 4;

		// solution
		int count = 0;
		int temp = number;
		while (temp > 0) {
			if ((temp % 10) == key) {
				count++;
			}
			temp /= 10;
		}
		System.out.println("The key " + key + " has been found " + count + " times in");

	}
}