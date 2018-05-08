package com.doganilbars.main;

import java.util.ArrayList;

//add ,remove and display operation in arraylist using scanner
public class ArrList5 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);

		// add lenearly, if u want to insert new element by index value
		al.add(3, 23);
		al.add(4, 28);
		System.out.println(al);
		// al.add(10,20); leads to index out of bound error. you have to add elements in
		// lenear fashion

		// insert in center
		al.add(0, 56);
		al.add(3, 100);
		System.out.println(al);
	}
}
