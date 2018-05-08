package com.doganilbars.main;

import java.util.TreeMap;

//TreeMap in Java
//key ile sıralama yapar
public class TreeMap1InJava {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(35, "Hacı");
		tm.put(45, "Doğan");
		tm.put(25, "İlbars");
		tm.put(15, "Java");
		tm.put(10, "Developer");
		tm.put(90, "Türkiye");

		System.out.println("TreeMap is ordered/sorted based on keys, where as HashMap is not: ");
		System.out.println(tm);

	}
}
