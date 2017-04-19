/**
 * @author Timoteo Shockness
 * @version 1.0.0
 *
 */
public class Driver {

	/**
	 * @param string[] args
	 */
	public static void main(String[] args) {
		Driver.run();

	}
	
	public static void run()
	{
		//creating 2 people - 1 using overload constructor and another using default
		Person tim = new Person("Timoteo", "Shockness", 28, 1.82);
		Person grandma = new Person();
		grandma.setFirstName("Alcina");
		grandma.setLastName("Farias");
		grandma.setAge(78);
		grandma.setHeight(1.65);
		
		//Testing Methods
		System.out.println("Person info:");
		System.out.format("Name: %s %s \nAge: %d \nHeight: %f \n", tim.getFirstName(), tim.getLastName(), tim.getAge(), tim.getHeight());
		System.out.println("Is he/she old? " + tim.isOld());
		System.out.println("Is he/she Tall? " + tim.isTall());

		//Separator
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
		
		//Testing for 2nd Person
		System.out.println("Person info:");
		System.out.format("Name: %s %s \nAge: %d \nHeight: %f \n", grandma.getFirstName(), grandma.getLastName(), grandma.getAge(), grandma.getHeight());
		System.out.println("Is he/she old? " + grandma.isOld());
		System.out.println("Is he/she Tall? " + grandma.isTall());
	}

}
