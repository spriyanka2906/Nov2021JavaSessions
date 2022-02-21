package OOPsConcepts;

public class Car {

	//Class Properties: Class variables/Global variables
	
	//String name = "Honda"; //Bad practice to declare like this
	String name;
	int price;
	String color;
	String model;
	
	
	public static void main(String[] args) {
		
//		String name="Naveen"; //local variable
//		System.out.println(name);

		//to access class vars/properties, you ahve to create a object of the class
		//use "new" keyword
		
		Car c=new Car();
		c.name="BMW";
		c.price=70;
		c.color="Black";
		c.model="520d";
		
		System.out.println(c.name + " " + c.price + " " + c.color + " " + c.model);
		
		Car c1=new Car();
		System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + c1.model);
		
		Car c2=new Car();
		c2.name="Audi";
		c2.model="Q5";
		
		System.out.println(c2.name + " " + c2.price + " " + c2.color + " " + c2.model);
		
		
		
		
		
	}
	
}
