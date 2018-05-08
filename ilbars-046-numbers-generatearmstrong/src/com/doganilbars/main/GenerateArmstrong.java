package com.doganilbars.main;

import java.util.Scanner;

//generate armstrong number within a number

/*
 * 
 *  Tüm basamaklarýndaki rakamlarýn sayý deðerlerinin küpleri toplamý,kendisine eþit olan sayýlara "Armstrong sayý"denir.
 *  
 *  Örneðin; 371=33+73+13=27+343+1=371
 * 
 * 
 */
public class GenerateArmstrong {

	public static void main(String[] args) {
		int limit;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		limit = scan.nextInt();
		for (int i = 1; i <= limit; i++) {
			if (isArmstrong(i)) {
				System.out.print(i + ", ");
			}
		}
		scan.close();
	}

	private static boolean isArmstrong(int number) {
		int temp = number;
		int len = findLength(number);
		int result = 0;
		while (number > 0) {
			int rem = number % 10;
			result = (int) (result + Math.pow(rem, len));
			number = number / 10;
		}
		if (result == temp) {
			return true;
		} else {
			return false;
		}
	}

	private static int findLength(int number) {
		int len = 0;
		while (number > 0) {
			len++;
			number = number / 10;
		}
		return len;
	}
}
