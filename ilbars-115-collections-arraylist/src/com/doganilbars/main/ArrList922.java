package com.doganilbars.main;

import java.util.ArrayList;
import java.util.Collections;

//Sorting an arraylist in descending order
public class ArrList922 {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Hacý");
		al.add("Doðan");
		al.add("Ýlbars");
		al.add("Java");
		al.add("Developer");
		System.out.println("Before sorting: ");
		System.out.println(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);

	}
}
