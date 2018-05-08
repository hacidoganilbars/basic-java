package com.doganilbars.main;

//2d array declaration and initialization and display
public class Declaration {
	public static void main(String[] args) {

		int[][] arr = new int[3][2];
		arr[0][0] = 3;
		arr[0][1] = 4;
		arr[1][0] = 2;
		arr[1][1] = 6;
		arr[2][0] = 1;
		arr[2][1] = 9;

		System.out.println("Array is: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
