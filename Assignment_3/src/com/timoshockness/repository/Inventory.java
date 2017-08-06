package com.timoshockness.repository;

import java.util.ArrayList;

import com.timoshockness.interfaces.IVehicleQuery;
import com.timoshockness.model.Vehicle;

/**
 * 
 * @author Timoteo Shockness
 *
 */
public class Inventory implements IVehicleQuery{

	private static ArrayList<Vehicle> list;
	
	public Inventory(){
		list = new ArrayList<Vehicle>();
	}

	@Override
	public void addVehicle(Vehicle vehicle) {
		if(!vehicle.equals(null)){
			list.add(vehicle);
		}
		
	}

	@Override
	public void searchByModel(String model) {
		//get model from vehicle.
		//compere if the model is same pass
		//print object.
		
	}

	@Override
	public void searchByYear(int year) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchByPrice(double minPrice, double maxPrice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVehicle(String stockCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String inventoryCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayInventory() {
		// TODO Auto-generated method stub
		
	}
	
}
