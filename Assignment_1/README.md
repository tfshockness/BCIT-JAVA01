<section>
  <h1>Assignment 1</h1>
    <p>The purpose of this assignment is to exercise your knowledge from lessons 1 - 5.
    Your client “Jalopies Are Us" is a small used car lot that is looking to expand their business. They have
    asked you to develop a system that tracks their auto sales. Your task is to start by developing a Vehicle
    class that will hold all data as it pertains to any vehicle they have on their lot. The second and third
    stage of the project will see additional features added.</p>
    <h2>Vehicle.java</h2>
    <p>The Vehicle class has the following instance variables.
    • stockCode, make, model, year, dealerCost, sellingPrice,
    profitMargin</p>
    <h2>Constructors</h2>
    <p>Create a default constructor. The default values are up to you.
Create an overloaded constructor that has parameters for stockCode, make, model and year. Do
not provide constructor parameters for any of the other fields. The constructor must check that the year
parameter must be between 1970 and 2016. If invalid, then this constructor will use the default value
for that field.</p>
<h2>Methods</h2>
<p>For all fields in the class, provide accessor methods that return the value of the field. These methods
must be named to start with “get”, eg. getStockCode().</p>
<p>Provide mutator methods for stockCode, make, model and year that set the value for each field.
These mutator for year must use the same validation as required in the constructor. If a year is not
valid the field will remain unchanged and an error message is displayed. These methods must be named
to start with “set”, eg. setStockCode().</p>
<p>
Provide a method called setDealerCost(data_type). This mutator method takes a parameter
that specifies the value the dealer paid to purchase a jalopy from the scrap dealer and assigns it to the
dealerCost field. The value must not be negative.</p>
<p>Provide a method called checkStandardSellingPrice(data_type). This mutator method
guarantees the selling price is at least 25% higher than dealerCost, and assigns the value to the
sellingPrice field. If the parameter value is rejected be sure to display a message to the user that
includes both the dealerCost and sellingPrice.</p>
<p>
Provide another method called setSellingPrice(data_type). This mutator method guarantees
the selling price is not less than 0, and assigns the value to the sellingPrice field.
Provide a method called calculateProfitMargin(). This mutator calculates the profit made on
selling a vehicle as a percentage. It also assigns the value to the profitMargin field. To calculate
the profit margin use the following formula: <strong>profitMargin = (sellingPrice - dealerCost) / sellingPrice</strong></p>
<p>Provide a method called calculateProfit(). This method calculates and returns the profit made
on selling a vehicle as a dollar value.</p>
<p>Provide a method called printDetails(). This method displays item information on the screen,
and should be formatted as below:</p>
<p>
Jalopies Are Us Vehicle Summary: <br />
Vehicle: 1974 Chevrolet Monte Carlo <br />
Stock Code: 1974ChevMC <br />
Dealer Cost: $250.00 <br />
Selling Price: $395.95 <br />
Profit Margin: 37%<br />
Dollar Profit: $145.95<br />
</p>

</section>











