<section>
  <h1>Assignment 2</h1>
  <p>The purpose of this assignment is to exercise your knowledge from lessons 1 – 8. </p>
  <p><strong>PS: The techniques and principles applied in this app is out of the scope of leassons 1 to 8. This is a different solution for the assigment.</strong></p>
  
  <h2>Vehicle.java</h2>
  <p>Use the Vehicle class from the solution for Assignment 1.</p>
  
  <h2>Customer.java</h2>
  <p>The Customer class has the following instance variables: firstName, lastName, driversLicense, address, phoneNumber.<br />
Provide a default constructor. The overloaded constructor will receive data to initialize all the instance variables listed above.
The class provides both accessor and mutator methods for each instance variable, and also a method
that returns the full name. The first letter of each name component must be uppercase and the rest of
the letters must be lowercase, no matter how the names are passed to the constructor.<br />
You must ensure that firstName, lastName, address and driversLicense fields are not
null and are at least one character in length, otherwise the fields will not be “mutated”.</p>
  
  <h2>PurchaseDate.java</h2>
  <p>
  The PurcahseDate class has the following instance variables: year, month, day. <br />
  The constructor looks like this: public PurchaseDate(int theYear, int theMonth, int theDay).<br />
  The constructor must ensure:
  </p>
  <ul>
  <li>that the year is no later than CURRENT_YEAR</li>
  <li>that months are JANUARY (1) to DECEMBER (12)</li>
  <li>and that days are FIRST_DAY (1) to LAST_DAY (31).</li>
  </ul>
  <p>
Use constants. If any of the parameters passed to the constructor are incorrect, use CURRENT_YEAR,
JANUARY, and FIRST_DAY as the default settings. Do not worry about months with fewer than 31
days.
Provide both accessor and mutator methods for every instance variable, and also a method that returns
the full date as a String in the exact format of yyyy-mm-dd (for example 2016-03-30).
The mutator methods must ensure that the year is no later than CURRENT_YEAR, that months are
JANUARY to DECEMBER and that days are FIRST_DAY to LAST_DAY; otherwise the fields will not
be “mutated”.
  </p>
  
  
  
  <h2>VehiclePurchase.java</h2>
  <p>
  The VehiclePurchase class has the following definitions for instance variables:<br />
private Customer customer<br />
private PurchaseDate purchaseDate<br />
private Vehicle vehiclePurchased<br />
private boolean servicePackage<br />
public static final double SERVICE_FEE = 500.00<br /><br />
The single VehiclePurchase constructor looks like this:<br />
public VehiclePurchase(Customer renter,
PurchaseDate purchaseDate, Vehicle vehiclePurchased,
boolean servicePackage)
  </p>

  <p>
Provide accessor methods for each instance variable in the class. Note that the accessors for
customer, purchaseDate and vehiclePurchased will return the relevant reference types.
There should be NO mutator methods for customer, purchaseDate or vehiclePurchased.
Provide a mutator method for servicePackage.
Provide the method calculatePurchasePrice(double purchasePrice) that first uses
the existing Vehicle method to validate the parameter. If the servicePackage field is true then
the SERVICE_FEE is added to the parameter and the Vehicle sellingPrice is reset to the new
value.
  </p>
  <p>
Provide a method named displayDetails() that displays all information to the console for a purchase agreement, eg: <br /><br />
Customer: Darby Dog<br />
Purchase Date: 2014-05-20<br />
Vehicle Description: Jalopies Are Us Vehicle Summary:<br />
Vehicle: 1974 Chevrolet Monte Carlo<br />
Stock Code:1974CevMC<br />
Dealer Cost: $250.00<br />
Selling Price: $895.95<br />
Profit Margin: 72%<br />
Dollar Profit: $645.95<br />
SERVICE PACKAGE INCLUDED<br />
  </p>
  
</section>
