package com.doganilbars.main;

import java.util.Scanner;

//548834
//find whether the input number is armstrong number or not
/*
 * 
 *  Tüm basamaklarýndaki rakamlarýn sayý deðerlerinin küpleri toplamý,kendisine eþit olan sayýlara "Armstrong sayý"denir.
 *  
 *  Örneðin; 371=3^3+7^3+1^3=27+343+1=371
 * 
 * 
 */
public class ArmstrongCheck {
	public static void main(String[] args) {
		int number;
		int len = 0;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		int temp = number;

		// first find the length of the number
		while (temp > 0) {
			len++;
			temp = temp / 10;
		}

		temp = number;
		// now find sum of power of each digit in the number with the length of the
		// number
		while (temp > 0) {
			int rem = temp % 10;
			result = result + findPow(rem, len);
			temp = temp / 10;
		}
		// if it matches,then it is an armstrong number
		if (result == number) {
			System.out.println("It is an armstrong number");
		} else {
			System.out.println("It is not an armstrong number");
		}
		scan.close();

	}

	// method to find power of a number
	private static int findPow(int number, int power) {
		int sum = 1;
		for (int i = 1; i <= power; i++) {
			sum = number * sum;
		}
		return sum;
	}

}
