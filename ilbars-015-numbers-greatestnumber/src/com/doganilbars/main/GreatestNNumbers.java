package com.doganilbars.main;

import java.util.Scanner;

//find greatest among n numbers
public class GreatestNNumbers {
	public static void main(String[] args) {

		int quantity, temp, max = Integer.MIN_VALUE;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of inputs: ");
		quantity = scan.nextInt();

		for (int i = 1; i <= quantity; i++) {
			System.out.print("Enter Number " + i + ": ");
			temp = scan.nextInt();
			if (temp >= max) {
				max = temp;
			}
		}
		System.out.println("The greatest number is " + max);
		scan.close();
	}
}
