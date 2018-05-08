package com.doganilbars.main;

import java.util.Scanner;

public class MostOccuringElement {
	public static void main(String[] args) {
		int[] arr;
		int[] count;
		int max = Integer.MIN_VALUE;
		int most = 0;
		int mostValue = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = scan.nextInt();
		arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter arr[" + i + "]: ");
			arr[i] = scan.nextInt();
			if (arr[i] >= max) {
				max = arr[i];
			}
		}
		count = new int[max + 1];
		for (int i = 0; i < size; i++) {
			count[arr[i]]++;
		}

		for (int i = 0; i < size; i++) {
			if (count[arr[i]] > most) {
				most = count[arr[i]];
				mostValue = arr[i];
			}
		}
		System.out.println("The most occuring number " + mostValue + " occurs " + most + " times");
		scan.close();
	}

}
