package com.doganilbars.main;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//iterate through treemap (generic)
public class TreeMap3IterateThrough1 {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(35, "Hacý");
		tm.put(45, "Doðan");
		tm.put(25, "Ýlbars");
		tm.put(15, "Java");
		tm.put(10, "Developer");
		tm.put(90, "Türkiye");

		Set<Entry<Integer, String>> s = tm.entrySet();

		Iterator<Entry<Integer, String>> it = s.iterator();
		while (it.hasNext()) {

			@SuppressWarnings("rawtypes")
			Map.Entry mEntry = (Entry) it.next();
			System.out.println("Key: " + mEntry.getKey() + ", Value: " + mEntry.getValue());
		}

	}
}
