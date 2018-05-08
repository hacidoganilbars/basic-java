package com.doganilbars.main;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//sort HashMap by Keys
public class HashMap007SortByKeys {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(35, "Hacý");
		hm.put(45, "Doðan");
		hm.put(25, "ilbars");
		hm.put(10, "Java");
		hm.put(20, "Developer");
		hm.put(55, "Türkiye");

		System.out.println("Before sorting");
		System.out.println(hm);

		Map<Integer, String> mp = new TreeMap<Integer, String>(hm);
		System.out.println("\nAfter sorting");
		System.out.println(mp);

	}
}
