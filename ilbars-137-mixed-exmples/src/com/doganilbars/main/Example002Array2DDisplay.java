package com.doganilbars.main;

import java.util.Scanner;

//get input 2d array and display it
//2 boyutlu diziyi görüntülemek

public class Example002Array2DDisplay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rowSize;
		int colSize;
		System.out.print("Enter number of rows: ");
		rowSize = scan.nextInt();
		System.out.print("Enter number of columns: ");
		colSize = scan.nextInt();

		int[][] arr = new int[rowSize][colSize];

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				System.out.print("Enter array[" + i + "][" + j + "]:");
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println("The array elements are: ");
		displayArr(arr);
		scan.close();
	}

	private static void displayArr(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}