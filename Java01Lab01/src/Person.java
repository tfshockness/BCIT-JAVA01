/**
 * 
 */

/**
 * @author Timoteo Shockness
 * @version 2.0.0
 *
 */
public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private double height;
	
	/**
	 * Default constructor
	 */
	public Person() {
	}
	
	/**
	 * Overload Constructor
	 */
	
	public Person(String firstName, String lastName, int age, double height)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setHeight(height);
	}
	
	/**
	 * Check if the person is older than 60
	 * @param int age
	 * @return boolean
	 */
	public boolean isOld()
	{
		if(this.age > 60){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * check if the person is taller than 180
	 * @param double height
	 * @return boolean
	 */
	public boolean isTall()
	{
		if(this.height > 180){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * @return String firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param String firstName 
	 * @return void
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return String lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param String lastName
	 * @return void
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return int age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param int age
	 * @return void
	 */
	public void setAge(int age) {
		if(age <= 0){
			this.age = 1;
		}else{
			this.age = age;
		}
		
	}

	/**
	 * @return double height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param double height
	 * @return void
	 */
	public void setHeight(double height) {
		if(height <=0){
			this.height = 1;
		}
		else{
		this.height = height;
		}
	}

}
