package com.doganilbars.main;

import java.util.ArrayList;
import java.util.Collections;

//Sorting an arraylist Collections.sort(..)
public class ArrList921 {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Hac�");
		al.add("Do�an");
		al.add("�lbars");
		al.add("Java");
		al.add("Developer");
		System.out.println("Before sorting: ");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

	}
}
