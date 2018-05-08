package com.doganilbars.main;

import java.util.ArrayList;
import java.util.Arrays;

//while loop in arraylist
public class ArrList918 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

		int count = 0;
		while (count < al.size()) {
			System.out.println(al.get(count));
			count++;
		}
	}
}
