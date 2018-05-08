package com.doganilbars.main;

import java.util.Scanner;

public class UserInput1 {
	public static void main(String[] args) {

		int n;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter arr[" + i + "]: ");
			arr[i] = scan.nextInt();
		}
		System.out.println("The array element are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}
		scan.close();
	}

}
