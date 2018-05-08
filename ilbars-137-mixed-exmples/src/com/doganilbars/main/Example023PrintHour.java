package com.doganilbars.main;

//print hour min and sec using System.currentTimeMillis();
public class Example023PrintHour {
	public static void main(String[] args) {
		long totalMilliSec = System.currentTimeMillis();
		long totalSec = totalMilliSec / 1000;
		long currentSec = totalSec % 60;
		long totalMin = totalSec / 60;
		long currentMin = totalMin % 60;
		long totalHour = totalMin / 60;
		long currentHour = totalHour % 24;
		System.out.println("Hr: " + currentHour + "\nMin: " + currentMin + "\nSec: " + currentSec);
	}
}