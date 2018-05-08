package com.doganilbars.main;

import java.util.ArrayList;

//index of
public class ArrList910 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(40);

		System.out.println(al.indexOf(20));
		System.out.println(al.indexOf(30));
		System.out.println(al.indexOf(40));

	}
}
