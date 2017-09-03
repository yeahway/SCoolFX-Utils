/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.api.utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Shekkar Raee
 */
public class DateTime {
	
	/**
	 * Returns current date; Year month day, day-name.
	 * @return current-date
	 */
	public String getCurrentDate() {		
		DateTimeFormatter dateFormater=DateTimeFormatter.ofPattern("YYYY MMM d, EEEE");
		String dateText=LocalDate.now().format(dateFormater);
		return dateText;
	}
	
	/**
	 * Returns current day.
	 * @return current-day
	 */
	public String getDay() {		
		DateTimeFormatter dateFormater=DateTimeFormatter.ofPattern("d");
		String dateText=LocalDate.now().format(dateFormater);
		return dateText;
	}
	
	/**
	 * Returns current time; Year month day, day-name.
	 * @return current-time
	 */
	public String getCurrentTime() {		
		LocalTime time = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("K:mm:ss a");
		String text = time.format(formatter);
		return text;
	}
	
	/**
	 * Returns current date-time.
	 * @return date-time
	 */
	public String getDateAndTime() {
		String combine = getCurrentDate() +" " + getCurrentTime();
		return combine;
	}
	
	/**
	 * 
	 * @return AM or PM
	 */
	public String getAMPM() {
		LocalTime time = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("a");
		String text = time.format(formatter);
		return text;		
	}
	/**
	 * 
	 * @return Year
	 */
	public String getCurrentYear() {
		DateTimeFormatter dateFormater=DateTimeFormatter.ofPattern("YYYY");
		String dateText=LocalDate.now().format(dateFormater);
		return dateText;
	}
	
	/**
	 * 
	 * @return Year
	 */
	public String getCurrentMonth() {
		DateTimeFormatter dateFormater=DateTimeFormatter.ofPattern("MMM");
		String dateText=LocalDate.now().format(dateFormater);
		return dateText;
	}
	
	/**
	 * 
	 * @return current-hour
	 */
	public int getHour() {
		LocalTime time = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("K");
		String text = time.format(formatter);
		return Integer.parseInt(text);		
	}
	
	/**
	 * 
	 * @return minutes
	 */
	public int getMinute() {
		LocalTime time = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm");
		String text = time.format(formatter);
		return Integer.parseInt(text);				
	}
	
	/**
	 * 
	 * @return seconds
	 */
	public int getSeconds() {
		LocalTime time = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss");
		String text = time.format(formatter);
		return Integer.parseInt(text);				
	}
	
	/**
	 * Checks the time of the day for greeting.
	 * @return greeting
	 */
	public String getGreeting() {
		String greeting = "Good Morning";
		if(getAMPM().equals("PM")) {
			if(getHour() > 5) {
				greeting = "Good Evening";
			}
			else{
				greeting = "Good Afternoon";
			}
		}
		return greeting;
	}
	
	/**
	 * 
	 * @return current-time-object
	 */
	public Object[] getCurrentTimeObject() {
		Object object[] = new Object[4];
		object[0] = getHour();
		object[1] = getMinute();
		object[2] = getSeconds();
		object[3] = getAMPM();
		return object;
	}
	/**
	 * Calculates the difference time between current time and the provided starting time.
	 * @param start
	 * @return difference-time
	 */
	public String getDifferenceTime(Object start[]) {
		Object gap[] = new Object[3];
		Object current[] = getCurrentTimeObject();
		if(current[3].equals(start[3])) {
			if(current[0] == start[0]) {
				gap[0] = "00";
			}else{
				int dif = (int)current[0] -  (int)start[0];
				gap[0] = appendZeros(String.valueOf(dif));
			}
			if(current[1] == start[1]) {
				gap[1] = "00";
			}else{
				int dif = (int)current[1] -  (int)start[1];
				gap[1] = appendZeros(String.valueOf(dif));				
			}
			if(current[2] == start[2]) {
				gap[2] = "00";
			}else{
				int dif = (int)current[2] -  (int)start[2];
				gap[2] = appendZeros(String.valueOf(dif));				
			}
		}
		String duration = gap[0] +":" + gap[1] +":" + gap[2];
		return duration;		
	}
	
	/**
	 * Appends zero for the provided value.
	 * @param value
	 * @return zero-appended-value
	 */
	public String appendZeros(String value) {
		return "00".substring(value.length()) + value;
	}
}
