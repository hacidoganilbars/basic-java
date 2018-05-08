package com.doganilbars.main;

import java.util.ArrayList;
import java.util.Collections;

//use Collections.ncopies
public class ArrList915 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>(Collections.nCopies(5, 35));
		System.out.println(al);

	}
}
