/**
 * 
 */
package com.timoshockness.model;

import com.timoshockness.interfaces.NameFormatterInterface;

/**
 * Class responsible for create a customer
 * @author Timoteo Shockness
 * @version 2.0.0
 *
 */
public class Customer implements NameFormatterInterface {

	private String firstName;
	private String lastName;
	private String driversLicense;
	private String address;
	private long phoneNumber;
	
	/**
	 * Default Constructor
	 */
	public Customer(){
		
	}
	
	/**
	 * Overload Constructor
	 * @param String firstName
	 * @param String lastName
	 * @param String driversLicense
	 * @param String address
	 * @param long phoneNumber
	 */
	public Customer(String firstName, String lastName, String driversLicense, String address, long phoneNumber){
		setFirstName(firstName);
		setLastName(lastName);
		setDriversLicense(driversLicense);
		setAddress(address);
		setPhoneNumber(phoneNumber);
	}

	/**
	 * 
	 * @return String firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @param String firstName - sets customer's first name
	 */
	public void setFirstName(String firstName) {
		if(!firstName.equals(null) && !firstName.isEmpty()){
			this.firstName = firstName;
		}
		
	}

	/**
	 * 
	 * @return String lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @param String lastName - sets customer's last name
	 */
	public void setLastName(String lastName) {
		if(!lastName.equals(null) && !lastName.isEmpty()){
			this.lastName = lastName;
		}
		
	}

	/**
	 * 
	 * @return String driversLicense
	 */
	public String getDriversLicense() {
		return driversLicense;
	}

	/**
	 * 
	 * @param String driversLicense - sets customer's driversLicense
	 */
	public void setDriversLicense(String driversLicense) {
		if(!driversLicense.equals(null) && !driversLicense.isEmpty()){
			this.driversLicense = driversLicense;
		}
		
	}

	/**
	 * 
	 * @return String address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 
	 * @param String address - sets customer's address
	 */
	public void setAddress(String address) {
		if(!address.equals(null) && !address.isEmpty()){
			this.address = address;
		}
		
	}

	/**
	 * 
	 * @return long phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * 
	 * @param long phoneNumber - sets customer's phone
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Override method - Interface to format name
	 */
	@Override
	public String fullName() {
        String fst = firstName;
        String first = fst.substring(0, 1).toUpperCase();
        String rest = fst.substring(1).toLowerCase();
        
        //Fixing Last Name
        String lst = lastName;
        String lfirst = lst.substring(0, 1).toUpperCase();
        String lrest = lst.substring(1).toLowerCase();
            
        return first + rest + " " + lfirst + lrest; 
		
	}
	
	
	
}
