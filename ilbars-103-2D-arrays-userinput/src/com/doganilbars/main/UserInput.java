package com.doganilbars.main;

import java.util.Scanner;

//get array inputs from user
public class UserInput {
	public static void main(String[] args) {

		int row;
		int col;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter row length: ");
		row = scan.nextInt();
		System.out.print("Enter column length: ");
		col = scan.nextInt();

		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Enter array[" + i + "][" + j + "]:");
				arr[i][j] = scan.nextInt();
			}

		}
		System.out.println("Array is: ");
		display(arr);
		scan.close();

	}

	private static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("%3d", arr[i][j]);
				// System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
