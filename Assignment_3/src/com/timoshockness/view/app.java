/**
 * 
 */
package com.timoshockness.view;

import com.timoshockness.model.Customer;
import com.timoshockness.model.PurchaseDate;
import com.timoshockness.model.Vehicle;
import com.timoshockness.model.VehiclePurchase;

/**
 * @author Timoteo Shockness
 * @version 2.0
 *
 */
public class app {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer customer = new Customer("Timoteo", "Shockness", "ABC009725", "Vancouver, Canada", 77887787);
		PurchaseDate date = new PurchaseDate(2017, 07, 30);
		Vehicle car = new Vehicle("bmw2017m3", "BMW", "M3", 2017);
		
		car.setSellingPrice(15000);
		car.setDealerCost(2500);
		car.calculateProfitMargin();
		
		VehiclePurchase vp = new VehiclePurchase(true, customer, date, car);
		vp.calculatePurchasePrice(19000);
		
		vp.displayDetails();


	}

}
