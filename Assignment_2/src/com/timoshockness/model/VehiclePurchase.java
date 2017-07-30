/**
 * 
 */
package com.timoshockness.model;

import com.timoshockness.interfaces.DataFormatterInterface;
import com.timoshockness.interfaces.NameFormatterInterface;
import com.timoshockness.interfaces.PrintInterface;
import com.timoshockness.interfaces.PurchaseCalculatorInterface;

/**
 * This class is responsible to purchase a Vehicle
 * @author Timoteo Shockness
 * @version 2.0.0
 *
 */
public class VehiclePurchase implements PurchaseCalculatorInterface, PrintInterface {

	private boolean servicePackage;
	private static final double SERVICE_FEE = 500.00;
	
	/**
	 * Overload constructor
	 * @param boolean servicePackage
	 */
	public VehiclePurchase(boolean servicePackage){
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
	public void calculatePurchasePrice(double purchasePrice, Vehicle vehiclePurchased) {
		
		vehiclePurchased.checkStandardSellingPrice(purchasePrice);
		
		if(this.servicePackage){
			vehiclePurchased.setSellingPrice(vehiclePurchased.getSellingPrice() + SERVICE_FEE);
		}
		
	}

	/**
	 * Interface method override - To display information from customer, purchase date, and vehicle
	 * @param NameFormatterInterface name - implementation of fullName method
	 * @param DataFormatterInterface date - implementation of fullDate method
	 * @param Vehicle vehicle - injecting Vehicle dependency
	 */
	@Override
	public void displayDetails(NameFormatterInterface name, DataFormatterInterface date, Vehicle vehicle) {
		System.out.println("Customer: " + name.fullName());
        System.out.println("Purchase Date:" + date.fullDate());
  
        vehicle.printDetails();
        if(this.servicePackage == true)
        {
            System.out.println("SERVICE PACKAGE INCLUDED");
        }else{
        
            System.out.println("SERVICE PACKAGE NOT INCLUDED");
        }
		
	}
	
	
	
	
}
