package com.doganilbars.main;

//get input 2d array and display all small hourglass elements in it
//Küçük kum saati görüntüsü

public class Example003Array2DHourGlass {

	static int count = 0;

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4, 7, 8 }, { 5, 6, 7, 8, 4, 1 }, { 11, 2, 3, 5, 7, 0 }, { 1, 2, 3, 4, 7, 8 },
				{ 5, 6, 7, 8, 4, 1 }, { 11, 2, 3, 5, 7, 0 }, { 1, 2, 3, 4, 7, 8 } };

		display(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				displayAllHourGlass(arr, i, j);
			}
		}
	}

	private static void display(int arr[][]) {
		System.out.println("The elements are:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void displayAllHourGlass(int[][] arr, int row, int col) {
		if (row == 0 || row == (arr.length - 1) || col == 0 || col == (arr[0].length - 1)) {
			return;
		}
		System.out.println("HourGlass " + (++count));
		System.out.printf("%3d%3d%3d", arr[row - 1][col - 1], arr[row - 1][col], arr[row - 1][col + 1]);
		System.out.println();
		System.out.printf("%3s%3d%3s", "", arr[row][col], "");
		System.out.println();
		System.out.printf("%3d%3d%3d", arr[row + 1][col - 1], arr[row + 1][col], arr[row + 1][col + 1]);
		System.out.println();
	}
}