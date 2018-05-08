package com.doganilbars.main;

//2d array declaration and initialization and display
public class Declaration1 {
	public static void main(String[] args) {

		int[][] arr = { { 1, 3, 7 }, { 3, 4, 7 }, { 4, 8, 1 }, { 4, 5, 6 } };

		System.out.println("Array is: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
