package OOPs_Inheritance;

public class Car extends Vehicle {
	
	
	/**Final Keyword used to:
	 * 1. provide constant variables
	 * 2. prevent method overriding
	 * 3.prevent Inheritance
	 * 
	 */
	
	String name;
	static int wheels=4;
	
	public static void price() {
		System.out.println("Car-----Price");
	}

	public void start()
	{	
		System.out.println("Car----start");
	}
	
	public void stop()
	{	
		System.out.println("Car----stop");
	}
	
	public void refuel()
	{	
		System.out.println("Car----refuel");
	}
	
	
	
}
