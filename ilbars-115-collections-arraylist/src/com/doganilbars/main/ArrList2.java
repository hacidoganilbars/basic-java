package com.doganilbars.main;

import java.util.ArrayList;
import java.util.Scanner;

//add data to ArrayList
public class ArrList2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		int data = 0;

		do {
			System.out.print("Enter the data:(-1 to exit): ");
			data = scan.nextInt();
			if (data != -1) {
				al.add(data);
			}
		} while (data != -1);
		System.out.println(al);
		scan.close();

	}
}
