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
		vec1.add("Hacý");
		vec1.add("Doðan");
		vec1.add("Ýlbars");
		vec1.add("Java");
		vec1.add("Developer");
		vec1.add("Türkiye");
		System.out.println(vec1);

		Vector<String> vec2 = new Vector<String>(
				Arrays.asList("Pazartesi", "Salý", "Çarþamba", "Perþembe", "Cuma", "Cumartesi", "Pazar"));
		System.out.println(vec2);

	}
}
