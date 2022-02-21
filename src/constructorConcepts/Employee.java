package constructorConcepts;

public class Employee {

	//Constructor--construct an object
	String name;
	int age;
	String empId;
	String dept;
	
	//1.Constructor name will remain same as the class name
	//2. It will not have any return type--- no void/no return statement
	//3. Looks like a function but not a function
	//4. Overloading is possible
	//5. Constructors are only for initialization
	//6. Default Constructor..... depends one use case... N number of Objects.....
			//Example: Launch the browser n number of times
	
	
	/** ..................Constructor vs Functions.......................................
	 * 1. Constructor name will remain same...but functions name can be anything
	 * 2. Constructor will never have any return type but function may or may not have return type 
	 * 3. Constructor will be called when you create Objects but functions will be called with Object reference
	 * 4. Constructor will help to create Object of the class, we can restrict unnecessary Object creation
	 * 5. Function should have Business Logic, should define feature of the class, but constructor should not have any Business Logic
	 */
	
	public Employee() {
		System.out.println("This is my default constructor"); // Zero parameter constructor
		
	}
	
	public Employee(int i) { //1 param
		System.out.println("1 param constructor " + i);
	}
	
	public Employee(int i,String p) {//2 params
		System.out.println("2 params constructor " + i+p);
	}
	
	public static void main(String[] args) {
		
		//7. Constructor will be called when you create the Object
		
		Employee emp=new Employee();
		
		Employee emp1=new Employee(10);
		Employee emp2=new Employee(10, "test");
		
		
		
		
	}

}
