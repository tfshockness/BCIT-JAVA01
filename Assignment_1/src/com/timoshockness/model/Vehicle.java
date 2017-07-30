package com.timoshockness.model;

import java.text.DecimalFormat;

/**
 * 
 * @author Timoteo Shockness
 * @version 1.0
 *
 */
public class Vehicle {
	private String stockCode;
	private String make;
	private String model;
	private int year;
	private double dealerCost;
	private double sellingPrice;
	private double profitMargin;
	
	
	/**
	 * Default Constructor
	 */
	public Vehicle(){
		
	}
	
	/**
	 * 
	 * @param stockCode - Unique code for the Vehicle.
	 * @param make - Factory / Brand
	 * @param model - Vehicle Model
	 * @param year - Year of fabrication
	 */
	public Vehicle(String stockCode, String make, String model, int year){
		setStockCode(stockCode);
		setMake(make);
		setModel(model);
		setYear(year);
	}

	/**
	 * 
	 * @return String stockCode
	 */
	public String getStockCode() {
		return stockCode;
	}

	/**
	 * 
	 * @param String stockCode - Unique code for the Vehicle
	 */
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	/**
	 * 
	 * @return String make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * 
	 * @param String make - Factory where the car was built
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * 
	 * @return String model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * 
	 * @param String model - Vehicle model
	 */
	public void setModel(String model) {
		this.model = model;
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
	 * @param int year - sets the year of fabrication
	 */
	public void setYear(int year) {
		if(year >= 1970 && year <= 2017){
			this.year = year;
		}
		
	}

	/**
	 * 
	 * @return double dealerCost
	 */
	public double getDealerCost() {
		return dealerCost;
	}

	/**
	 * 
	 * @param double dealerCost - value that dealer paid to purchase a Vehicle
	 */
	public void setDealerCost(double dealerCost) {
		if(dealerCost > 0){
			this.dealerCost = dealerCost;
		}
		
	}

	/**
	 * 
	 * @return double sellingPrice
	 */
	public double getSellingPrice() {
		return sellingPrice;
	}

	/**
	 * 
	 * @param sellingPrice - sets the selling price of the Vehicle
	 */
	public void setSellingPrice(double sellingPrice) {
		if(sellingPrice > 0){
			this.sellingPrice = sellingPrice;
		}
		
	}

	/**
	 * 
	 * @return double profiMargin
	 */
	public double getProfitMargin() {
		return profitMargin;
	}

	/**
	 * Calculates the profit made on selling a vehicle as a percentage
	 */
	public void calculateProfitMargin() {
		this.profitMargin = (this.sellingPrice - this.dealerCost) / this.sellingPrice;
	}
	
	/**
	 * Calculates the profit made on selling a vehicle as a dollar value.
	 * @return double (sellingPrice - dealerCost)
	 */
	public double calculateProfit(){
		return this.sellingPrice - this.dealerCost;
	}
	
	/**
	 * Method to print the selling details
	 */
	public void printDetails(){
        System.out.println("Jalopies Are Us Vehicle Summary: ");
        System.out.println("Vehicle: " + this.year +" "+ this.make + " " + this.model);
        System.out.println("Stock Code: " + this.stockCode);
        System.out.printf("Dealer Cost: $%.2f%n ", this.dealerCost);
        System.out.printf("Selling Price: $%.2f%n ",this.sellingPrice);
        System.out.printf("Profit Margin: %.2f%%%n", this.profitMargin );
        System.out.println("Dollar Profit: " + new DecimalFormat("$##.##").format(calculateProfit()));
	}
}
