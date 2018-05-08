package com.doganilbars.main;

import java.util.ArrayList;
import java.util.Arrays;

//enhanced for loop in arraylist
public class ArrList917 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

		for (Integer i : al) {
			System.out.println(i);
		}

	}
}
