package constructorConcepts;

public class ConstructorCalling {
	
	String name;
	int age;
	double salary;

	public ConstructorCalling(String name) {
		this.name = name;
	}

	public ConstructorCalling(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}


	public ConstructorCalling(String name, int age, double salary) {
		//super();
		this("Naveen");
		//this.name = name;
		this.age = age;
		this.salary = salary;
		
		//this("Naveen"); // it should be the first statement in the block
	}

	public ConstructorCalling(int age, double salary) {
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {
		ConstructorCalling obj=new ConstructorCalling("Tom", 20, 23.33);
		System.out.println(obj.name);
	}

}
