package com.doganilbars.main;

//find greatest element (büyük sayý)
public class SmallestElement {
	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 9 }, { 3, 8, 7, 0 }, { 9, 2, 7, 1 } };
		System.out.println("Integer array is: ");
		display(arr);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("Smallest element: " + min);

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
