package com.doganilbars.main;

import java.util.ArrayList;
import java.util.Arrays;

//simple for loop in arraylist
public class ArrList916 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

	}
}
