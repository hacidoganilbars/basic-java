package com.doganilbars.main;

import java.util.HashMap;

//copy a hashmap to another
public class HashMap011CopyOtherHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(35, "Hac�");
		hm.put(45, "Do�an");
		hm.put(25, "ilbars");
		hm.put(10, "Java");
		hm.put(20, "Developer");
		hm.put(55, "T�rkiye");

		HashMap<Integer, String> hm1 = new HashMap<Integer, String>(hm);// dikkat parametre ge�ildi
		System.out.println(hm1);

	}
}
