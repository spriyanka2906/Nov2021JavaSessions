package OOPs_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.start();//Overridden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		b.engine();//inherited
		b.name="520d";
		System.out.println(b.name);
		System.out.println(Car.wheels);
		System.out.println(BMW.wheels);//---can be accessed by child class name as it extends Car parent class 
		//System.out.println(b.wheels);---- allowed but not a good practice to call static variables with reference name-- should be accessed by class name
		
		BMW.price();
		Car.price();
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		//reference type check applied here
		//c.autoParking(); //strictly not allowed
		
		//Top Casting
		//Child class object can be referred by parent class reference variable------
		//individual methods of child class cannot be accessed via parent class reference
		Car c1=new BMW();
		c1.start();
		c1.start();
		c1.refuel();
		//c1.autoParking();//reference type check applied here
		c1.engine();
		
		
		
		Car c2=new Audi();
		c2.start();
		c2.start();
		c2.refuel();
		//c2.theftSafety();
		
		Audi au=new Audi();
		au.engine();
		au.theftSafety();
		au.start();
		au.stop();
		au.refuel();
		
		//Child class object can be referred by grand-parent class reference variable------
		Vehicle v1=new BMW();
		v1.engine();
//		v1.start();//reference type check applied here
//		v1.stop();//reference type check applied here
//		v1.refuel();//reference type check applied here
//		v1.autoParking();//reference type check applied here
		
		//Siblings
		
		
		
		
		
		//down casting
		//Parent class object can be referred by child class reference variable
		//BMW b1=new Car(); not allowed at compile time, it gives error
		
		//At compile time ---allowed
		//BMW b1=(BMW)new Car(); // ClassCastException---- at runtime
				
		//At compile time--- allowed
		//BMW b2=(BMW)new Vehicle();// ClassCastException---- at runtime
		

	}

}
