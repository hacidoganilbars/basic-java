package com.doganilbars.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Iterate through HashMap
public class HashMap002IterateThrough {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(35, "Hac�");
		hm.put(45, "Do�an");
		hm.put(25, "ilbars");
		hm.put(10, "Java");
		hm.put(20, "Developer");
		hm.put(55, "T�rkiye");

		Set<Entry<Integer, String>> set = hm.entrySet();
		Iterator<Entry<Integer, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> mEntry = (Entry<Integer, String>) it.next();
			System.out.print("key is: " + mEntry.getKey() + " & Value is: ");
			System.out.println(mEntry.getValue());
		}

	}
}
