package com.doganilbars.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//display date
public class Example025DisplayDate {
	public static void main(String[] args) {

		String timesStamp = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss").format(Calendar.getInstance().getTime());

		System.out.println(timesStamp);
	}
}