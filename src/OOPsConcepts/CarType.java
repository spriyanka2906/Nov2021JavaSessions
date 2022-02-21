package OOPsConcepts;

public class CarType {
	String name;
	int price;
	String color;
	static int wheels=4;
	
	public static void start() {
		
		System.out.println("Car---Start");
	}
	
	public void stop() {
		System.out.println("Car---Stop");
	}
	
	public static void main(String[] args) {
		
		CarType	c1=new CarType();
		c1.name="BMW";
		c1.price=70;
		c1.color="Black";
		System.out.println(c1.name);
		System.out.println(CarType.wheels);//it should be accessed in a static way
		
		//how to access static var:
		//1.access directly
		System.out.println(wheels);
		
		//2. access via classname
		System.out.println(CarType.wheels);
		
		
		//how to access static method
		//1. Call them directly
		start();
		c1.stop();
		
		//2.call them by using classname
		CarType.start();
		
		CarType	c2=new CarType();
		c2.name="Audi";
		c2.price=60;
		c2.color="Red";
		System.out.println(CarType.wheels);
		
		CarType	c3=new CarType();
		c3.name="Honda";
		c3.price=20;
		c3.color="Black";
		System.out.println(CarType.wheels);

	}

}
