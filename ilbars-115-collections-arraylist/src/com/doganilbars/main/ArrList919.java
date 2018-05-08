package com.doganilbars.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//Iterator in arraylist
public class ArrList919 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
