package com.doganilbars.main;

import java.util.Arrays;
import java.util.Vector;

//simple vector
public class SimpleVector {

	public static void main(String[] args) {

		Vector<Integer> vec = new Vector<Integer>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		vec.add(10);
		System.out.println(vec);

		Vector<String> vec1 = new Vector<String>();
		vec1.add("Hac�");
		vec1.add("Do�an");
		vec1.add("�lbars");
		vec1.add("Java");
		vec1.add("Developer");
		vec1.add("T�rkiye");
		System.out.println(vec1);

		Vector<String> vec2 = new Vector<String>(
				Arrays.asList("Pazartesi", "Sal�", "�ar�amba", "Per�embe", "Cuma", "Cumartesi", "Pazar"));
		System.out.println(vec2);

	}
}
