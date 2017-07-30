package com.timoshockness.view;

import com.timoshockness.model.Vehicle;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Vehicle("bmw2017m3", "BMW", "M3", 2017);
		car.setSellingPrice(15000);
		car.setDealerCost(2500);
		car.calculateProfitMargin();
		car.printDetails();
		
	}

}
