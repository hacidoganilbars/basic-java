package com.doganilbars.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Example026DaysCount {
	public static void main(String[] args) {

		String from = "16 04 1987";
		String to = "09 05 2018";
		SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
		try {
			Date date1 = sdf.parse(from);
			Date date2 = sdf.parse(to);
			long diff = date2.getTime() - date1.getTime();
			System.out.println("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}