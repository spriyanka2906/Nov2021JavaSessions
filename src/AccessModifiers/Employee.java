package AccessModifiers;

public class Employee {
	
	public String name;
	private int salary;
	String city;
	protected String dob;
		
	public static void main(String[] args) {
	
		Employee e=new Employee();
		e.name="Tom";
		e.salary=10;
		e.city="LA";
		e.dob="12 jan";

	}

}
