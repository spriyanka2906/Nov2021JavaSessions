package Finalizemethod;

public class Employee {

	String name;
	
	public static void main(String[] args) {
	
		Employee e=new Employee();
		e=null;
		
		Company c=new Company(); //It wont execute finalize() after gc() as we havent overrides it in Comapny class
		c=null;
		System.gc();

		//e.name="Tom";
		
		//System.out.println(e.name);
		System.out.println("This is Emp class....");
	}

	//finalize() is in Object class which is extended by each and every class in Java
	//JVM will call this method by default before gc() is called
	@Override
	public void finalize() {
		System.out.println("Inside finalize method....");
	}
	
}
