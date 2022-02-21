package OOPs_Inheritance;

public class BMW extends Car{
	
	//Method Overriding:   -----Poly + Morphism---> Dynamic (Runtime)
	// when you have same method in parent class and in child class with :
	/**1. same name 
	 * 2. same number of parameters
	 * 3. same type of parameters
	 * 4.same return type
	 * 5.private methods cannot be overridden
	 * 6. static methods cannot be overridden-- this concept is known as Method Hiding
	 */
	
	@Override
	public void start() {
		
		System.out.println("BMW.........Start");
	}
	
	public void autoParking() {
		System.out.println("BMW----Auto Parking");
	}
	
	//@Override-----Method hiding
	public static void price() {
		System.out.println("BMW-----Price");
	}
	
}
