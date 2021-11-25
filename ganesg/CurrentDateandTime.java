package com.ganesg;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CurrentDateandTime {

	public static void main(String[] args) {
		int day,month,year;
		int second,minute,hour;
		
		GregorianCalendar date=new GregorianCalendar();
		
		day=date.get(Calendar.DAY_OF_MONTH);
		month=date.get(Calendar.MONTH);
		year=date.get(Calendar.YEAR);
		
		System.out.println("Current Date:- "+day+"/"+month+"/"+year);
		
		second=date.get(Calendar.SECOND);
		minute=date.get(Calendar.MINUTE);
		hour=date.get(Calendar.HOUR);
		
		System.out.println("Current Time:- "+hour+":"+minute+":"+second);
		
		LocalDate name=LocalDate.now();
		day=name.getDayOfMonth();
		System.out.println(day);
		System.out.println(name);
	}

}
