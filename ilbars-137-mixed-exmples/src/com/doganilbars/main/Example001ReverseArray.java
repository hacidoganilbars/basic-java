package com.doganilbars.main;

import java.util.Scanner;

//print the given array in reverse order
//verilen diziyi ters sýrada yazdýr
public class Example001ReverseArray {

	public static void main(String[] args) {
		int size;
		System.out.print("Enter array size: ");
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter array[" + i + "]: ");
			arr[i] = scan.nextInt();
		}
		System.out.println("The array in reverse order: ");
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		scan.close();

	}
}