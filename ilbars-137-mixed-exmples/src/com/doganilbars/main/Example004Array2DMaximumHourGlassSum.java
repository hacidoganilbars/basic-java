package com.doganilbars.main;

import java.util.Scanner;

//Claculate the hourglass sum for every hourglass in array, then print maximum hourglass sum

/*
 * 
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
 * 
 */

public class Example004Array2DMaximumHourGlassSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		int sum = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 1; j < arr[0].length - 1; j++) {
				int temp = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] + arr[i][j] + arr[i + 1][j - 1]
						+ arr[i + 1][j] + arr[i + 1][j + 1];

				if (temp >= sum) {
					sum = temp;
				}
			}

		}
		System.out.print(sum);
		scan.close();
	}
}