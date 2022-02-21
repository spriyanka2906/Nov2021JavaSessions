package OOP_Interfaces;

public interface USMedical extends Medical {
	
	int main_fee=100;
	//variables are static and final  by default
	
	
	//No method body---only method declaration
	//only method prototype
	//Only abstract method: no body
	//can not create the object of interface
	//can not have static abstract----non static methods.
	//100% abstraction before jdk 1.8

	public  void physioServices();
	
	public void cardioServices();
	
	public void oncologyServices();
	
	public void emergencyServices();
	
	//changes in java after jdk 1.8:
	 // 1.can have static method with method body
	 
	public static void billing() {
		System.out.println("USMedical---billing");
	}
	
	//2.can have non static default methods---breaking the concept of Interface---its a big change
	default void opdServices() {
		System.out.println("US medical-----OPt");
	}
	
	
	
	
}
