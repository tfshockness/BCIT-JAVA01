
package com.timoshockness.interfaces;

import com.timoshockness.model.Vehicle;

public interface PrintInterface {
	void displayDetails(NameFormatterInterface name, DataFormatterInterface data, Vehicle vehicle);
}
