package com.doganilbars.main;

//sum of first major diagonal
//Çapraz toplam sol üst köþeden
public class MajorDiagonal {
	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 3, 8, 7 }, { 9, 2, 7 } };
		System.out.println("Integer array is: ");
		display(arr);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == j) {
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println("Sum of the major diagonal is: " + sum);
	}

	private static void display(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
