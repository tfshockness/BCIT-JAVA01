/**
 * 
 */
package com.timoshockness.model;

import com.timoshockness.interfaces.DataFormatterInterface;

/**
 * @author Timoteo Shockness
 * @version 2.0.0
 *
 */
public class PurchaseDate implements DataFormatterInterface {

	//Constants
	private static final int CURRENT_YEAR = 2017;
	private static final int  JANUARY = 1;
	private static final int DECEMBER = 12;
	private static final int FIRST_DAY = 1;
	private static final int LAST_DAY = 31;
	
	//Instance variables
	private int year;
	private int month;
	private int day;
	
	/**
	 * Default constructor
	 */
	public PurchaseDate(){
		
	}
	
	/**
	 * Overload Constructor
	 * @param year
	 * @param month
	 * @param day
	 */
	public PurchaseDate(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	/**
	 * 
	 * @return int year
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * 
	 * @param int year - sets year
	 */
	public void setYear(int year) {
		if(year <= CURRENT_YEAR){
			this.year = year;
		}
		
	}
	
	/**
	 * 
	 * @return int month
	 */
	public int getMonth() {
		return month;
	}
	
	/**
	 * 
	 * @param int month - sets month
	 */
	public void setMonth(int month) {
		if(month >= JANUARY && month <= DECEMBER){
			this.month = month;
		}
		
	}
	
	/**
	 * 
	 * @return int day
	 */
	public int getDay() {
		return day;
	}
	
	/**
	 * 
	 * @param int day - sets day
	 */
	public void setDay(int day) {
		if(day >= FIRST_DAY && day <= LAST_DAY){
			this.day = day;
		}
		
	}

	/**
	 * Interface Override method - implements date format
	 */
	@Override
	public String fullDate() {
		
		return this.year + "-" + this.month + "-" + this.day;
	}

}
