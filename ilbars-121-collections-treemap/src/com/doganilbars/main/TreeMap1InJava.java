package com.doganilbars.main;

import java.util.TreeMap;

//TreeMap in Java
//key ile s�ralama yapar
public class TreeMap1InJava {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(35, "Hac�");
		tm.put(45, "Do�an");
		tm.put(25, "�lbars");
		tm.put(15, "Java");
		tm.put(10, "Developer");
		tm.put(90, "T�rkiye");

		System.out.println("TreeMap is ordered/sorted based on keys, where as HashMap is not: ");
		System.out.println(tm);

	}
}
