package com.doganilbars.main;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//TimerTask
public class Example024DisplayTime {
	public static void main(String[] args) {

		TimerTask timerTask = new TimerTask() {

			@Override
			public void run() {
				long totalMilliSec = System.currentTimeMillis();
				long totalSec = totalMilliSec / 1000;
				long currentSec = totalSec % 60;
				long totalMin = totalSec / 60;
				long currentMin = totalMin % 60;
				long totalHour = totalMin / 60;
				long currentHour = totalHour % 24;
				System.out.println("Hr:" + currentHour + " Min:" + currentMin + " Sec:" + currentSec);

			}
		};
		Timer timer = new Timer();
		timer.schedule(timerTask, new Date(), 1000);

	}
}