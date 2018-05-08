package com.doganilbars.main;

import java.util.Scanner;

//Yazýlan yazýda Büyük harfleri kaldýrýr
public class RemoveUppercase {
	public static void main(String[] args) {

		String str;
		int delCount = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = scan.nextLine();

		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] >= 65 && arr[j] <= 90) {
					shift(arr, j);
					delCount++;
				}
			}
		}
		str = new String(arr);
		str = str.substring(0, str.length() - delCount);
		System.out.println("After removing uppercase character: " + str);
		System.out.println("Number of deleted characters: " + delCount);

		scan.close();

	}

	private static void shift(char[] arr, int index) {
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
	}

}
