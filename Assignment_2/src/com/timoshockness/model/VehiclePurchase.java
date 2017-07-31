/**
 * 
 */
package com.timoshockness.model;


import com.timoshockness.interfaces.IPrintDetails;
import com.timoshockness.interfaces.IPurchaseCalculator;

/**
 * This class is responsible to purchase a Vehicle
 * @author Timoteo Shockness
 * @version 2.0.0
 *
 */
public class VehiclePurchase implements IPurchaseCalculator, IPrintDetails{

	private boolean servicePackage;
	private PurchaseDate purchaseDate;
	private Customer renter;
	private Vehicle vehiclePurchased;
	private static final double SERVICE_FEE = 500.00;
	
	/**
	 * Overload constructor
	 * @param boolean servicePackage
	 */
	public VehiclePurchase(boolean servicePackage, Customer renter, PurchaseDate purchaseDate, Vehicle vehiclePurchased){
		this.renter = renter;
		this.purchaseDate = purchaseDate;
		this.vehiclePurchased = vehiclePurchased;
		setServicePackage(servicePackage);
	}

	/**
	 * 
	 * @return boolean servicePackage
	 */
	public boolean isServicePackage() {
		return servicePackage;
	}

	/**
	 * 
	 * @param boolean servicePackage - sets with the car has service Package include
	 */
	public void setServicePackage(boolean servicePackage) {
		this.servicePackage = servicePackage;
	}


	/**
	 * Interface method override - To calculate the purchase price
	 * @param double purchasePrice
	 * @param Vehicle vechiclePurchase - injecting Vehicle dependency
	 */
	@Override
	public void calculatePurchasePrice(double purchasePrice) {
		
		this.vehiclePurchased.checkStandardSellingPrice(purchasePrice);
		
		if(this.servicePackage){
			this.vehiclePurchased.setSellingPrice(this.vehiclePurchased.getSellingPrice() + SERVICE_FEE);
		}
		
	}

	/**
	 * Interface method override - To display information from customer, purchase date, and vehicle
	 * @param NameFormatterInterface name - implementation of fullName method
	 * @param DataFormatterInterface date - implementation of fullDate method
	 * @param Vehicle vehicle - injecting Vehicle dependency
	 */
	@Override
	public void displayDetails() {
		System.out.println("Customer: " + renter.fullName());
        System.out.println("Purchase Date:" + purchaseDate.fullDate());
  
        this.vehiclePurchased.displayDetails();
        if(this.servicePackage == true)
        {
            System.out.println("SERVICE PACKAGE INCLUDED");
        }else{
        
            System.out.println("SERVICE PACKAGE NOT INCLUDED");
        }
		
	}
	
	
	
	
}
