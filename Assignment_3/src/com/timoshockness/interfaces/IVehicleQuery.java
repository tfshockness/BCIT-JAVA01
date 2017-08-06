package com.timoshockness.interfaces;


import com.timoshockness.model.Vehicle;

public interface IVehicleQuery {
	void addVehicle(Vehicle vehicle);
	void searchByModel(String model);
	void searchByYear(int year);
	void searchByPrice(double minPrice, double maxPrice);
	void removeVehicle(String stockCode);
	String inventoryCount();
	void displayInventory();
}
